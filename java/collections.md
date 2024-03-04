[Main page](../README.md)

> #### What's the difference between `LinkedList` and `ArrayList`?
<details>
<summary>Answer</summary>
Under the hood `ArrayList` uses simple array[], hence each time during insertion new array is going to be created.
The new array is going to have length n+1. Adding elements takes O(n) in the worst case, since the first thing has to 
be done is moving all the elements (e.g. you try to add to the first position). Accessing elements takes O(n).
        
`LinkedList` is a doubly-linked list implementation of the `List` interface. It takes more memory because each node
has to save link to next and previous elements. Adding elements takes O(1). Accessing elements takes O(n).
</details>

> #### Compare `Map`, `Set` and `List`
<details>
<summary>Answer</summary>
`Map` is not from the `Iterable` hierarchy. Moreover it stores information in the key-value way. Key must be unique,
otherwise there are possible collisions.
</details>

> #### What is the difference between `HashMap` and `Hastable`?
<details>
<summary>Answer</summary>

1. `Hashtable` is thread-safe and can be shared between multiple threads in the application. 

2. `HashMap` allows you to add one `null` as a key, and many `null` as values. In the other hand `Hashtable`
doesn't support `null` at all.
3. `HashMap` uses `Iterator` to iterate over values, whereas `Hashtable` has `Enumerator` for the same 
</details>

> #### Describe Collection framework hierarchy.
<details>
<summary>Answer</summary>

1. The basic interface of the Collection framework is `Iterable`. The interface provides method called `iterator()`.
2. `Collection` interface extends the `Iterable` interface. 
3. `List`, `Queue` and `Set` extend the `Collection` interface.
4. `Map` interface is not inherited by the `Collection` interface. It represents an object that stores and retrieves 
elements by in the form of key-value.
5. There are a few implementation of `Map`: `HashMap`, `ConcurrentHashMap`, `Hashtable`, `SortedMap`, `TreeMap`
6. Implementations of `List`: `ArrayList`, `LinkedList`, `Vector`, `Stack`.
7. Implementations of `Set`: `HashSet`, `LinkedHashSet`, `SortedSet`, `TreeSet`.
8. Implementations of `Queue`: `PriorityQueue`, `Deque`, `ArrayDeque`.

</details>

> #### Explain how `HashMap` works. Explain collisions.
<details>
<summary>Answer</summary>

`HashMap` contains array of `Node<K,V>`. `Node<K,V>` represents a class that has following objects:
1. int hash
2. K key
3. V value
4. Node next

Initial size of the array is 16. Each cell is a so called bucket. Each bucket could have more than one `Node<K,V>`, so 
it is like a link list structure.

Steps for `put()`:
1. Calculate hashCode of key;
2. Calculate index by using index method;
3. Create a node at the index.

In case of collision, when two or more objects are on the same index (bucket):

1. In that case, check via the hashCode() and equals() method if both the keys are the same;
2. If keys are the same, replace the value with the current value;
3. Otherwise, connect this node object to the last element of the chain.

Steps for `get()`:

1. Calculate hash code of the key;
2. Calculate index by using index method;
3. Go to the index of the array and compare the first element’s key with the given key. If both are equals then return 
the value, otherwise, check for the next element if it exists.

Improvements in Java 8

In Java 8, HashMap replaces the linked list with another useful data structure i.e. binary tree on breaching a certain 
threshold, which is known as TREEIFY_THRESHOLD. Once this threshold is reached the linked list of Entries is converted 
to the TreeNodes which reduces the time complexity from O(n) to O(log(n)).

TreeNodes are nothing but the structures supporting the binary trees which have two nodes, smaller node goes to the left 
and the larger to the right. Whenever we want to search for any key the whole left or right subtree is discarded with 
a single check. This is how the time complexity is reduced to O(log(n). This change has lead to a significant improvement of HashMap.

Once the number of entries is decreased due to removal or resizing of HashMap, the structure is converted back to the older implementation which is LinkedList.

</details>

> ### How does `HashSet` work?
<details>
<summary>Answer</summary>
</details>
