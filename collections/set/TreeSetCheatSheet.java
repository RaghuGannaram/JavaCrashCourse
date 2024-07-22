package collections.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Overview:
 * TreeSet is a NavigableSet implementation based on a TreeMap. It stores
 * elements in a sorted order.
 * The ordering is either the natural ordering of the elements or by a
 * Comparator provided at set creation time.
 *
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractCollection<E>
 * ↳ java.util.AbstractSet<E>
 * ↳ java.util.TreeSet<E>
 *
 * Key Interfaces:
 * TreeSet implements the NavigableSet interface, which extends the SortedSet
 * and Set interfaces.
 * It provides various methods to perform operations on the set.
 *
 * Constructors:
 * - TreeSet()
 * - TreeSet(Collection<? extends E> c)
 * - TreeSet(Comparator<? super E> comparator)
 * - TreeSet(SortedSet<E> s)
 */

public class TreeSetCheatSheet {

    public static void main(String[] args) {
        // Creating a TreeSet using the default constructor
        NavigableSet<String> set = new TreeSet<>();

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
        NavigableSet<String> moreFruits = new TreeSet<>();
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

        /*
         * Method: first()
         * Returns the first (lowest) element currently in this set.
         * Signature: public E first()
         * Returns: the first (lowest) element currently in this set
         * Throws: NoSuchElementException - if this set is empty
         */
        String first = set.first();

        /*
         * Method: last()
         * Returns the last (highest) element currently in this set.
         * Signature: public E last()
         * Returns: the last (highest) element currently in this set
         * Throws: NoSuchElementException - if this set is empty
         */
        String last = set.last();

        /*
         * Method: lower(E e)
         * Returns the greatest element in this set strictly less than the given
         * element, or null if there is no such element.
         * Signature: public E lower(E e)
         * Parameters: e - the value to match
         * Returns: the greatest element less than e, or null if there is no such
         * element
         */
        String lower = set.lower("Orange");

        /*
         * Method: higher(E e)
         * Returns the least element in this set strictly greater than the given
         * element, or null if there is no such element.
         * Signature: public E higher(E e)
         * Parameters: e - the value to match
         * Returns: the least element greater than e, or null if there is no such
         * element
         */
        String higher = set.higher("Grapes");

        /*
         * Method: pollFirst()
         * Retrieves and removes the first (lowest) element, or returns null if this set
         * is empty.
         * Signature: public E pollFirst()
         * Returns: the first element, or null if this set is empty
         */
        String pollFirst = set.pollFirst();

        /*
         * Method: pollLast()
         * Retrieves and removes the last (highest) element, or returns null if this set
         * is empty.
         * Signature: public E pollLast()
         * Returns: the last element, or null if this set is empty
         */
        String pollLast = set.pollLast();

        /*
         * Method: subSet(E fromElement, boolean fromInclusive, E toElement, boolean
         * toInclusive)
         * Returns a view of the portion of this set whose elements range from
         * fromElement, inclusive, to toElement, inclusive.
         * Signature: public NavigableSet<E> subSet(E fromElement, boolean
         * fromInclusive, E toElement, boolean toInclusive)
         * Parameters: fromElement - low endpoint of the returned set
         * fromInclusive - true if the low endpoint is to be included in the returned
         * view
         * toElement - high endpoint of the returned set
         * toInclusive - true if the high endpoint is to be included in the returned
         * view
         * Returns: a view of the portion of this set whose elements range from
         * fromElement, inclusive, to toElement, inclusive
         */
        NavigableSet<String> subSet = set.subSet("Grapes", true, "Orange", true);

        /*
         * Method: headSet(E toElement, boolean inclusive)
         * Returns a view of the portion of this set whose elements are less than (or
         * equal to, if inclusive is true) toElement.
         * Signature: public NavigableSet<E> headSet(E toElement, boolean inclusive)
         * Parameters: toElement - high endpoint of the returned set
         * inclusive - true if the high endpoint is to be included in the returned view
         * Returns: a view of the portion of this set whose elements are less than (or
         * equal to, if inclusive is true) toElement
         */
        NavigableSet<String> headSet = set.headSet("Orange", true);

        /*
         * Method: tailSet(E fromElement, boolean inclusive)
         * Returns a view of the portion of this set whose elements are greater than (or
         * equal to, if inclusive is true) fromElement.
         * Signature: public NavigableSet<E> tailSet(E fromElement, boolean inclusive)
         * Parameters: fromElement - low endpoint of the returned set
         * inclusive - true if the low endpoint is to be included in the returned view
         * Returns: a view of the portion of this set whose elements are greater than
         * (or equal to, if inclusive is true) fromElement
         */
        NavigableSet<String> tailSet = set.tailSet("Grapes", true);

        // Printing the results
        System.out.println("Set: " + set);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Apple: " + containsApple);
        System.out.println("Set Array: " + java.util.Arrays.toString(setArray));
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);
        System.out.println("Lower than 'Orange': " + lower);
        System.out.println("Higher than 'Grapes': " + higher);
        System.out.println("Poll First: " + pollFirst);
        System.out.println("Poll Last: " + pollLast);
        System.out.println("SubSet: " + subSet);
        System.out.println("HeadSet: " + headSet);
        System.out.println("TailSet: " + tailSet);
    }
}
