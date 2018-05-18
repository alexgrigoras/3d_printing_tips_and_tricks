package ro.tutoriale3d.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.StringReader;
import java.net.URI;
import java.awt.event.ActionEvent;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParsingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.TextArea;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 528, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(29, 10, 440, 385);
		frame.getContentPane().add(textArea);
		
		textArea.setText("Test 1\r\n");
		
	
		JButton btnGetTutorial = new JButton("Get Tutorial");
		btnGetTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientConfig config = new ClientConfig();
				Client client = ClientBuilder.newClient(config);
				
				WebTarget target=client.target(getBaseURI());
				
				String jsonString = target.path("api").path("tests").path("1").request().accept(MediaType.APPLICATION_JSON).get(String.class);
				
				//textArea.setText(jsonString);
				
				jsonString = "{\"Intrebari\":" + jsonString + "}";
				
				try {
					JsonReader rdr = Json.createReader(new StringReader(jsonString));
					JsonObject obj = rdr.readObject();
					JsonArray results = obj.getJsonArray("Intrebari");
					
					//textArea.append("\nResults:" + results);
					
					for (JsonObject result : results.getValuesAs(JsonObject.class)) {
				        textArea.append("\nNr_intrebare: " + result.getInt("nr_intrebare"));
				        textArea.append("Enunt: " + result.getString("enunt"));
				        textArea.append("\nRaspuns1: " + result.getString("rasp1"));
				        textArea.append("\nRaspuns2: " + result.getString("rasp2"));
				        textArea.append("\nRaspuns3: " + result.getString("rasp3"));
				        textArea.append("\nRaspuns4: " + result.getString("rasp4"));
				        textArea.append("\nSolutie: " + result.getString("solutie"));
					}
			         			
				} catch (JsonParsingException e) {
					 textArea.append("\nJson not valid!");
				} catch (ClassCastException e) {
					 textArea.append("\nClass cast exception!");
				} catch (NullPointerException e) {
					 textArea.append("\nColumn name not valid!");
				} 
			}
		});
		btnGetTutorial.setBounds(175, 428, 174, 25);
		frame.getContentPane().add(btnGetTutorial);
		
	
		
	}
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://192.168.0.138:5003/TestManagerWebServices/").build();
	}
}
