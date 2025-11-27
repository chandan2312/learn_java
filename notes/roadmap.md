# 30-Day Java Learning Roadmap

This roadmap is designed to take you from a complete beginner to an advanced Java developer over 30 days. It leverages the resources we have cloned to provide a mix of theory, practical coding, and interview preparation.

**Resources Key:**
- `[Course]` = `java-a-course-for-beginners` (Primary Structure)
- `[Notes]` = `Complete_Java_Course_Notes` & `Java_Notes_and_Programs`
- `[Interview]` = `Java-Programming-Notes` & `Important-Java-Concepts`

---

## Phase 1: The Foundation (Days 1-7)
**Goal:** Master the syntax, basic control structures, and introduction to Object-Oriented Programming (OOP).

- **Day 1: Introduction & Setup**
    - **Topics:** Java History, JVM/JRE/JDK, Installing Java & Eclipse/IntelliJ, First "Hello World".
    - **Practice:** Run your first Java program.
    - **Resources:** `[Course]/00-01...`, `[Notes]/JavaLesson001`

- **Day 2: Variables, Data Types & Operators**
    - **Topics:** Primitives (int, double, boolean, etc.), Casting, Operators (Arithmetic, Relational, Logical).
    - **Practice:** Build a simple calculator or currency converter.
    - **Resources:** `[Course]/06-PrimitiveDataTypes...`, `[Notes]/JavaLesson002-003`

- **Day 3: Control Flow (Conditionals)**
    - **Topics:** if-else, switch statements, ternary operator.
    - **Practice:** "Grade Calculator", "Leap Year Checker".
    - **Resources:** `[Course]/07-Conditionals`, `[Notes]/JavaLesson004`

- **Day 4: Control Flow (Loops)**
    - **Topics:** Nested loops, break/continue, optimization logic.
    - **Practice:** "Diamond Pattern Printer", "Prime Number Generator (Optimized)".
    - **Resources:** `[Course]/08-Loops`, `[Notes]/JavaLesson005`

- **Day 5: Methods & Recursion**
    - **Topics:** Stack memory, Pass-by-Value, Recursion vs Iteration.
    - **Practice:** "Fibonacci Sequence (Recursive vs Iterative)", "Factorial with Memoization".
    - **Resources:** `[Course]/02-IntroductionToMethods...`

- **Day 6: OOP - Classes & Object Lifecycle**
    - **Topics:** Constructors, `this`, `static` vs instance, Object initialization order.
    - **Practice:** "Employee Management System" (with static ID generation and validation).
    - **Resources:** `[Course]/05-IntroductionToOOP...`, `[Notes]/JavaLesson006`

- **Day 7: Review & Mini-Project 1**
    - **Project:** **ATM Simulation** (PIN validation, daily limits, transaction logs, persistence).
    - **Revision:** Review notes from `[Important-Java-Concepts]`.

---

## Phase 2: OOP Mastery & Core Libraries (Days 8-14)
**Goal:** Deep dive into OOP principles and essential Java libraries.

- **Day 8: OOP - Encapsulation & Inheritance**
    - **Topics:** Protected access, `super` constructor chaining, Upcasting/Downcasting.
    - **Practice:** "E-Commerce Product Hierarchy" (Digital vs Physical products with tax rules).
    - **Resources:** `[Course]/11-OOPAgain`, `[Notes]/JavaLesson007-008`

- **Day 9: OOP - Polymorphism & Abstraction**
    - **Topics:** Method Overriding, Abstract classes, Interfaces.
    - **Practice:** Implement `Shape` interface with `Circle`, `Rectangle`.
    - **Resources:** `[Course]/11-OOPAgain`, `[Notes]/JavaLesson009-010`

- **Day 10: Arrays & Matrices**
    - **Topics:** Multi-dimensional arrays, Array memory layout, Algorithms.
    - **Practice:** "Matrix Multiplication" or "Sudoku Validator".
    - **Resources:** `[Course]/10-ArraysAndArrayList`, `[Notes]/JavaLesson011-012`

- **Day 11: String Manipulation**
    - **Topics:** String class, Immutability, StringBuilder/StringBuffer, Common methods.
    - **Practice:** "Palindrome Checker", "Word Counter".
    - **Resources:** `[Course]/09-ReferenceTypes`, `[Notes]/JavaLesson013`

- **Day 12: Exception Handling**
    - **Topics:** try-catch-finally, throw, throws, Custom Exceptions.
    - **Practice:** Add error handling to Banking System (e.g., `InsufficientFundsException`).
    - **Resources:** `[Course]/16-ExceptionHandling`, `[Notes]/JavaLesson014`

- **Day 13: Wrapper Classes & Autoboxing**
    - **Topics:** Integer, Double, etc., Autoboxing/Unboxing.
    - **Practice:** Refactor previous collections to use Wrappers explicitly.
    - **Resources:** `[Course]/06-PrimitiveDataTypes...`

