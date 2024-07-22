package oop.library.src;

import java.util.List;
import java.util.ArrayList;



/*
 * Library class : Represents a library
 * 
 * Fields: books, members, transactions
 * Methods: addBook, removeBook, registerMember, recordTransaction
 * 
 * Constructors: default constructor to initialize the lists
 *  
 * OOP Concepts: Composition
 * Composition: Library has a list of books, members, and transactions
 * 
 * Note: This class is used to represent a library.
 *       It has lists of books, members, and transactions.
 *       It has methods to add a book, remove a book, register a member, and record a transaction.
 * 
 */

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Transaction> transactions;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Method to register a new member
    public void registerMember(Member member) {
        members.add(member);
    }

    // Method to record a transaction
    public void recordTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Getters
    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}