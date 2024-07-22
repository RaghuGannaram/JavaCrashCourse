package collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

/**
 * Overview:
 * LinkedList is a doubly-linked list implementation of the List and Deque
 * interfaces.
 * It allows fast insertions and deletions but provides slower random access
 * compared to ArrayList.
 * It is part of the Java Collections Framework.
 *
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractCollection<E>
 * ↳ java.util.AbstractList<E>
 * ↳ java.util.AbstractSequentialList<E>
 * ↳ java.util.LinkedList<E>
 *
 * Key Interfaces:
 * LinkedList implements the List, Deque, and Queue interfaces.
 * It provides various methods to perform operations on the list.
 *
 * Constructors:
 * - LinkedList()
 * - LinkedList(Collection<? extends E> c)
 */

public class LinkedListCheatSheet {

    public static void main(String[] args) {
        // Creating a LinkedList using default constructor
        List<String> fruits = new LinkedList<>();

        /*
         * Method: add(E e)
         * Adds the specified element to the end of this list.
         * Signature: public boolean add(E e)
         * Returns: true (as specified by Collection.add(E))
         */
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        /*
         * Method: add(int index, E element)
         * Inserts the specified element at the specified position in this list.
         * Signature: public void add(int index, E element)
         * Parameters: index - the index at which the specified element is to be
         * inserted
         * element - the element to be inserted
         * Throws: IndexOutOfBoundsException - if the index is out of range (index < 0
         * || index > size())
         */
        fruits.add(1, "Blueberry");

        /*
         * Method: get(int index)
         * Returns the element at the specified position in this list.
         * Signature: public E get(int index)
         * Parameters: index - the index of the element to return
         * Returns: the element at the specified position in this list
         * Throws: IndexOutOfBoundsException - if the index is out of range (index < 0
         * || index >= size())
         */
        String fruit = fruits.get(0);

        /*
         * Method: set(int index, E element)
         * Replaces the element at the specified position in this list with the
         * specified element.
         * Signature: public E set(int index, E element)
         * Parameters: index - the index of the element to replace
         * element - the element to be stored at the specified position
         * Returns: the element previously at the specified position
         * Throws: IndexOutOfBoundsException - if the index is out of range (index < 0
         * || index >= size())
         */
        fruits.set(1, "Strawberry");

        /*
         * Method: remove(int index)
         * Removes the element at the specified position in this list.
         * Signature: public E remove(int index)
         * Parameters: index - the index of the element to be removed
         * Returns: the element previously at the specified position
         * Throws: IndexOutOfBoundsException - if the index is out of range (index < 0
         * || index >= size())
         */
        fruits.remove(2);

        /*
         * Method: remove(Object o)
         * Removes the first occurrence of the specified element from this list, if it
         * is present.
         * Signature: public boolean remove(Object o)
         * Parameters: o - element to be removed from this list, if present
         * Returns: true if this list contained the specified element
         */
        fruits.remove("Banana");

        /*
         * Method: size()
         * Returns the number of elements in this list.
         * Signature: public int size()
         * Returns: the number of elements in this list
         */
        int size = fruits.size();

        /*
         * Method: isEmpty()
         * Returns true if this list contains no elements.
         * Signature: public boolean isEmpty()
         * Returns: true if this list contains no elements
         */
        boolean isEmpty = fruits.isEmpty();

        /*
         * Method: clear()
         * Removes all of the elements from this list.
         * Signature: public void clear()
         * The list will be empty after this call returns.
         */
        fruits.clear();

        /*
         * Method: contains(Object o)
         * Returns true if this list contains the specified element.
         * Signature: public boolean contains(Object o)
         * Parameters: o - element whose presence in this list is to be tested
         * Returns: true if this list contains the specified element
         */
        boolean containsApple = fruits.contains("Apple");

        /*
         * Method: addAll(Collection<? extends E> c)
         * Appends all of the elements in the specified collection to the end of this
         * list.
         * Signature: public boolean addAll(Collection<? extends E> c)
         * Parameters: c - collection containing elements to be added to this list
         * Returns: true if this list changed as a result of the call
         */
        List<String> moreFruits = new LinkedList<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");
        fruits.addAll(moreFruits);

        /*
         * Method: toArray()
         * Returns an array containing all of the elements in this list in proper
         * sequence.
         * Signature: public Object[] toArray()
         * Returns: an array containing all of the elements in this list in proper
         * sequence
         */
        Object[] fruitsArray = fruits.toArray();

        /*
         * Method: iterator()
         * Returns an iterator over the elements in this list in proper sequence.
         * Signature: public Iterator<E> iterator()
         * Returns: an iterator over the elements in this list in proper sequence
         */
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Printing the results
        System.out.println("Fruits: " + fruits);
        System.out.println("First Fruit: " + fruit);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Apple: " + containsApple);
        System.out.println("Fruits Array: " + java.util.Arrays.toString(fruitsArray));
    }
}
