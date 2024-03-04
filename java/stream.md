[Main page](../README.md)



> ### Why java streams are 'lazy'?
<details>
<summary>Answer</summary>

Because it processes its data only when a terminal operation is called.

</details>


> ### What are intermediate operations (e.g. peek)?
<details>
<summary>Answer</summary>

An intermediate operation in java streams API is an operation, that returns another stream, so it's possible to 
combine these streams to a pipeline. Example of the intermediate operations:

* filter()
* map()
* flatMap()
* distinct()
* sorted()
* peek()
* limit()
* skip()

</details>

> ### What is spliterator?
<details>
<summary>Answer</summary>

`Spliterator<T>` is an interface that lets, as it name says, split the stream into two equals parts.

[Example](../src/main/java/interview/java/core/stream/SpliteratorTest.java)

</details>