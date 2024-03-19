[Content](../README.md)

# Concurrency

> ### What is `wait()` `notify()` and `notifyAll()`?
<details>
<summary>Answer</summary>

These are final method of the class Object. Method wait() makes a thread be waiting until the thread gets notified.

Method notify() tells that the occupied object is available for processing. The choice of the thread to wake depends on 
the OS implementation of thread management. 

Method notifyAll() notifies all threads that the object is available.

Notify and notifyAll must be called in synchronized block

[WaitNotifyTest](../src/main/java/interview/java/concurrency/WaitNotifyTest.java)

</details>

> #### Explain `synchronized` methods work.
<details>
<summary>Answer</summary>

The `synchronized` key-word in java world lets avoid simultaneously use of a resource by multiple threads. 

When multiple threads are trying to access a recourse (variable, block of code, method), they are going to stay to a line.
That means when first thread doing its job, another are patiently waiting for it has done its job. In another word
the first thread locks the resource it occupied. This process when threads try to access shared object, also known as
race condition.

</details>


>#### Explain keyword ‘volatile’.
<details>
    <summary>Answer</summary>
    This keyword ensures that changes of a variable in a thread are immediately visible in the others threads.
</details>

>#### What is deadlock, race conditions.
<details>
<summary>Answer</summary>
</details>

> #### What is ExecutorService?
<details>
<summary>Answer</summary>

</details>
