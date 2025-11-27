import java.util.Scanner;

public class InteractiveHello {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Interactive Greeting System ---");
        System.out.print("Please enter your name: ");

        // Read the user's input
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome to the world of Java.");
        System.out.println("You have successfully written an interactive program.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
