# Day 3: Control Flow (Part 1)

## 1. If-Else Statements
Control flow allows your program to make decisions. The most basic form is the `if` statement.

### Syntax
```java
if (condition) {
    // code to execute if condition is true
} else if (anotherCondition) {
    // code to execute if anotherCondition is true
} else {
    // code to execute if none of the above are true
}
```

### Example
```java
int age = 20;
if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}
```

### Logical Operators
- `&&` (AND): Both conditions must be true.
- `||` (OR): At least one condition must be true.
- `!` (NOT): Reverses the boolean value.

## 2. Switch Statements
The `switch` statement is an alternative to a long chain of `if-else-if` when you are comparing a single variable against multiple constant values.

### Syntax
```java
switch (expression) {
    case value1:
        // code to execute
        break;
    case value2:
        // code to execute
        break;
    default:
        // code to execute if no case matches
}
```

### Key Points
-   The `break` keyword stops the execution. Without it, the program "falls through" to the next case.
-   Supported types: `byte`, `short`, `char`, `int`, `String` (Java 7+), and Enums.

### Example
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

## 3. Ternary Operator
The ternary operator is a shorthand for `if-else`. It takes three operands.

### Syntax
```java
variable = (condition) ? expressionTrue : expressionFalse;
```

### Example
```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```

## 4. Complex Logic & Ranges (Progressive Calculation)
Real-world logic often requires more than simple `if-else` checks. A common scenario is **progressive calculation**, like tax brackets.

### The Problem
Calculating tax isn't always a flat percentage.
- **Wrong:** `if (income > 50000) tax = income * 0.20;`
- **Right:** You only pay 20% on the amount *above* the threshold.

### The Pattern
To handle this, we calculate in "chunks":
1.  Check if the value exceeds the highest bracket.
2.  Calculate tax for that top chunk.
3.  Add the max tax from all lower brackets.

```java
// Example: First 10k free, next 30k at 10%, rest at 20%
if (income <= 10000) {
    tax = 0;
} else if (income <= 40000) {
    tax = (income - 10000) * 0.10;
} else {
    // Full tax on the middle bracket (30k * 10% = 3000)
    // Plus 20% on whatever is left above 40k
    tax = 3000 + (income - 40000) * 0.20;
}
```
