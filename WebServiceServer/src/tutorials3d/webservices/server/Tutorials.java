package tutorials3d.webservices.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
// adnotarea Path specifica calea relativa spre un anumit serviciu web
// e.g., @ApplicationPath("api") + @Path("/tutorials") => http://localhost:5003/WebServiceServer/api/tutorials
// in aceasta situatie se va apela una din metodele clasei Hello, in functie de tipul media (text/plain, text/xml sau text/html)
@Path("/tutorials")
public class Tutorials {

	// Metoda apelata daca tipul media cerut este TEXT_PLAIN
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}

	// Metoda apelata daca tipul media cerut este XML
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}

	// Metoda apelata daca tipul media cerut este HTML
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
				+ "<body><h1>" + "Hello Jersey" + "</h1></body>" + "</html> ";
	}

}