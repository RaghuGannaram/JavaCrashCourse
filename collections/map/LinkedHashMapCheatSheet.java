package collections.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Overview:
 * LinkedHashMap is a hash table and linked list implementation of the Map
 * interface, with predictable iteration order.
 * It maintains a doubly-linked list running through all of its entries.
 * 
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractMap<K,V>
 * ↳ java.util.HashMap<K,V>
 * ↳ java.util.LinkedHashMap<K,V>
 * 
 * Key Interfaces:
 * LinkedHashMap implements the Map interface, which extends the Collection
 * interface.
 * It provides various methods to perform operations on the map.
 * 
 * Constructors:
 * - LinkedHashMap()
 * - LinkedHashMap(int initialCapacity)
 * - LinkedHashMap(int initialCapacity, float loadFactor)
 * - LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
 * - LinkedHashMap(Map<? extends K, ? extends V> m)
 */

public class LinkedHashMapCheatSheet {

    public static void main(String[] args) {
        // Creating a LinkedHashMap using default constructor
        Map<String, Integer> map = new LinkedHashMap<>();

        /*
         * Method: put(K key, V value)
         * Associates the specified value with the specified key in this map.
         * Signature: public V put(K key, V value)
         * Parameters: key - key with which the specified value is to be associated
         * value - value to be associated with the specified key
         * Returns: the previous value associated with key, or null if there was no
         * mapping for key
         */
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        /*
         * Method: get(Object key)
         * Returns the value to which the specified key is mapped, or null if this map
         * contains no mapping for the key.
         * Signature: public V get(Object key)
         * Parameters: key - the key whose associated value is to be returned
         * Returns: the value to which the specified key is mapped, or null if this map
         * contains no mapping for the key
         */
        Integer value = map.get("Apple");

        /*
         * Method: remove(Object key)
         * Removes the mapping for a key from this map if it is present.
         * Signature: public V remove(Object key)
         * Parameters: key - key whose mapping is to be removed from the map
         * Returns: the previous value associated with key, or null if there was no
         * mapping for key
         */
        Integer removedValue = map.remove("Banana");

        /*
         * Method: size()
         * Returns the number of key-value mappings in this map.
         * Signature: public int size()
         * Returns: the number of key-value mappings in this map
         */
        int size = map.size();

        /*
         * Method: isEmpty()
         * Returns true if this map contains no key-value mappings.
         * Signature: public boolean isEmpty()
         * Returns: true if this map contains no key-value mappings
         */
        boolean isEmpty = map.isEmpty();

        /*
         * Method: clear()
         * Removes all of the mappings from this map.
         * Signature: public void clear()
         */
        map.clear();

        /*
         * Method: containsKey(Object key)
         * Returns true if this map contains a mapping for the specified key.
         * Signature: public boolean containsKey(Object key)
         * Parameters: key - key whose presence in this map is to be tested
         * Returns: true if this map contains a mapping for the specified key
         */
        boolean containsKey = map.containsKey("Apple");

        /*
         * Method: containsValue(Object value)
         * Returns true if this map maps one or more keys to the specified value.
         * Signature: public boolean containsValue(Object value)
         * Parameters: value - value whose presence in this map is to be tested
         * Returns: true if this map maps one or more keys to the specified value
         */
        boolean containsValue = map.containsValue(1);

        /*
         * Method: keySet()
         * Returns a Set view of the keys contained in this map.
         * Signature: public Set<K> keySet()
         * Returns: a set view of the keys contained in this map
         */
        Set<String> keys = map.keySet();

        /*
         * Method: values()
         * Returns a Collection view of the values contained in this map.
         * Signature: public Collection<V> values()
         * Returns: a collection view of the values contained in this map
         */
        Collection<Integer> values = map.values();

        /*
         * Method: entrySet()
         * Returns a Set view of the mappings contained in this map.
         * Signature: public Set<Map.Entry<K,V>> entrySet()
         * Returns: a set view of the mappings contained in this map
         */
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // Printing the results
        System.out.println("Map: " + map);
        System.out.println("Value for Apple: " + value);
        System.out.println("Removed value: " + removedValue);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Apple: " + containsKey);
        System.out.println("Contains value 1: " + containsValue);
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }
}
