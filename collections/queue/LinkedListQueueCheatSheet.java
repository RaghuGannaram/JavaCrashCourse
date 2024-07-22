package collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Overview:
 * LinkedList is a doubly-linked list implementation of the List and Deque interfaces. It can also be used as a Queue.
 * It provides various methods to perform operations on the list and queue.
 * 
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractCollection<E>
 * ↳ java.util.AbstractList<E>
 * ↳ java.util.LinkedList<E>
 * 
 * Key Interfaces:
 * LinkedList implements the List, Deque, and Queue interfaces, which extend the Collection interface.
 * It provides various methods to perform operations on the list and queue.
 * 
 * Constructors:
 * - LinkedList()
 * - LinkedList(Collection<? extends E> c)
 */

public class LinkedListQueueCheatSheet {

    public static void main(String[] args) {
        // Creating a LinkedList using the default constructor
        Queue<String> queue = new LinkedList<>();

        /*
         * Method: add(E e)
         * Inserts the specified element into this queue.
         * Signature: public boolean add(E e)
         * Returns: true (as specified by Collection.add(E))
         * Throws: IllegalStateException, ClassCastException, NullPointerException, IllegalArgumentException
         */
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        /*
         * Method: offer(E e)
         * Inserts the specified element into this queue.
         * Signature: public boolean offer(E e)
         * Returns: true (as specified by Queue.offer(E))
         * Throws: ClassCastException, NullPointerException, IllegalArgumentException
         */
        queue.offer("Date");

        /*
         * Method: peek()
         * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
         * Signature: public E peek()
         * Returns: the head of this queue, or null if this queue is empty
         */
        String head = queue.peek();

        /*
         * Method: poll()
         * Retrieves and removes the head of this queue, or returns null if this queue is empty.
         * Signature: public E poll()
         * Returns: the head of this queue, or null if this queue is empty
         */
        String removed = queue.poll();

        /*
         * Method: remove(Object o)
         * Removes a single instance of the specified element from this queue, if it is present.
         * Signature: public boolean remove(Object o)
         * Parameters: o - element to be removed from this queue, if present
         * Returns: true if this queue contained the specified element
         */
        queue.remove("Banana");

        /*
         * Method: size()
         * Returns the number of elements in this queue.
         * Signature: public int size()
         * Returns: the number of elements in this queue
         */
        int size = queue.size();

        /*
         * Method: isEmpty()
         * Returns true if this queue contains no elements.
         * Signature: public boolean isEmpty()
         * Returns: true if this queue contains no elements
         */
        boolean isEmpty = queue.isEmpty();

        /*
         * Method: clear()
         * Removes all of the elements from this queue.
         * Signature: public void clear()
         * The queue will be empty after this call returns.
         */
        queue.clear();

        /*
         * Method: contains(Object o)
         * Returns true if this queue contains the specified element.
         * Signature: public boolean contains(Object o)
         * Parameters: o - element whose presence in this queue is to be tested
         * Returns: true if this queue contains the specified element
         */
        boolean containsApple = queue.contains("Apple");

        /*
         * Method: toArray()
         * Returns an array containing all of the elements in this queue.
         * Signature: public Object[] toArray()
         * Returns: an array containing all of the elements in this queue
         */
        Object[] queueArray = queue.toArray();

        /*
         * Method: iterator()
         * Returns an iterator over the elements in this queue.
         * Signature: public Iterator<E> iterator()
         * Returns: an iterator over the elements in this queue
         */
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Printing the results
        System.out.println("Queue: " + queue);
        System.out.println("Head: " + head);
        System.out.println("Removed: " + removed);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Apple: " + containsApple);
        System.out.println("Queue Array: " + java.util.Arrays.toString(queueArray));
    }
}
