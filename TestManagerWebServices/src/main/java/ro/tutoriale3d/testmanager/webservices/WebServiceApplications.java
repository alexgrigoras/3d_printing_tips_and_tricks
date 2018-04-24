package ro.tutoriale3d.testmanager.webservices;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
//adnotarea ApplicationPath specifica calea URL spre serviciile web
//e.g., @ApplicationPath("api") => http://localhost:5003/WebServiceServer/api/
@ApplicationPath("api")
public class WebServiceApplications extends Application {

}