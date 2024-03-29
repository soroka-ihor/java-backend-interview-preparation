[Content](../README.md)

# Databases



> #### 1. Union VS Join.
<details>
<summary>Answer</summary>

</details>

> #### 2. A.C.I.D properties. Level of isolation in transactions.
<details>
<summary>Answer</summary>

A – stands for “atomicity”. Ensures that the all operations in a transaction are completed or canceled in case of an error.
C – stands for Consistency. That property ensures that the database stay in consistent state after a transaction is completed,
so no foreign keys, primary keys are not broken and linked data is updated. 
I – stands for Isolation. Isolation levels provide correct result in case of concurrent transactions. There are 3 read phenomena (problems): dirty read, repeatable read,
phantom read. Dirty read – when a transaction reads uncommitted data; repeatable read – when a transaction reads the same
thing twice and gets different results each time; repeatable read – when a transaction reads the same thing twice and gets
different amount of rows. To handle that there are 4 level of isolation: READ UNCOMMITTED, READ COMMITTED, REPEATABLE READ,
SERIALIZABLE.
D - Durability. Ensures that transactions that have been committed are permanently stored in the database.

</details>

> #### How to analyze sql query performance?
<details>
<summary>Answer</summary>

Query plan

</details>

[to content](#java-core)
