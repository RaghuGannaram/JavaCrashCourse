package oop.library.src;

/* 
 * Book class : Represents a book in the library
 * 
 * Fields: title, author, isbn
 * Methods: getters for title, author, isbn
 * 
 * Constructors: parameterized constructor to initialize the fields
 * 
 * OOP Concepts: Encapsulation
 * Encapsulation: Private attributes with public getters and setters
 * 
 * Note: This class is used to represent a book in the library.
 *       It has private fields and public getters to access the book details.
 * 
*/

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }
}
