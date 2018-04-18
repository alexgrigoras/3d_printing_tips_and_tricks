package tutorials3d.webservices.server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//adnotarea ApplicationPath specifica calea URL spre serviciile web
//e.g., @ApplicationPath("api") => http://localhost:5003/WebServiceServer/api/
@ApplicationPath("api")
public class WebServiceApplications extends Application {

}