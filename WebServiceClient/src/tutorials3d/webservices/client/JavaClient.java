package tutorials3d.webservices.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

/**
 * @author alexgrigoras
 * @from alexPC
 * @created 17 feb 2018
 * @version 1.0
 */
public class JavaClient {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		// api  -> numele specificat in fisierul web.xml de la server in interiorul tag-ului url-pattern
		// tutorials -> numele specificat in fisierul Tutorials.java la adnotarea @Path

		System.out.println(target.path("api").path("tutorials").request()
				.accept(MediaType.APPLICATION_JSON).get(Response.class).toString());
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:5003/WebServiceServer/").build();
	}
}