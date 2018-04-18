package tutorials3d.webservices.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tutorials3d.webservices.core.Tutorial;
import tutorials3d.webservices.core.TutorialInterface;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
public class ListTutorial implements TutorialInterface{
	private static TutorialInterface instance = new ListTutorial();

    public static TutorialInterface instance() {
        return instance;
    }

    private List<Tutorial> tutorials  = Collections.synchronizedList(new ArrayList<>());
    private int nextId = 1;

    private ListTutorial() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#getBooks()
     */
    @Override
    public List<Tutorial> getTutorial() {
        return tutorials;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#findBookById(java.lang.String)
     */
    @Override
    public Tutorial findTutorialById(int id) {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#addBook(ro.h23.bookmanager.core.Book)
     */
    @Override
    public boolean addTutorial(Tutorial tutorial) {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#deleteBook(ro.h23.bookmanager.core.Book)
     */
    @Override
    public boolean deleteTutorial(Tutorial tutorial) {
        return true;
    }
    
}
