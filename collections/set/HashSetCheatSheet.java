package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * Overview:
 * HashSet is a collection that does not allow duplicate elements.
 * It uses a hash table for storage.
 * It provides methods to perform operations on the set.
 *
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractCollection<E>
 * ↳ java.util.AbstractSet<E>
 * ↳ java.util.HashSet<E>
 *
 * Key Interfaces:
 * HashSet implements the Set interface, which extends the Collection interface.
 * It provides various methods to perform operations on the set.
 *
 * Constructors:
 * - HashSet()
 * - HashSet(Collection<? extends E> c)
 * - HashSet(int initialCapacity)
 * - HashSet(int initialCapacity, float loadFactor)
 */

public class HashSetCheatSheet {

    public static void main(String[] args) {
        // Creating a HashSet using the default constructor
        Set<String> set = new HashSet<>();

        /*
         * Method: add(E e)
         * Adds the specified element to this set if it is not already present.
         * Signature: public boolean add(E e)
         * Returns: true if this set did not already contain the specified element
         */
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        /*
         * Method: remove(Object o)
         * Removes the specified element from this set if it is present.
         * Signature: public boolean remove(Object o)
         * Parameters: o - element to be removed from this set, if present
         * Returns: true if this set contained the specified element
         */
        set.remove("Banana");

        /*
         * Method: size()
         * Returns the number of elements in this set.
         * Signature: public int size()
         * Returns: the number of elements in this set
         */
        int size = set.size();

        /*
         * Method: isEmpty()
         * Returns true if this set contains no elements.
         * Signature: public boolean isEmpty()
         * Returns: true if this set contains no elements
         */
        boolean isEmpty = set.isEmpty();

        /*
         * Method: contains(Object o)
         * Returns true if this set contains the specified element.
         * Signature: public boolean contains(Object o)
         * Parameters: o - element whose presence in this set is to be tested
         * Returns: true if this set contains the specified element
         */
        boolean containsApple = set.contains("Apple");

        /*
         * Method: clear()
         * Removes all of the elements from this set.
         * Signature: public void clear()
         * The set will be empty after this call returns.
         */
        set.clear();

        /*
         * Method: addAll(Collection<? extends E> c)
         * Adds all of the elements in the specified collection to this set.
         * Signature: public boolean addAll(Collection<? extends E> c)
         * Parameters: c - collection containing elements to be added to this set
         * Returns: true if this set changed as a result of the call
         */
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");
        set.addAll(moreFruits);

        /*
         * Method: toArray()
         * Returns an array containing all of the elements in this set.
         * Signature: public Object[] toArray()
         * Returns: an array containing all of the elements in this set
         */
        Object[] setArray = set.toArray();

        /*
         * Method: iterator()
         * Returns an iterator over the elements in this set.
         * Signature: public Iterator<E> iterator()
         * Returns: an iterator over the elements in this set
         */
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Printing the results
        System.out.println("Set: " + set);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Apple: " + containsApple);
        System.out.println("Set Array: " + java.util.Arrays.toString(setArray));
    }
}
