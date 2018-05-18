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
 * Servlet implementation class TestModifyServlet
 */
@WebServlet("/TestModifyServlet")
public class TestModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestModifyServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    PrintWriter pw = response.getWriter();

        ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());
		
		String parameter = request.getParameter("id");

		// api  -> numele specificat in fisierul web.xml de la server in interiorul tag-ului url-pattern
		// tutorials -> numele specificat in fisierul Tutorials.java la adnotarea @Path

		pw.append("<section class = first_container>\r\n" + 
				"\r\n" + 
				"    <h2 align='center'>Adaugare Intrebare Test</h2>\r\n" + 
				"    <br/>\r\n" + 
				"\r\n" + 
				"    <article class = \"form_container\">\r\n" + 
				"        <form name=\"contactform\" method=\"put\" action=\"http://localhost:5003/TestManagerWebServices/api/tests\"" + 
				"            <br/>\r\n" + 
				"            <label for=\"first_name\">Nr. Intrebare: <span style=\"color:red\">*</span></label><br/>\r\n" + 
				"            <input  type=\"text\" name=\"Nr_intrebare\" maxlength=\"500\" size=\"30\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"            <label for=\"first_name\">Enunt: <span style=\"color:red\">*</span></label><br/>\r\n" + 
				"            <input  type=\"text\" name=\"Enunt\" maxlength=\"500\" size=\"30\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"            <label for=\"last_name\">Raspuns 1: <span style=\"color:red\">*</span></label><br/>\r\n" + 
				"            <input  type=\"text\" name=\"Rasp1\" maxlength=\"500\" size=\"30\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"            <label for=\"last_name\">Raspuns 2: <span style=\"color:red\">*</span></label><br/>\r\n" + 
				"            <input  type=\"text\" name=\"Rasp2\" maxlength=\"500\" size=\"30\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"            <label for=\"last_name\">Raspuns 3: <span style=\"color:red\">*</span></label><br/>\r\n" + 
				"            <input  type=\"text\" name=\"Rasp3\" maxlength=\"500\" size=\"30\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"            <label for=\"last_name\">Raspuns 4: <span style=\"color:red\">*</span></label><br/>\r\n" + 
				"            <input  type=\"text\" name=\"Rasp4\" maxlength=\"500\" size=\"30\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"            <label for=\"last_name\">Solutie: <span style=\"color:red\">*</span></label><br/>\r\n" + 
				"            <input  type=\"text\" name=\"Solutie\" maxlength=\"500\" size=\"30\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"            <input type=\"submit\" value=\"Submit\">\r\n" + 
				"            <br/><br/>\r\n" + 
				"        </form>\r\n" + 
				"    </article>\r\n" + 
				"\r\n" + 
				"</section>");
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
