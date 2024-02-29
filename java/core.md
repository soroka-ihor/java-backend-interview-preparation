[Content](../README.md)

# Java Core

- [Which memory types JAVA has? Tell about JAVA memory model.](#какие-бывают-операции-в-стримах-напишите-стрим)


### 1. Which memory types JAVA has? Tell about JAVA memory model.
[JVM memory model](https://www.digitalocean.com/community/tutorials/java-jvm-memory-model-memory-management-in-java) has two major memory types:

- Heap
- Stack

Heap in turns is divided to a few part such as `young generation` and `old generation`. Heap is used by java to allocate
memory to Objects. Any new object is always created in the heap.
Stack memory is used for storing values for invoking methods: it holds local primitives and links to objects in heap.

### 2.	Explain keyword ‘volatile’.
This keyword ensures that changes of a variable in a thread are immediately visible in the others threads.

### 3. Explain exception hierarchy.
In the top of hierarchy stays Throwable. Then this interface gets extended by Exception and Error. Exception is used for 
conditions that the application may need to handle. Error indicates about serious JVM’s problems such as OutOfMemoryException, 
Could not be handled. RuntimeException for conditions that may occurs during runtime. Not checked.

### 4. Explain try-with-resources. Interface Autocloseable.
Try-with-resources statement is used for such objects that must be closed after they give their data. These objects must 
implement interface Autocloseable. Example: FileReader


[to content](#java-core)
