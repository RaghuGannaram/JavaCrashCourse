package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Overview:
 * ArrayDeque is a resizable array implementation of the Deque interface. It
 * provides fast access to both ends of the queue.
 * 
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractCollection<E>
 * ↳ java.util.ArrayDeque<E>
 * 
 * Key Interfaces:
 * ArrayDeque implements the Deque interface, which extends the Queue and
 * Collection interfaces.
 * It provides various methods to perform operations on the deque.
 * 
 * Constructors:
 * - ArrayDeque()
 * - ArrayDeque(Collection<? extends E> c)
 * - ArrayDeque(int initialCapacity)
 */

public class ArrayDequeCheatSheet {

    public static void main(String[] args) {
        // Creating an ArrayDeque using the default constructor
        Deque<String> deque = new ArrayDeque<>();

        /*
         * Method: addFirst(E e)
         * Inserts the specified element at the front of this deque.
         * Signature: public void addFirst(E e)
         * Parameters: e - the element to add
         * Throws: NullPointerException - if the specified element is null
         */
        deque.addFirst("Apple");

        /*
         * Method: addLast(E e)
         * Inserts the specified element at the end of this deque.
         * Signature: public void addLast(E e)
         * Parameters: e - the element to add
         * Throws: NullPointerException - if the specified element is null
         */
        deque.addLast("Banana");

        /*
         * Method: offerFirst(E e)
         * Inserts the specified element at the front of this deque.
         * Signature: public boolean offerFirst(E e)
         * Parameters: e - the element to add
         * Returns: true if the element was added to this deque
         */
        deque.offerFirst("Cherry");

        /*
         * Method: offerLast(E e)
         * Inserts the specified element at the end of this deque.
         * Signature: public boolean offerLast(E e)
         * Parameters: e - the element to add
         * Returns: true if the element was added to this deque
         */
        deque.offerLast("Date");

        /*
         * Method: removeFirst()
         * Retrieves and removes the first element of this deque.
         * Signature: public E removeFirst()
         * Returns: the head of this deque
         * Throws: NoSuchElementException - if this deque is empty
         */
        String first = deque.removeFirst();

        /*
         * Method: removeLast()
         * Retrieves and removes the last element of this deque.
         * Signature: public E removeLast()
         * Returns: the tail of this deque
         * Throws: NoSuchElementException - if this deque is empty
         */
        String last = deque.removeLast();

        /*
         * Method: pollFirst()
         * Retrieves and removes the first element of this deque, or returns null if
         * this deque is empty.
         * Signature: public E pollFirst()
         * Returns: the head of this deque, or null if this deque is empty
         */
        String polledFirst = deque.pollFirst();

        /*
         * Method: pollLast()
         * Retrieves and removes the last element of this deque, or returns null if this
         * deque is empty.
         * Signature: public E pollLast()
         * Returns: the tail of this deque, or null if this deque is empty
         */
        String polledLast = deque.pollLast();

        /*
         * Method: getFirst()
         * Retrieves, but does not remove, the first element of this deque.
         * Signature: public E getFirst()
         * Returns: the head of this deque
         * Throws: NoSuchElementException - if this deque is empty
         */
        String head = deque.getFirst();

        /*
         * Method: getLast()
         * Retrieves, but does not remove, the last element of this deque.
         * Signature: public E getLast()
         * Returns: the tail of this deque
         * Throws: NoSuchElementException - if this deque is empty
         */
        String tail = deque.getLast();

        /*
         * Method: peekFirst()
         * Retrieves, but does not remove, the first element of this deque, or returns
         * null if this deque is empty.
         * Signature: public E peekFirst()
         * Returns: the head of this deque, or null if this deque is empty
         */
        String peekedFirst = deque.peekFirst();

        /*
         * Method: peekLast()
         * Retrieves, but does not remove, the last element of this deque, or returns
         * null if this deque is empty.
         * Signature: public E peekLast()
         * Returns: the tail of this deque, or null if this deque is empty
         */
        String peekedLast = deque.peekLast();

        /*
         * Method: size()
         * Returns the number of elements in this deque.
         * Signature: public int size()
         * Returns: the number of elements in this deque
         */
        int size = deque.size();

        /*
         * Method: isEmpty()
         * Returns true if this deque contains no elements.
         * Signature: public boolean isEmpty()
         * Returns: true if this deque contains no elements
         */
        boolean isEmpty = deque.isEmpty();

        /*
         * Method: clear()
         * Removes all of the elements from this deque.
         * Signature: public void clear()
         * The deque will be empty after this call returns.
         */
        deque.clear();

        /*
         * Method: contains(Object o)
         * Returns true if this deque contains the specified element.
         * Signature: public boolean contains(Object o)
         * Parameters: o - element whose presence in this deque is to be tested
         * Returns: true if this deque contains the specified element
         */
        boolean containsApple = deque.contains("Apple");

        /*
         * Method: toArray()
         * Returns an array containing all of the elements in this deque.
         * Signature: public Object[] toArray()
         * Returns: an array containing all of the elements in this deque
         */
        Object[] dequeArray = deque.toArray();

        /*
         * Method: iterator()
         * Returns an iterator over the elements in this deque.
         * Signature: public Iterator<E> iterator()
         * Returns: an iterator over the elements in this deque
         */
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Printing the results
        System.out.println("Deque: " + deque);
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        System.out.println("Polled First: " + polledFirst);
        System.out.println("Polled Last: " + polledLast);
        System.out.println("Head: " + head);
        System.out.println("Tail: " + tail);
        System.out.println("Peeked First: " + peekedFirst);
        System.out.println("Peeked Last: " + peekedLast);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Apple: " + containsApple);
        System.out.println("Deque Array: " + java.util.Arrays.toString(dequeArray));
    }
}
