# Day 4: Control Flow (Loops)

## 1. Loops Overview
Loops allow us to repeat a block of code multiple times.

### Types of Loops
1.  **`for` loop:** Use when you know exactly how many times to iterate.
2.  **`while` loop:** Use when you want to loop *while* a condition is true.
3.  **`do-while` loop:** Similar to `while`, but guarantees at least one execution.

### Nested Loops
A loop inside another loop. This is common for working with 2D grids (matrices) or patterns.

```java
// Example: Grid of stars
for (int i = 0; i < 3; i++) {       // Outer loop (Rows)
    for (int j = 0; j < 3; j++) {   // Inner loop (Columns)
        System.out.print("* ");
    }
    System.out.println(); // New line after each row
}
```

## 2. The Logic of Patterns
Printing patterns (like pyramids or diamonds) requires finding the mathematical relationship between the **row number** (`i`) and:
1.  The number of **spaces** to print.
2.  The number of **stars** to print.

For a pyramid of height `n`:
- Spaces = `n - i`
- Stars = `2 * i - 1`

## 3. Loop Optimization & Control
When working with loops, performance matters.

### Break and Continue
-   `break`: Exits the loop immediately.
-   `continue`: Skips the current iteration and moves to the next one.

### Optimization Example: Prime Numbers
To check if `n` is prime, a naive approach checks all numbers from 2 to `n-1`.
**Optimized:** You only need to check up to `Math.sqrt(n)`.
-   If `n` has a factor larger than its square root, the *other* factor must be smaller than the square root.
-   This reduces complexity from O(n) to O(sqrt(n)).
