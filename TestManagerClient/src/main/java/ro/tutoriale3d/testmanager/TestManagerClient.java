package ro.tutoriale3d.testmanager;

import java.io.StringReader;
import java.net.URI;

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

/**
 * @author alexgrigoras
 * @from alexPC
 * @created 17 feb 2018
 * @version 1.0
 */
public class TestManagerClient {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		// api  -> numele specificat in fisierul web.xml de la server in interiorul tag-ului url-pattern
		// tutorials -> numele specificat in fisierul Tutorials.java la adnotarea @Path

		String jsonString = target.path("api").path("tests").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		jsonString = "{\"Intrebari\":" + jsonString + "}";
		
		try {
			JsonReader rdr = Json.createReader(new StringReader(jsonString));
			JsonObject obj = rdr.readObject();
			JsonArray results = obj.getJsonArray("Intrebari");
			
			System.out.println("Results:" + results);
			
			for (JsonObject result : results.getValuesAs(JsonObject.class)) {
		        System.out.println("Nr_intrebare: " + result.getInt("nr_intrebare"));
		        System.out.println("Enunt: " + result.getString("enunt"));
		        System.out.println("Raspuns1: " + result.getString("rasp1"));
		        System.out.println("Raspuns2: " + result.getString("rasp2"));
		        System.out.println("Raspuns3: " + result.getString("rasp3"));
		        System.out.println("Raspuns4: " + result.getString("rasp4"));
		        System.out.println("Solutie: " + result.getString("solutie"));
			}
	         			
		} catch (JsonParsingException e) {
			 System.out.println("Json not valid!");
		} catch (ClassCastException e) {
			 System.out.println("Class cast exception!");
		} catch (NullPointerException e) {
			 System.out.println("Column name not valid!");
		} 
		
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:5003/TestManagerWebServices/").build();
	}
}