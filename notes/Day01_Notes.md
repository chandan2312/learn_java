# Day 1: Introduction & Setup

Welcome to your first day of Java! Today we will lay the foundation for your journey.

## 1. What is Java?
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers **write once, run anywhere** (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.

## 2. Key Concepts: JVM, JRE, and JDK
Understanding these three acronyms is crucial.

### JVM (Java Virtual Machine)
- **What it is:** An abstract machine that provides a runtime environment in which Java bytecode can be executed.
- **Role:** It loads code, verifies code, executes code, and manages memory.
- **Platform Dependence:** JVMs are specific to the operating system (Windows, Linux, macOS), but they all run the same Java bytecode.

### JRE (Java Runtime Environment)
- **What it is:** The implementation of the JVM. It physically exists.
- **Contents:** JVM + Core Libraries (classes) + Supporting files.
- **Use Case:** If you only want to *run* Java programs, you need the JRE.

### JDK (Java Development Kit)
- **What it is:** A full-featured software development kit for Java.
- **Contents:** JRE + Development Tools (Compiler `javac`, Debugger, Javadoc, etc.).
- **Use Case:** If you want to *write and compile* Java programs, you need the JDK.

**Hierarchy:**
> JDK = JRE + Development Tools
> JRE = JVM + Library Classes

## 3. Your First Program: Hello World

Let's look at the anatomy of a simple Java program.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Breakdown
1.  **`public class HelloWorld`**:
    -   Every Java application must have at least one class definition.
    -   The name of the class (`HelloWorld`) must match the filename (`HelloWorld.java`).
    -   `public` is an access modifier, meaning this class is visible to everyone.

2.  **`public static void main(String[] args)`**:
    -   This is the **entry point** of any Java application.
    -   `public`: The method is accessible from everywhere.
    -   `static`: The method belongs to the class, not a specific instance of the class. The JVM calls this method without creating an object.
    -   `void`: The method does not return any value.
    -   `main`: The name of the method.
    -   `String[] args`: An array of strings passed as command-line arguments.

3.  **`System.out.println("Hello, World!");`**:
    -   `System`: A built-in class that contains useful methods and variables.
    -   `out`: A static variable within System that represents the standard output (your console).
    -   `println`: A method that prints a line of text to the console.

## 4. Comments
Comments are parts of the code ignored by the compiler. They are for humans to read.

-   **Single-line comment:** Starts with `//`. Everything after it on that line is ignored.
    ```java
    // This is a comment
    System.out.println("Hi"); // This is also a comment
    ```
-   **Multi-line comment:** Starts with `/*` and ends with `*/`.
    ```java
    /* This is a multi-line comment.
       It can span multiple lines. */
    ```

## 5. Escape Sequences
Special characters preceded by a backslash `\` to represent non-printable or reserved characters.

-   `\n`: Newline (moves cursor to the next line)
-   `\t`: Tab (adds horizontal space)
-   `\"`: Double quote (prints a `"` character)
-   `\\`: Backslash (prints a `\` character)

```java
System.out.println("Hello\nWorld"); // Prints Hello and World on separate lines
System.out.println("Name:\tJohn");  // Prints Name:    John
```

## 6. Command Line Arguments
Remember `String[] args` in the main method? That array stores values passed to the program when you run it.

```java
public class HelloName {
    public static void main(String[] args) {
        // args[0] accesses the first argument passed
        System.out.println("Hello, " + args[0] + "!");
    }
}
```

**Running it:**
`java HelloName Alice`
**Output:**
`Hello, Alice!`

## 7. Interactive Input (Scanner)
To make programs truly interactive, we need to read input while the program is running. We use the `Scanner` class for this.

```java
import java.util.Scanner; // 1. Import the Scanner class

public class InteractiveHello {
    public static void main(String[] args) {
        // 2. Create a Scanner object connected to System.in (Keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // 3. Read a line of text
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Nice to meet you.");
        
        // 4. Close the scanner
        scanner.close(); 
    }
}
```

## 8. Common Errors (Troubleshooting)
As a beginner, you will encounter these often. Don't panic!

1.  **Missing Semicolon (`;`)**:
    -   Error: `error: ';' expected`
    -   Fix: Check the end of your code lines.

2.  **Class Name Mismatch**:
    -   Error: `class HelloWorld is public, should be declared in a file named HelloWorld.java`
    -   Fix: Ensure `public class Name` matches `Name.java`.

3.  **Case Sensitivity**:
    -   Java is case-sensitive. `System` is not `system`. `Main` is not `main`.

4.  **Missing Braces (`{}`)**:
    -   Ensure every opening brace has a matching closing brace.

## 9. Practical Exercise
We will now create this file and run it.

1.  Create a file named `InteractiveHello.java`.
2.  Write the code above.
3.  Compile it using `javac InteractiveHello.java`.
4.  Run it using `java InteractiveHello`.
