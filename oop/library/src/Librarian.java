package oop.library.src;

/*
 * Librarian class : Represents a librarian in the library
 * 
 * Fields: None
 * Methods: addBook, removeBook, registerMember, recordTransaction
 * 
 * Constructors: parameterized constructor to initialize the fields
 * 
 * OOP Concepts: Inheritance
 * Inheritance: Librarian extends Person
 * 
 * Note: This class is used to represent a librarian in the library.
 *       It has methods to add a book, remove a book, register a member, and record a transaction.
 *       It inherits from the Person class and implements the performRole method.
 * 
 */

public class Librarian extends Person {
    
    public Librarian(String name, String id){
        super(name, id);
    }

    public void addBook(Library library, Book book){
        library.addBook(book);
        System.out.println(this.getName() + " added " + book.getTitle() + " to the library.");
    }

    public void removeBook(Library library, Book book){
        library.removeBook(book);
        System.out.println(this.getName() + " removed " + book.getTitle() + " from the library.");
    }

    public void registerMember(Library library, Member member){
        library.registerMember(member);
        System.out.println(this.getName() + " registered " + member.getName() + " as a member of the library.");
    }

    public void recordTransaction(Library library, Transaction transaction){
        library.recordTransaction(transaction);
        System.out.println(this.getName() + " recorded a transaction.");
    }

    @Override
    public void performRole() {
        System.out.println(this.getName() + " is managing the library.");
    }


}
