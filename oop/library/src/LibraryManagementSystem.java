package oop.library.src;

import java.util.Date;

import oop.library.src.Transaction.TransactionType;

/**
 * Overview:
 * This example demonstrates the OOP concepts using a Library Management System.
 *
 * Entities:
 * - Library: Manages books and members
 * - Book: Represents a book in the library
 * - Member: Represents a library member
 * - Librarian: Manages the library operations
 * - Transaction: Represents a borrowing/return transaction
 *
 * OOP Concepts:
 * - Encapsulation: Private attributes with public getters and setters
 * - Inheritance: Member and Librarian inherit from Person
 * - Polymorphism: Person reference holding Member or Librarian objects
 * - Abstraction: Abstract methods in Person for specific roles
 */

// Main class to demonstrate the Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create a librarian
        Librarian librarian = new Librarian("Alice", "L001");

        // Create some books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "1234567891");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567892");

        // Librarian adds books to the library
        librarian.addBook(library, book1);
        librarian.addBook(library, book2);
        librarian.addBook(library, book3);

        // Create a member
        Member member = new Member("Bob", "M001");

        // Register the member with the library
        library.registerMember(member);

        // Member borrows a book
        member.borrowBook(book1);
        library.recordTransaction(new Transaction(book1, member, new Date(), TransactionType.BORROW));

        // Member returns a book
        member.returnBook(book1);
        library.recordTransaction(new Transaction(book1, member, new Date(), TransactionType.RETURN));

        // Display all transactions
        for (Transaction transaction : library.getTransactions()) {
            System.out.println(transaction.getMember().getName() + " " + transaction.getType() + "ed "
                    + transaction.getBook().getTitle() + " on " + transaction.getDate());
        }
    }
}
