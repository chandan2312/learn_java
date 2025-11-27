import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant for PI
        final double PI = 3.14159;

        System.out.println("--- Circle Properties Calculator ---");

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculations
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        // Output
        System.out.println("\nResults for radius " + radius + ":");
        System.out.println("Area: " + area);
        System.out.println("Perimeter (Circumference): " + perimeter);

        scanner.close();
    }
}
