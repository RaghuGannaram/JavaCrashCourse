package oop.library.src;

import java.util.List;
import java.util.ArrayList;

/*
 * Member class : Represents a member in the library
 * 
 * Fields: borrowedBooks
 * Methods: borrowBook, returnBook, getBorrowedBooks
 * 
 * Constructors: parameterized constructor to initialize the fields
 * 
 * OOP Concepts: Inheritance
 * Inheritance: Member extends Person
 * 
 * Note: This class is used to represent a member in the library.
 *       It has a list of borrowed books and methods to borrow and return books.
 * 
 */

public class Member extends Person {
    private List<Book> borrowedBooks;

    public Member(String name, String id) {
        super(name, id);
        this.borrowedBooks = new ArrayList<>();
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
        System.out.println(this.getName() + " borrowed " + book.getTitle());
    }

    // Method to return a book
    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
        System.out.println(this.getName() + " returned " + book.getTitle());
    }

    @Override
    public void performRole() {
        System.out.println(this.getName() + " is a member of the library.");
    }

    // Getters
    public List<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }
}
