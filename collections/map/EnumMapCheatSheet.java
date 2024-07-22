package collections.map;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/**
 * Overview:
 * EnumMap is a specialized Map implementation for use with enum keys.
 * It is represented internally as arrays and provides high performance.
 * 
 * Hierarchy:
 * java.lang.Object
 * ↳ java.util.AbstractMap<K,V>
 * ↳ java.util.EnumMap<K,V>
 * 
 * Key Interfaces:
 * EnumMap implements the Map interface, which extends the Collection interface.
 * It provides various methods to perform operations on the map.
 * 
 * Constructors:
 * - EnumMap(Class<K> keyType)
 * - EnumMap(EnumMap<K, ? extends V> m)
 * - EnumMap(Map<K, ? extends V> m)
 */

public class EnumMapCheatSheet {

    public static void main(String[] args) {
        // Creating an EnumMap using default constructor
        Map<Day, Integer> map = new EnumMap<>(Day.class);

        /*
         * Method: put(K key, V value)
         * Associates the specified value with the specified key in this map.
         * Signature: public V put(K key, V value)
         * Parameters: key - key with which the specified value is to be associated
         * value - value to be associated with the specified key
         * Returns: the previous value associated with key, or null if there was no
         * mapping for key
         */
        map.put(Day.MONDAY, 1);
        map.put(Day.TUESDAY, 2);
        map.put(Day.WEDNESDAY, 3);

        /*
         * Method: get(Object key)
         * Returns the value to which the specified key is mapped, or null if this map
         * contains no mapping for the key.
         * Signature: public V get(Object key)
         * Parameters: key - the key whose associated value is to be returned
         * Returns: the value to which the specified key is mapped, or null if this map
         * contains no mapping for the key
         */
        Integer value = map.get(Day.MONDAY);

        /*
         * Method: remove(Object key)
         * Removes the mapping for a key from this map if it is present.
         * Signature: public V remove(Object key)
         * Parameters: key - key whose mapping is to be removed from the map
         * Returns: the previous value associated with key, or null if there was no
         * mapping for key
         */
        Integer removedValue = map.remove(Day.TUESDAY);

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
        boolean containsKey = map.containsKey(Day.MONDAY);

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
        Set<Day> keys = map.keySet();

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
        Set<Map.Entry<Day, Integer>> entries = map.entrySet();

        // Printing the results
        System.out.println("Map: " + map);
        System.out.println("Value for Monday: " + value);
        System.out.println("Removed value: " + removedValue);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains Monday: " + containsKey);
        System.out.println("Contains value 1: " + containsValue);
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }

    // Enum for demonstration
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
