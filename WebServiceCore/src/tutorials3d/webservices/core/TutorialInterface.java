package tutorials3d.webservices.core;

import java.util.List;

import javax.ws.rs.core.Response;

import tutorials3d.webservices.core.Tutorial;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
public interface TutorialInterface {
	
	List<Utilizator> getUtilizatorList();
	
	List<Tutorial> getTutorialList();
	
	/**
     * 
     * @param tutorial is updated with the id inside this method
     * @return <code>true</code> if the tutorial was added successfully, <code>false</code> if the tutorial already exists
     */
    boolean postTutorial(Tutorial tutorial);
    
    Response putTutorial(List<Tutorial> tutorial);
    
    boolean deleteTutorial(Tutorial tutorial);

}
