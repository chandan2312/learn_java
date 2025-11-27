# Day 2: Variables, Data Types & Operators

Welcome to Day 2! Today we dive into the building blocks of Java: storing data and manipulating it.

## 1. Variables
A variable is a container that holds data. Think of it like a box with a label.
To create a variable, you must specify its **type** and **name**.

```java
int age = 25; // Type: int, Name: age, Value: 25
```

## 2. Data Types
Java is **statically typed**, meaning every variable must have a declared type.

### A. Primitive Data Types (8 types)
These store simple values directly.

| Type | Size | Description | Example |
| :--- | :--- | :--- | :--- |
| `byte` | 1 byte | Very small numbers (-128 to 127) | `byte b = 100;` |
| `short` | 2 bytes | Small numbers | `short s = 30000;` |
| `int` | 4 bytes | Standard integers (default) | `int i = 100000;` |
| `long` | 8 bytes | Large integers (end with 'L') | `long l = 100000L;` |
| `float` | 4 bytes | Decimals (end with 'f') | `float f = 5.75f;` |
| `double` | 8 bytes | Precise decimals (default) | `double d = 19.99;` |
| `char` | 2 bytes | Single character (single quotes) | `char c = 'A';` |
| `boolean`| 1 bit | True or False | `boolean isJavaFun = true;` |

### B. Non-Primitive (Reference) Data Types
These refer to objects. The most common one is `String`.
-   **String:** A sequence of characters.
    ```java
    String greeting = "Hello";
    ```

## 3. Operators
Operators allow us to perform operations on variables.

### Arithmetic Operators
-   `+` (Addition)
-   `-` (Subtraction)
-   `*` (Multiplication)
-   `/` (Division)
-   `%` (Modulus - Remainder)

### Relational Operators (Comparison)
-   `==` (Equal to)
-   `!=` (Not equal to)
-   `>` (Greater than)
-   `<` (Less than)
-   `>=` (Greater than or equal to)
-   `<=` (Less than or equal to)

### Logical Operators
-   `&&` (AND) - True if both are true
-   `||` (OR) - True if at least one is true
-   `!` (NOT) - Reverses the value

## 4. Practical Exercise
Let's build a **Simple Calculator** that takes two numbers and performs these operations.

1.  Create `SimpleCalculator.java`.
2.  Use `Scanner` to get two numbers.
3.  Print the sum, difference, product, and quotient.
