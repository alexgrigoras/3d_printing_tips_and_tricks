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
 * @from desktop-PC
 * @created 17 feb 2018
 * @version 1.0
 */
public class JavaClient {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		// rest  -> numele specificat in fisierul web.xml de la server in interiorul tag-ului url-pattern
		// hello -> numele specificat in fisierul Hello.java la adnotarea @Path
		System.out.println(target.path("api").path("tutorials").request()
			.accept(MediaType.TEXT_PLAIN).get(Response.class).toString());

		System.out.println(target.path("api").path("tutorials").request()
			.accept(MediaType.TEXT_PLAIN).get(String.class));

		System.out.println(target.path("api").path("tutorials").request()
			.accept(MediaType.TEXT_XML).get(String.class));

		System.out.println(target.path("api").path("tutorials").request()
			.accept(MediaType.TEXT_HTML).get(String.class));
		
		System.out.println(target.path("api").path("tutorials").request()
				.accept(MediaType.APPLICATION_JSON).get(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:5003/WebServiceServer").build();
	}
}