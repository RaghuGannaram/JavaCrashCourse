
# Java Collections Framework Overview

The Java Collections Framework provides a set of interfaces and classes to handle groups of objects as a single unit. These collections enable storing, retrieving, manipulating, and communicating aggregate data. Here's a high-level overview of the Java Collections Framework, including the hierarchy and categories of collections.

## Key Interfaces and Classes

- **Collection Interface**: The root of the collection hierarchy. A collection represents a group of objects known as elements. The `Collection` interface has several subinterfaces and classes.

  - **List Interface**: An ordered collection (also known as a sequence). Allows duplicate elements.
    - **ArrayList**
    - **LinkedList**
    - **Vector**
    - **Stack**

  - **Set Interface**: A collection that does not allow duplicate elements.
    - **HashSet**
    - **LinkedHashSet**
    - **TreeSet**
    - **EnumSet**

  - **Queue Interface**: A collection used to hold multiple elements prior to processing. Typically orders elements in FIFO (First-In-First-Out) manner.
    - **PriorityQueue**
    - **LinkedList** (implements both List and Queue)

  - **Deque Interface**: A double-ended queue that allows elements to be added or removed from both ends.
    - **ArrayDeque**
    - **LinkedList**

- **Map Interface**: Represents a collection of key-value pairs. Maps cannot contain duplicate keys.
  - **HashMap**
  - **LinkedHashMap**
  - **TreeMap**
  - **Hashtable**
  - **EnumMap**

## Java Collections Hierarchy Diagram

```plaintext
                                                                          Collection
                                                                              |
        ----------------------------------------------------------------------------------------------------------------------------
                |                                      |                                      |                              |
               List                                   Set                                   Queue                          Deque
                |                                      |                                      |                              |
  ---------------------------        -------------------------------------         ------------------------      -------------------------
    |           |          |          |             |           |      |                 |            |                |           |
ArrayList   LinkedList   Vector     HashSet   LinkedHashSet  TreeSet   EnumSet     PriorityQueue  LinkedList       ArrayDeque   LinkedList
                           |                                       
                         Stack                               
                                          


                            
                            Map
                            |
  ----------------------------------------------------
  |                |                 |              |
HashMap       LinkedHashMap      TreeMap        Hashtable
                                              (legacy class)
                                                    |
                                                 EnumMap
```

## Categories of Java Collections

### 1. **List**
- **ArrayList**: Resizable array implementation. Fast random access, slow inserts and deletes.
- **LinkedList**: Doubly-linked list implementation. Fast inserts and deletes, slow random access.
- **Vector**: Synchronized version of `ArrayList`.
- **Stack**: Subclass of `Vector` that implements a last-in, first-out (LIFO) stack.

### 2. **Set**
- **HashSet**: Uses a hash table for storage. No guarantees on order of elements.
- **LinkedHashSet**: Hash table and linked list implementation. Maintains insertion order.
- **TreeSet**: Red-Black tree implementation. Elements are ordered based on their values.
- **EnumSet**: Specialized Set for use with enum types.

### 3. **Queue**
- **PriorityQueue**: An unbounded priority queue based on a priority heap.
- **LinkedList**: Implements both List and Queue interfaces. Can act as a FIFO queue.

### 4. **Deque**
- **ArrayDeque**: Resizable array implementation of the Deque interface. Fast for stack and queue operations.
- **LinkedList**: Implements both List and Deque interfaces. Can act as a FIFO queue or a LIFO stack.

### 5. **Map**
- **HashMap**: Hash table implementation. No guarantees on order of keys.
- **LinkedHashMap**: Hash table and linked list implementation. Maintains insertion order.
- **TreeMap**: Red-Black tree implementation. Keys are ordered based on their values.
- **Hashtable**: Synchronized version of `HashMap` (legacy class).
- **EnumMap**: Specialized Map for use with enum types.

## Cheat Sheet: Common Methods in Java Collections

### List Methods
```java
List<String> list = new ArrayList<>();
list.add("A");            // Adds element to the list
list.get(0);              // Retrieves element at index 0
list.set(0, "B");         // Replaces element at index 0
list.remove(0);           // Removes element at index 0
list.size();              // Returns size of the list
list.contains("A");       // Checks if list contains "A"
list.isEmpty();           // Checks if list is empty
list.clear();             // Removes all elements from the list
```

### Set Methods
```java
Set<String> set = new HashSet<>();
set.add("A");             // Adds element to the set
set.remove("A");          // Removes element from the set
set.contains("A");        // Checks if set contains "A"
set.size();               // Returns size of the set
set.isEmpty();            // Checks if set is empty
set.clear();              // Removes all elements from the set
```

### Queue Methods
```java
Queue<String> queue = new LinkedList<>();
queue.add("A");           // Adds element to the queue
queue.offer("B");         // Adds element to the queue (alternative)
queue.peek();             // Retrieves, but does not remove, the head of the queue
queue.poll();             // Retrieves and removes the head of the queue
queue.remove();           // Removes a single instance of the specified element
queue.size();             // Returns size of the queue
queue.isEmpty();          // Checks if queue is empty
queue.clear();            // Removes all elements from the queue
```

### Deque Methods
```java
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("A");      // Adds element to the front of the deque
deque.addLast("B");       // Adds element to the end of the deque
deque.offerFirst("C");    // Adds element to the front of the deque (alternative)
deque.offerLast("D");     // Adds element to the end of the deque (alternative)
deque.peekFirst();        // Retrieves, but does not remove, the first element
deque.peekLast();         // Retrieves, but does not remove, the last element
deque.pollFirst();        // Retrieves and removes the first element
deque.pollLast();         // Retrieves and removes the last element
deque.removeFirst();      // Removes the first element
deque.removeLast();       // Removes the last element
deque.size();             // Returns size of the deque
deque.isEmpty();          // Checks if deque is empty
deque.clear();            // Removes all elements from the deque
```

### Map Methods
```java
Map<String, Integer> map = new HashMap<>();
map.put("A", 1);          // Adds key-value pair to the map
map.get("A");             // Retrieves value associated with key "A"
map.remove("A");          // Removes key-value pair associated with key "A"
map.containsKey("A");     // Checks if map contains key "A"
map.containsValue(1);     // Checks if map contains value 1
map.size();               // Returns size of the map
map.isEmpty();            // Checks if map is empty
map.clear();              // Removes all key-value pairs from the map
```

This cheat sheet provides an overview of the Java Collections Framework and a quick reference for common methods used with collections. Use this as a starting point to understand and utilize the various collection types and their methods in Java.
