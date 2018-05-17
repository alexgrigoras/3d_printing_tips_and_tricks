/*
 * Copyright (C) 2018 Adrian Alexandrescu. All rights reserved.
 * ADRIAN ALEXANDRESCU PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * See <license.txt> for more details.
 */
package ro.tutoriale3d.testmanager.webservices;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import ro.tutoriale3d.testmanager.core.Test;
import ro.tutoriale3d.testmanager.db.DBManager;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
// e.g., @ApplicationPath("api") + @Path("/tests") =>
// http://localhost:5003/TestManagerWebServices/api/tests
@Path("/tests")
public class TestResource {

	// Metoda apelata daca tipul media cerut este HTML
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTML() {
		
		return "aaaaaaa";
	}
	

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Test> getTestList() {		
		return DBManager.getInstance().getTestList();
	}
	
	@GET
	@Path("{id_test}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Test> getTestListID(@PathParam("id_test") String id_test) {		
		return DBManager.getInstance().getTestListID(id_test);
	}
	
	@POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response postTest(@Context UriInfo uriInfo, Test test) {
		return null;
	}
	
	@PUT
    public Response putBooks(List<Test> test) {
        //In this context having this method makes no sense, because usually one does not replace the entire book collection
        return Response.status(Status.METHOD_NOT_ALLOWED).allow("GET", "POST").build();
    }
	
	@DELETE
    public Response deleteBooks() {
        return Response.status(Status.METHOD_NOT_ALLOWED).allow("GET", "POST").build();
    }
}