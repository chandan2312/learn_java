package exercises.Day03;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();
        double tax = 0.0;

        // Tax Brackets:
        // 0 - 10,000: 0%
        // 10,001 - 40,000: 10%
        // 40,001 - 100,000: 20%
        // Above 100,000: 30%

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 40000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 100000) {
            // First 10k is free
            // Next 30k (40k - 10k) is taxed at 10% -> 3000
            // Remaining is taxed at 20%
            tax = (30000 * 0.10) + (income - 40000) * 0.20;
        } else {
            // First 10k is free
            // Next 30k is taxed at 10% -> 3000
            // Next 60k (100k - 40k) is taxed at 20% -> 12000
            // Remaining is taxed at 30%
            tax = (30000 * 0.10) + (60000 * 0.20) + (income - 100000) * 0.30;
        }

        System.out.println("Total Tax: $" + tax);

        scanner.close();
    }
}
