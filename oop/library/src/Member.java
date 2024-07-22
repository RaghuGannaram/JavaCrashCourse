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
        borrowedBooks = new ArrayList<>();
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(getName() + " borrowed " + book.getTitle());
    }

    // Method to return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(getName() + " returned " + book.getTitle());
    }

    @Override
    public void performRole() {
        System.out.println(getName() + " is a member of the library.");
    }

    // Getters
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
