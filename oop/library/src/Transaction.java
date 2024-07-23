package oop.library.src;

import java.util.Date;
/*
 * Transaction class : Represents a borrowing/return transaction
 * 
 * Fields: book, member, date, type
 * Methods: getters for book, member, date, type
 * 
 * Constructors: parameterized constructor to initialize the fields
 * 
 * OOP Concepts: Encapsulation
 * Encapsulation: Private attributes with public getters
 * 
 * Note: This class is used to represent a transaction in the library.
 *       It has private fields and public getters to access the transaction details.
 */

public class Transaction {
    private Book book;
    private Member member;
    private Date date;
    private TransactionType type;

    public enum TransactionType {
        BORROW, RETURN
    }

    public Transaction(Book book, Member member, Date date, TransactionType type) {
        this.book = book;
        this.member = member;
        this.date = date;
        this.type = type;
    }

    // Getters
    public Book getBook() {
        return this.book;
    }

    public Member getMember() {
        return this.member;
    }

    public Date getDate() {
        return this.date;
    }

    public TransactionType getType() {
        return this.type;
    }

}