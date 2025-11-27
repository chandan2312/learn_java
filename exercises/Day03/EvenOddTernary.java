package exercises.Day03;

import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using Ternary Operator to check for even/odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);

        scanner.close();
    }
}
