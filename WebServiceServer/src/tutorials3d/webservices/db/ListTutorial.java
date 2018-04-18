package tutorials3d.webservices.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tutorials3d.webservices.core.Tutorial;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
public class ListTutorial {
	private static TutorialInterface instance = new ListTutorial();

    public static TutorialInterface instance() {
        return instance;
    }

    private List<Tutorial> tutorials  = Collections.synchronizedList(new ArrayList<>());
    private int nextId = 1;

    private ListBookDAO() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#getBooks()
     */
    @Override
    public List<Book> getBooks() {
        return books;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#findBookById(java.lang.String)
     */
    @Override
    public Book findBookById(int id) {
        return books.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#findBookByISBN(java.lang.String)
     */
    @Override
    public Book findBookByISBN(String isbn) {
        return books.stream().filter(o -> o.getISBN().equals(isbn)).findFirst().orElse(null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#addBook(ro.h23.bookmanager.core.Book)
     */
    @Override
    public boolean addBook(Book book) {
        if (findBookByISBN(book.getISBN()) != null) {
            return false;
        }
        if (book.getId() != Book.MISSING_ID) {
            // if the book is already in the db
            if (findBookById(book.getId()) != null) {
                return false;
            } else {
                // next line avoids having books with the same id in the db
                nextId = Math.max(book.getId() + 1, nextId);
            }
        } else {
            book.setId(nextId++);
        }
        books.add(book);
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#updateBook(ro.h23.bookmanager.core.Book)
     */
    @Override
    public boolean updateBook(String isbn, Book newBook) {
        boolean found = false;
        for (int i = 0; i < books.size(); ++i) {
            Book b = books.get(i);
            if (isbn.equals(b.getISBN()) && newBook.getISBN().equals(b.getISBN()) && 
                    (newBook.getId() == Book.MISSING_ID || newBook.getId() == b.getId())) {
                // replace the book
                newBook.setId(b.getId());
                books.set(i, newBook);
                found = true;
                break;
            }
        }
        return found;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ro.h23.bookmanager.core.BookDAO#deleteBook(ro.h23.bookmanager.core.Book)
     */
    @Override
    public boolean deleteBook(Book book) {
        boolean found = false;
        for (int i = 0; i < books.size(); ++i) {
            Book b = books.get(i);
            if (book.getISBN().equals(b.getISBN()) && (book.getId() == Book.MISSING_ID || book.getId() == b.getId())) {
                // delete the book
                books.remove(i);
                found = true;
                break;
            }
        }
        return found;
    }

    /* (non-Javadoc)
     * @see ro.h23.bookmanager.core.BookDAO#deleteBookByISBN(java.lang.String)
     */
    @Override
    public boolean deleteBookByISBN(String isbn) {
        boolean found = false;
        for (int i = 0; i < books.size(); ++i) {
            Book b = books.get(i);
            if (isbn.equals(b.getISBN())) {
                // delete the book
                books.remove(i);
                found = true;
                break;
            }
        }
        return found;
    }
}
