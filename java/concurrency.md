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

> #### What is interrupt?
<details>
<summary>Answer</summary>

Interrupt is a method in the class Thread. It sets the boolean variable `interrupted` to `true`.

</details>

> #### Which states of a threads exists?
<details>
<summary>Answer</summary>

NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED

</details>

> #### What is the difference between a thread and a process?
<details>
<summary>Answer</summary>

The difference is that process might contain itself a few threads. Also that threads use one memory scope.

</details>

> #### How to stop a thread?
<details>
<summary>Answer</summary>

Call the `interrupt()` method. Even though it leads to a thread to be stopped, but it doesn't stops a thread itself. 
It just sets variable `interrupted` of the class `Thread` to `true`. In a good practice we should run while
currentThread is not interrupted.

</details>

> #### What is ThreadLocal in java?
<details>
<summary>Answer</summary>

The Java ThreadLocal class enables you to create variables that can only be read and written by the same thread. 
Thus, even if two threads are executing the same code, and the code has a reference to the same ThreadLocal 
variable, the two threads cannot see each other's ThreadLocal variables. 
Thus, the Java ThreadLocal class provides a simple way to make code thread safe that would not otherwise be so.

[Example](../src/main/java/interview/java/concurrency/threadlocal/Runner.java)

</details>

> #### What are differences between methods `sleep()` and `yield()`?
<details>
<summary>Answer</summary>

Sleep pauses immediately a thread for a particular amount of milliseconds, while yield just wants to pause
its a thread's execution to give a chance for the remaining threads with the same priority.

</details>