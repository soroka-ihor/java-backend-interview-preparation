[Main page](../README.md)

# Spring

>#### What are components of Spring framework? 
<details>
<summary>Answer</summary>

The Spring Framework consists of features organized into about 20 modules. These modules are grouped into Core Container, 
Data Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation, and Test, as shown in the following 
diagram.

![img.png](img.png)
</details>

>#### What is spring bean lifecycle?
<details>
<summary>Answer</summary>

Bean life cycle is managed by the spring container. When we run the program then, first of all, the spring container gets started. 
After that, the container creates the instance of a bean as per the request, and then dependencies are injected. And finally, the bean is destroyed when the spring container is closed. Therefore, if we want to execute some code on the bean instantiation and just after closing the spring container, then we can write that code inside the custom init() method and the destroy() method.

![img_1.png](img_1.png)
</details>

>#### What are spring bean scopes?
<details>
    <summary>Answer</summary>
</details>

>#### `@Transactional` and its property `Propagation`
<details>
    <summary>Answer</summary>

`@Transactional` can be applied to class and method level. Won't apply to parent class. Has 7 propagation levels:

1. Required (default): My method needs a transaction, either open one for me or use an existing one → getConnection(). setAutocommit(false). commit().
2. Supports: I don’t really care if a transaction is open or not, i can work either way → nothing to do with JDBC
3. Mandatory: I’m not going to open up a transaction myself, but I’m going to cry if no one else opened one up → nothing to do with JDBC
4. Require_new: I want my completely own transaction → getConnection(). setAutocommit(false). commit().
5. Not_Supported: I really don’t like transactions, I will even try and suspend a current, running transaction → nothing to do with JDBC
6. Never: I’m going to cry if someone else started up a transaction → nothing to do with JDBC
7. Nested: It sounds so complicated, but we are just talking savepoints! → connection.setSavepoint()

Example:


```java
    public class UserService {

     @Transactional(propagation = Propagation.MANDATORY)
     public void myMethod() {
        // execute some sql
     }
}
```

In this case, Spring will expect a transaction to be open, whenever you call myMethod() of the UserService class. 
It does not open one itself, instead, if you call that method without a pre-existing transaction, Spring will 
throw an exception. Keep this in mind as additional points for "logical transaction handling".

Can be used with a hibernate's transaction manager. In the end it's all about plain JDBC
getConnection(). setAutocommit(false). commit()

[More](https://www.marcobehler.com/guides/spring-transaction-management-transactional-in-depth)
</details>

>#### What is SpringMVC (DispatcherServlet)?
<details>
    <summary>Answer</summary>
</details>

>#### Differences between `@Controller` and `@RestController`
<details>
    <summary>Answer</summary>
</details>

>#### Differences between dependency injection (DI) and inversion of control (IoT)
<details>
    <summary>Answer</summary>
</details>
