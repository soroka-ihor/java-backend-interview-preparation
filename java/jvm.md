[Main page](../README.md)

> #### Which memory types JAVA has? Tell about JAVA memory model.
<details>
<summary>Answer</summary>
[JVM memory model](https://www.digitalocean.com/community/tutorials/java-jvm-memory-model-memory-management-in-java) has two major memory types:

- Heap
- Stack

Heap in turns is divided to a few part such as `young generation` and `old generation`. Heap is used by java to allocate
memory to Objects. Any new object is always created in the heap.
Stack memory is used for storing values for invoking methods: it holds local primitives and links to objects in heap.
</details>

> #### Tell about heap structure
<details>
<summary>Answer</summary>

Java Heap memory is physically divided into two parts – `Young Generation` and `Old Generation`.

Young Generation (Eden) is for newly-allocated objects having three parts — Eden Memory and two Survivor Memory spaces (S0, S1).
Once Eden space is filled with objects, Minor GC happens and all the survivor objects are moved to one of the survivor spaces. 
Objects that survive many cycles of GC, are moved to the Old generation memory space. Usually it’s done by setting a threshold 
for the age of the young generation objects before they become eligible to promote to Old generation.

Old Generation (Old Memory) memory contains the objects that are long-lived and survived after many rounds of Minor GC. 
Usually, garbage collection is performed in Old Generation memory when it’s full. 
Old Generation Garbage Collection is called Major GC and usually takes a longer time.

</details>

> #### Tell about kind of GC
<details>
<summary>Answer</summary>

JVM has four types of GC implementations:

1. Serial Garbage Collector. This is the simplest GC implementation, as it basically works with a single thread. 
   As a result, this GC implementation freezes all application threads when it runs.
2. Parallel Garbage Collector. It’s the default GC of the JVM from Java 5 until Java 8 and is sometimes called Throughput Collectors. 
   Unlike Serial Garbage Collector, it uses multiple threads for managing heap space, but it also freezes other application threads while performing GC.
3. G1 Garbage Collector. G1 (Garbage First) Garbage Collector is designed for applications running on multi-processor machines with large memory space. 
   It’s available from the JDK7 Update 4 and in later releases.
4. Z Garbage Collector. ZGC performs all expensive work concurrently, without stopping the execution of 
   application threads for more than 10 ms, which makes it suitable for applications that require low latency.
   Comes in JAVA 14 for Linux as an experimental GC. 

</details>
