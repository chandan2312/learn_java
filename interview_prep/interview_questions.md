# Java Interview Questions & Answers

This document tracks interview questions related to the topics we have covered. It will be updated daily.

## Day 1: Introduction, JVM, and Basics

### Q1: What is the difference between JDK, JRE, and JVM?
**Answer:**
-   **JVM (Java Virtual Machine):** An abstract machine that executes Java bytecode. It is platform-dependent.
-   **JRE (Java Runtime Environment):** The implementation of JVM. It contains the JVM + libraries to *run* Java applications.
-   **JDK (Java Development Kit):** The full kit for developers. It contains the JRE + development tools like the compiler (`javac`) and debugger.

### Q2: Why is Java called "Platform Independent"?
**Answer:**
Java code is compiled into bytecode (`.class` file), which is not specific to any machine. This bytecode can be executed on any device that has a JVM. The JVM translates bytecode into native machine code. So, "Write Once, Run Anywhere".

### Q3: Explain `public static void main(String[] args)`.
**Answer:**
-   **public:** Access modifier; allows the JVM to call this method from outside.
-   **static:** Allows the method to be called without creating an object of the class.
-   **void:** The method returns nothing.
-   **main:** The identifier the JVM looks for as the starting point.
-   **String[] args:** Stores command-line arguments passed to the program.

### Q4: What happens if I write `static public void main` instead of `public static void main`?
**Answer:**
It works correctly. The order of access modifiers (`public`) and non-access modifiers (`static`) does not matter.

### Q5: Can I run a Java program without compiling it?
**Answer:**
From Java 11 onwards, you can run single-file source code directly using `java FileName.java`. The JVM compiles it in memory and runs it.

### Q6: What is the purpose of `System.out.println()`?
**Answer:**
-   **System:** A final class in `java.lang` package.
-   **out:** A static member field of System class instance of `PrintStream`.
-   **println():** A method of `PrintStream` class to print data on the console.

## Day 2: Variables, Data Types & Operators

### Q7: What are the 8 primitive data types in Java?
**Answer:**
`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`.

### Q8: What is the difference between `float` and `double`?
**Answer:**
-   `float`: Single precision (32-bit). Requires `f` suffix (e.g., `3.14f`).
-   `double`: Double precision (64-bit). Default for decimals in Java.

### Q9: What is the default value of a local variable?
**Answer:**
Local variables (declared inside methods) do **not** have a default value. You must initialize them before use, otherwise, the compiler will throw an error.

### Q10: What is the difference between `==` and `=`?
**Answer:**
-   `=`: Assignment operator (assigns value from right to left).
-   `==`: Relational operator (checks if two values are equal).

