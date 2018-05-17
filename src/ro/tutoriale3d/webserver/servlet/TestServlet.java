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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
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
	    /*
	    pw.append("Context parameters: ").append(request.getParameter("id")).append("<br/>");
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
        */
        ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());
		
		String parameter = request.getParameter("id");

		// api  -> numele specificat in fisierul web.xml de la server in interiorul tag-ului url-pattern
		// tutorials -> numele specificat in fisierul Tutorials.java la adnotarea @Path

		String jsonString = target.path("api").path("tests").path(parameter).request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		jsonString = "{\"Intrebari\":" + jsonString + "}";
		
		try {
			JsonReader rdr = Json.createReader(new StringReader(jsonString));
			JsonObject obj = rdr.readObject();
			JsonArray results = obj.getJsonArray("Intrebari");
			
			pw.append("<section class=\"first_container\">");
			pw.append("<h2 align = \"center\">TEST "+ parameter + "</h2>");
			pw.append("<ol class=\"answers\">");
			
			for (JsonObject result : results.getValuesAs(JsonObject.class)) {
		    	pw.append("<li><p class=\"question\">" + result.getString("enunt") + "</p>\n" +
			    		"<div><input type=\"radio\" name=\"q" + result.getInt("nr_intrebare") + "value=\"a\" id=\"q1a\"><label for=\"q1a\">" + result.getString("rasp1") + "</label></div><br/>\n" + 
			    		"<div><input type=\"radio\" name=\"q" + result.getInt("nr_intrebare") + "value=\"b\" id=\"q1b\"><label for=\"q1b\">" + result.getString("rasp2") + "</label></div><br/>\n" + 
			    		"<div><input type=\"radio\" name=\"q" + result.getInt("nr_intrebare") + "value=\"c\" id=\"q1c\"><label for=\"q1c\">" + result.getString("rasp3") + "</label></div><br/>\n" + 
						"<div><input type=\"radio\" name=\"q" + result.getInt("nr_intrebare") + "value=\"d\" id=\"q1d\"><label for=\"q1d\">" + result.getString("rasp4") + "</label></div><br/>\n" +
			    		"</li>");
			}
			
			pw.append("</ol>");
			pw.append("<br/></section><br/><br/><br/><br/>");
	         			
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
