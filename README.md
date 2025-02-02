# Java Collection Framework Overview

The Java Collection Framework provides a set of interfaces and classes for working with groups of objects. It includes core interfaces such as Collection, List, Set, Queue, Deque, and Map, and their concrete implementations.

## Interfaces and Their Methods 

### Collection
**Description**: The root of the collection hierarchy. A collection represents a group of objects.

**Methods**:
- `boolean add(E e)`
- `boolean remove(Object o)`
- `boolean contains(Object o)`
- `int size()`
- `boolean isEmpty()`
- `void clear()`
- `Iterator<E> iterator()`
- `boolean addAll(Collection<? extends E> c)`
- `boolean removeAll(Collection<?> c)`
- `boolean retainAll(Collection<?> c)`
- `boolean containsAll(Collection<?> c)`

### List (extends Collection)
**Description**: An ordered collection (also known as a sequence) that allows duplicates.

**Methods**:
- `E get(int index)`
- `E set(int index, E element)`
- `void add(int index, E element)`
- `E remove(int index)`
- `int indexOf(Object o)`
- `int lastIndexOf(Object o)`
- `ListIterator<E> listIterator()`
- `ListIterator<E> listIterator(int index)`
- `List<E> subList(int fromIndex, int toIndex)`

### Set (extends Collection)
**Description**: A collection that contains no duplicate elements.

**Methods**: Inherits all methods from the Collection interface.

### Queue (extends Collection)
**Description**: A collection used to hold multiple elements prior to processing.

**Methods**:
- `boolean offer(E e)`
- `E poll()`
- `E remove()`
- `E peek()`
- `E element()`

### Deque (extends Queue)
**Description**: A double-ended queue that allows insertion and removal from both ends.

**Methods**:
- `void addFirst(E e)`
- `void addLast(E e)`
- `boolean offerFirst(E e)`
- `boolean offerLast(E e)`
- `E removeFirst()`
- `E removeLast()`
- `E pollFirst()`
- `E pollLast()`
- `E getFirst()`
- `E getLast()`
- `E peekFirst()`
- `E peekLast()`
- `boolean removeFirstOccurrence(Object o)`
- `boolean removeLastOccurrence(Object o)`

### Map
**Description**: An object that maps keys to values.

**Methods**:
- `V put(K key, V value)`
- `V remove(Object key)`
- `V get(Object key)`
- `V getOrDefault(Object key, V defaultValue)`
- `boolean containsKey(Object key)`
- `boolean containsValue(Object value)`
- `Set<K> keySet()`
- `Collection<V> values()`
- `Set<Map.Entry<K, V>> entrySet()`
- `V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)`
- `V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`

### Legacy Class
#### Stack
**Implements**: extends Vector

**Description**: A legacy class that extends Vector and provides standard last-in, first-out stack operations.

**Methods**: Inherits all vector methods
- `E push(E item)`
- `E pop()`
- `E peek()`
- `boolean empty()`
- `int search(Object o)`

## Concrete Implementations
### ArrayList
**Implements**: List
**Description**: A resizable array implementation of the List interface.

### Vector
**Implements**: List
**Description**: A resizable array implementation of the List interface, similar to ArrayList, but synchronized.

### LinkedList
**Implements**: List, Deque, Queue
**Description**: A doubly linked list implementation of the List and Deque interfaces.

### HashSet
**Implements**: Set
**Description**: A hash table-backed implementation of the Set interface.

### LinkedHashSet
**Implements**: Set
**Description**: A hash table and linked list implementation of the Set interface with predictable iteration order.

### TreeSet
**Implements**: NavigableSet, SortedSet
**Description**: A Set implementation that uses a TreeMap to store elements in a sorted order.

### Stack
**Implements**: extends Vector
**Description**: A legacy class that extends Vector and provides standard last-in, first-out stack operations.

### PriorityQueue
**Implements**: Queue
**Description**: A priority heap implementation of the Queue interface.

### ArrayDeque
**Implements**: Deque
**Description**: A resizable array implementation of the Deque interface.

### HashMap
**Implements**: Map
**Description**: A hash table-based implementation of the Map interface.

### LinkedHashMap
**Implements**: Map
**Description**: A hash table and linked list implementation of the Map interface with predictable iteration order.

### TreeMap
**Implements**: NavigableMap, SortedMap
**Description**: A Map implementation that uses a Red-Black tree to store keys in a sorted order.

### Hashtable
**Implements**: Map
**Description**: A synchronized hash table-based implementation of the Map interface.

## Topics Not Covered
- EnumSet
- EnumMap
- ConcurrentHashMap
- WeakHashMap
- IdentityHashMap

This document provides a comprehensive overview of the Java Collection Framework.
