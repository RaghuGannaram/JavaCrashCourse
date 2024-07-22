package collections.set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Overview:
 * EnumSet is a specialized Set implementation for use with enum types.
 * All of the elements in an EnumSet must come from a single enum type that is
 * specified
 * explicitly or implicitly when the set is created.
 * It is a high-performance set implementation specifically for enum types.
 *
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractCollection<E>
 * ↳ java.util.AbstractSet<E>
 * ↳ java.util.EnumSet<E>
 *
 * Key Interfaces:
 * EnumSet implements the Set interface, which extends the Collection interface.
 * It provides various methods to perform operations on the set.
 *
 * Constructors:
 * EnumSet is an abstract class, and instances are created via static factory
 * methods:
 * - noneOf(Class<E> elementType)
 * - allOf(Class<E> elementType)
 * - of(E e)
 * - of(E first, E... rest)
 * - range(E from, E to)
 * - complementOf(EnumSet<E> s)
 * - copyOf(EnumSet<E> s)
 */

public class EnumSetCheatSheet {

    // Define an enum for demonstration
    enum Fruit {
        APPLE, BANANA, CHERRY, ORANGE, GRAPES
    }

    public static void main(String[] args) {
        // Creating an EnumSet using the allOf factory method
        Set<Fruit> allFruits = EnumSet.allOf(Fruit.class);

        /*
         * Method: add(E e)
         * Adds the specified element to this set if it is not already present.
         * Signature: public boolean add(E e)
         * Returns: true if this set did not already contain the specified element
         */
        allFruits.add(Fruit.APPLE);
        allFruits.add(Fruit.BANANA);

        /*
         * Method: remove(Object o)
         * Removes the specified element from this set if it is present.
         * Signature: public boolean remove(Object o)
         * Parameters: o - element to be removed from this set, if present
         * Returns: true if this set contained the specified element
         */
        allFruits.remove(Fruit.BANANA);

        /*
         * Method: size()
         * Returns the number of elements in this set.
         * Signature: public int size()
         * Returns: the number of elements in this set
         */
        int size = allFruits.size();

        /*
         * Method: isEmpty()
         * Returns true if this set contains no elements.
         * Signature: public boolean isEmpty()
         * Returns: true if this set contains no elements
         */
        boolean isEmpty = allFruits.isEmpty();

        /*
         * Method: contains(Object o)
         * Returns true if this set contains the specified element.
         * Signature: public boolean contains(Object o)
         * Parameters: o - element whose presence in this set is to be tested
         * Returns: true if this set contains the specified element
         */
        boolean containsApple = allFruits.contains(Fruit.APPLE);

        /*
         * Method: clear()
         * Removes all of the elements from this set.
         * Signature: public void clear()
         * The set will be empty after this call returns.
         */
        allFruits.clear();

        /*
         * Method: addAll(Collection<? extends E> c)
         * Adds all of the elements in the specified collection to this set.
         * Signature: public boolean addAll(Collection<? extends E> c)
         * Parameters: c - collection containing elements to be added to this set
         * Returns: true if this set changed as a result of the call
         */
        EnumSet<Fruit> moreFruits = EnumSet.of(Fruit.ORANGE, Fruit.GRAPES);
        allFruits.addAll(moreFruits);

        /*
         * Method: toArray()
         * Returns an array containing all of the elements in this set.
         * Signature: public Object[] toArray()
         * Returns: an array containing all of the elements in this set
         */
        Object[] setArray = allFruits.toArray();

        /*
         * Method: iterator()
         * Returns an iterator over the elements in this set.
         * Signature: public Iterator<E> iterator()
         * Returns: an iterator over the elements in this set
         */
        Iterator<Fruit> iterator = allFruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Printing the results
        System.out.println("All Fruits: " + allFruits);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Apple: " + containsApple);
        System.out.println("Set Array: " + java.util.Arrays.toString(setArray));
    }
}
