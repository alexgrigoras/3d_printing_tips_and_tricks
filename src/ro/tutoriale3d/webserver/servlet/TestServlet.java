package ro.tutoriale3d.webserver.servlet;

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

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URI;
import java.util.Enumeration;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParsingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

/**
 * Servlet implementation class TestServlet abcd
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    PrintWriter pw = response.getWriter();
	    pw.append("<h1>Exemplu de servlet</h1>");
        pw.append("Context path: ").append(request.getContextPath()).append("<br/>");
        pw.append("Request URI: ").append(request.getRequestURI()).append("<br/>");
        pw.append("Parameter map: ").append(request.getParameterMap().toString()).append("<br/>");
        request.setAttribute("UnAtribut", Math.random());
        pw.append("Attributes: ").append("<br/>");
        Enumeration<String> attributeNames =  request.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String attr = attributeNames.nextElement();
            pw.append("- ").append(attr).append(": ").append(request.getAttribute(attr).toString()).append("<br/>");
        }
        
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
			
			for (JsonObject result : results.getValuesAs(JsonObject.class)) {
				pw.append("Nr_intrebare: " + result.getInt("nr_intrebare")).append("<br/>");
				pw.append("Enunt: " + result.getString("enunt")).append("<br/>");
				pw.append("Raspuns1: " + result.getString("rasp1")).append("<br/>");
				pw.append("Raspuns2: " + result.getString("rasp2")).append("<br/>");
				pw.append("Raspuns3: " + result.getString("rasp3")).append("<br/>");
				pw.append("Raspuns4: " + result.getString("rasp4")).append("<br/>");
				pw.append("Solutie: " + result.getString("solutie")).append("<br/>");
			}
	         			
		} catch (JsonParsingException e) {
			 System.out.println("Json not valid!");
		} catch (ClassCastException e) {
			 System.out.println("Class cast exception!");
		} catch (NullPointerException e) {
			 System.out.println("Column name not valid!");
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:5003/TestManagerWebServices/").build();
	}
}
