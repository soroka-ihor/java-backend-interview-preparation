[Content](../README.md)

# Concurrency

> ### Explain `synchronized` methods work.
<details>
<summary>Answer</summary>

The `synchronized` key-word in java world lets avoid simultaneously use of a resource by multiple threads. 

When multiple threads are trying to access a recourse (variable, block of code, method), they are going to stay to a line.
That means when first thread doing its job, another are patiently waiting for it has done its job. In another word
the first thread locks the resource it occupied. This process when threads try to access shared object, also known as
race condition.

</details>

>#### Explain mutex, monitor, semaphore

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
