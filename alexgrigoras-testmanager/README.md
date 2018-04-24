# README #

## What is this repository for? ##

### Quick summary ###
Example of an application for book management using REST web services.

### WARNING ###

**Change the URI in the `BookManagerClient` class from `http://localhost:5678/BookManagerWebServices/` to the URI of the server running the `BookManagerWebServices` application.**

### Version ###
1.0 beta

### Requirements ###

 * Java SE Development Kit 8
 * Apache Tomcat 8.5
 * Eclipse IDE for Java EE Developers Oxygen 2
 * Maven

### Details ###
There are two situations for each of the five HTTP methods (i.e., `GET`, `POST`, `PUT`, `DELETE` and `PATCH`) used by the REST web services:

* the requested resource represents a collection (i.e., `/api/books`)
* the requested resource represents an element from a collection (i.e., `/api/books/9786065796553`)

HTTP method | `/api/books`           | `/api/books/9786065796553`
----------- | ---------------------------------- | --------------------------------------
`GET`       | *Returns all the books*              | *Returns a book based on ISBN*
`POST`      | *Adds a book to the collection*      | N/A (Not generally used!)
`PUT`       | N/A (Replaces the book collection) | *Replaces a book*
`DELETE`    | N/A (Deletes the book collection)  | *Deletes a book*
`PATCH`     | N/A (Not generally used!)          | *Changes specific book properties*

The repository contains the BookManager Maven project which has three modules:

* `BookManagerCore` - contains the common classes used by the other two modules
    + `ro.h23.bookmanager.core.Book` - class having the book information
    + `ro.h23.bookmanager.core.BookDAO` - interface having the methods necessary to manage the book collection
* `BookManagerWebServices` - contains the book web service
    + `ro.h23.bookmanager.db.ListBookDAO` - class that implements BookDAO and uses a simple Book list as data model (List<Book>)
    + `ro.h23.bookmanager.webservices.MyApplication` - class used to specify the ApplicationPath for the web services (i.e., /api)
    + `ro.h23.bookmanager.webservices.BooksResource` - class that responds to the requests received by the web service /api/books
* `BookManagerClient` - contains an example of a simple application that uses the created web services
    + `ro.h23.bookmanager.client.BookManagerClient` - tests the created web services by making requests using different HTTP methods



