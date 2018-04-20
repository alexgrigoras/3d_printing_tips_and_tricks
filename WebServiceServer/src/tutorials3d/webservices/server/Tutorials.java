package tutorials3d.webservices.server;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;
import tutorials3d.webservices.core.Test;
import tutorials3d.webservices.db.*;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
// adnotarea Path specifica calea relativa spre un anumit serviciu web
// e.g., @ApplicationPath("api") + @Path("/tutorials") => http://localhost:5003/WebServiceServer/api/tutorials
@Path("/tutorials")
public class Tutorials {
	// Metoda apelata daca tipul media cerut este HTML
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Test> getTutorialList() {
		
		return DBManager.getInstance().getTutorialList();
	}
	
	@POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response postTutorial(@Context UriInfo uriInfo, Test tutorial) {
		return null;
	}
	
	@PUT
    public Response putBooks(List<Test> tutorial) {
        //In this context having this method makes no sense, because usually one does not replace the entire book collection
        return Response.status(Status.METHOD_NOT_ALLOWED).allow("GET", "POST").build();
    }
	
	@DELETE
    public Response deleteBooks() {
        return Response.status(Status.METHOD_NOT_ALLOWED).allow("GET", "POST").build();
    }
}