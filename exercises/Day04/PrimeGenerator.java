package exercises.Day04;

import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find prime numbers up to: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            // Optimization: Check only up to square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Found a factor, no need to check further
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // New line at the end

        scanner.close();
    }
}
