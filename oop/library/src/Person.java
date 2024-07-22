package oop.library.src;

/*
 * Person class : Represents a person in the library
 * 
 * Fields: name, id
 * Methods: getters for name, id
 * 
 * Constructors: parameterized constructor to initialize the fields
 * 
 * OOP Concepts: Abstraction
 * Abstraction: Abstract methods in Person for specific roles
 * 
 * Note: This class is abstract and cannot be instantiated.
 * Abstract methods: performRole()
 * 
 */

public abstract class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method for role-specific actions
    public abstract void performRole();

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}