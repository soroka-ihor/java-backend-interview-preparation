[Main page](../README.md)

# Java Core


> #### Explain exception hierarchy.
<details>
<summary>Answer</summary>
In the top of hierarchy stays Throwable. Then this interface gets extended by Exception and Error. Exception is used for 
conditions that the application may need to handle. Error indicates about serious JVM’s problems such as OutOfMemoryException, 
Could not be handled. RuntimeException for conditions that may occurs during runtime. Not checked.
</details>

> ####  Explain try-with-resources. Interface Autocloseable.
<details>
<summary>Answer</summary>

Try-with-resources statement is used for such objects that must be closed after they give their data. These objects must 
implement interface Autocloseable. Example: FileReader
</details>

> #### Explain contract between `hashcode()` and `equals()`
<details>
<summary>Answer</summary>

</details>

> #### What is inner (static) classes?
<details>
<summary>Answer</summary>

[Inner static class example](../src/main/java/interview/java/core/InnerStatic.java)
[Inner non-static class example](../src/main/java/interview/java/core/InnerNonStatic.java)

</details>

> #### What is diamond problem? Why they introduced default methods in an interface?
<details>
<summary>Answer</summary>

Diamond problem occurs upon multiple inheritance, when two or more parent classes have the same method signature.
Can be solved by switching to interfaces

</details>

> #### Why are not `List<Integer>` and `List<Number>` covariant?
<details>
<summary>Answer</summary>
</details>

> #### Why are `Number[]` and `Integer[]` covariant?
<details>
<summary>Answer</summary>
</details>

> #### Why is type erasure?
<details>
<summary>Answer</summary>


</details>


> ### Does implementation of Integer have hashcode method?
<details>
<summary>Answer</summary>

Yes, it has, but it returns just its int value.

</details>

> ### Does implementation of Long have hashcode method?
<details>
<summary>Answer</summary>

Yes, it has. It makes bitwise shift to the left for 32 bits, than it makes XOR operation with the initial value

</details>

[to content](#java-core)
