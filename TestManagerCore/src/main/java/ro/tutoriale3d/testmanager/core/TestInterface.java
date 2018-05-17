package ro.tutoriale3d.testmanager.core;

import java.util.List;

import javax.xml.ws.Response;

import ro.tutoriale3d.testmanager.core.Test;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
public interface TestInterface {
	
	List<Utilizator> getUtilizatorList();
	
	List<Test> getTestList();
	
	List<Test> getTestListID(String id_test);
	
	/**
     * 
     * @param tutorial is updated with the id inside this method
     * @return <code>true</code> if the tutorial was added successfully, <code>false</code> if the tutorial already exists
     */
    boolean addTest(Test test);
    
    boolean deleteTest(Test test);

}