- **Day 14: Review & Mini-Project 2**
    - **Project:** **Library Management System** (Books, Members, Lending logic) using OOP and Lists.
    - **Revision:** `[Interview]/Core java cheat sheet.pdf`.

---

## Phase 3: Advanced Core Java (Days 15-22)
**Goal:** Master collections, generics, and concurrent programming.

- **Day 15: The Collections Framework (List, Set)**
    - **Topics:** LinkedList, HashSet, TreeSet, Iterators.
    - **Practice:** "Unique Word Filter" (using Set).
    - **Resources:** `[Course]/12-Collections`, `[Notes]/JavaLesson015`

- **Day 16: The Collections Framework (Map)**
    - **Topics:** HashMap, TreeMap, Key-Value pairs.
    - **Practice:** "Phonebook Application" or "Frequency Counter".
    - **Resources:** `[Course]/12-Collections`, `[Notes]/JavaLesson016`

- **Day 17: Generics**
    - **Topics:** Generic classes, methods, wildcards.
    - **Practice:** Create a custom Generic `Box<T>` class.
    - **Resources:** `[Course]/13-Generics`, `[Notes]/JavaLesson017`

- **Day 18: Functional Programming (Lambdas & Streams)**
    - **Topics:** Lambda expressions, Functional Interfaces, Stream API (filter, map, reduce).
    - **Practice:** Process a list of Transactions using Streams.
    - **Resources:** `[Course]/14-FunctionalProgramming`

- **Day 19: Multithreading & Concurrency**
    - **Topics:** Threads, Runnable, Lifecycle, Synchronization.
    - **Practice:** "Producer-Consumer Problem" or "Multi-threaded Downloader".
    - **Resources:** `[Course]/15-ThreadsAndConcurrency`, `[Notes]/JavaLesson018`

- **Day 20: File I/O (NIO)**
    - **Topics:** Reading/Writing files, Paths, Files class.
    - **Practice:** Save/Load Library System data to a text file.
    - **Resources:** `[Course]/17-Files`, `[Notes]/JavaLesson019`

- **Day 21: Java New Features (Java 8-17)**
    - **Topics:** Records, Switch Expressions, Text Blocks, Var, Modules.
    - **Practice:** Refactor old code to use new features.
    - **Resources:** `[Course]/31-java-new-api-features`

- **Day 22: Review & Mini-Project 3**
    - **Project:** **File-based Task Manager** with search and sorting (using Streams).
    - **Revision:** `[Interview]/Java Interview Questions.pdf`.

---

## Phase 4: Applied Java & Frameworks (Days 23-30)
**Goal:** Introduction to modern development practices and Spring Boot.

- **Day 23: Maven & Dependency Management**
    - **Topics:** pom.xml, dependencies, build lifecycle.
    - **Practice:** Convert a project to a Maven project.

- **Day 24: Unit Testing with JUnit**
    - **Topics:** Writing tests, Assertions, @Test, @Before/@After.
    - **Practice:** Write tests for the Calculator or Banking System.

- **Day 25: Introduction to Spring Framework**
    - **Topics:** Dependency Injection (DI), Inversion of Control (IoC).
    - **Resources:** `[Course]/51-learn-spring-framework`

- **Day 26: Introduction to Spring Boot**
    - **Topics:** Starters, Auto-configuration, Embedded Server.
    - **Practice:** Create a "Hello World" Spring Boot API.
    - **Resources:** `[Course]/52-learn-spring-boot`

- **Day 27: Building a REST API**
    - **Topics:** @RestController, @GetMapping, @PostMapping.
    - **Practice:** Build a "Todo List API".

- **Day 28: Database Connectivity (JDBC/JPA)**
    - **Topics:** Connecting to a DB, Basic SQL, Spring Data JPA intro.
    - **Practice:** Connect Todo API to an H2 in-memory database.

- **Day 29: Final Project - Part 1**
    - **Project:** **Full-stack capable Backend** (e.g., E-commerce Product API).
    - **Activity:** Design, Setup, and basic CRUD.

- **Day 30: Final Project - Part 2 & Wrap-up**
    - **Activity:** Complete the API, add validation, and final review.
    - **Future Path:** Roadmap for next steps (Microservices, Cloud, etc.).

---

## Daily Routine
1.  **Theory (30 mins):** I will explain the concept using notes from our resources.
2.  **Code Walkthrough (30 mins):** We will analyze example code from the cloned repos.
3.  **Practical Exercise (60 mins):** We will write code together to solve a problem.
4.  **Notes & Revision:** I will generate a summary note for the day.
5.  **Interview Prep:** I will update the interview questions folder (only mentioned upon request).
