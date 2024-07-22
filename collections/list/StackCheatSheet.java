package collections.list;

import java.util.Stack;

/**
 * Overview:
 * Stack is a subclass of Vector that implements a last-in, first-out (LIFO)
 * stack.
 * It provides methods to push, pop, and peek elements. It is part of the Java
 * Collections Framework.
 *
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractCollection<E>
 * ↳ java.util.AbstractList<E>
 * ↳ java.util.Vector<E>
 * ↳ java.util.Stack<E>
 *
 * Key Interfaces:
 * Stack implements the List interface, which extends the Collection interface.
 * It provides various methods to perform stack operations.
 *
 * Constructors:
 * - Stack()
 */

public class StackCheatSheet {

    public static void main(String[] args) {
        // Creating a Stack using default constructor
        Stack<String> fruits = new Stack<>();

        /*
         * Method: push(E item)
         * Pushes an item onto the top of this stack.
         * Signature: public E push(E item)
         * Parameters: item - the item to be pushed onto this stack
         * Returns: the item argument
         */
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Cherry");

        /*
         * Method: pop()
         * Removes the object at the top of this stack and returns that object as the
         * value of this function.
         * Signature: public synchronized E pop()
         * Returns: The object at the top of this stack (the last item of the Vector
         * object).
         * Throws: EmptyStackException - if this stack is empty.
         */
        String top = fruits.pop();

        /*
         * Method: peek()
         * Looks at the object at the top of this stack without removing it from the
         * stack.
         * Signature: public synchronized E peek()
         * Returns: The object at the top of this stack (the last item of the Vector
         * object).
         * Throws: EmptyStackException - if this stack is empty.
         */
        String peek = fruits.peek();

        /*
         * Method: empty()
         * Tests if this stack is empty.
         * Signature: public boolean empty()
         * Returns: true if and only if this stack contains no items; false otherwise.
         */
        boolean isEmpty = fruits.empty();

        /*
         * Method: search(Object o)
         * Returns the 1-based position where an object is on this stack.
         * Signature: public synchronized int search(Object o)
         * Parameters: o - the desired object.
         * Returns: The 1-based position from the top of the stack where the object is
         * located; the return value -1 indicates that the object is not on the stack.
         */
        int position = fruits.search("Banana");

        // Printing the results
        System.out.println("Fruits: " + fruits);
        System.out.println("Top: " + top);
        System.out.println("Peek: " + peek);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Position of Banana: " + position);
    }
}
