import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Temperature Converter ---");

        // 1. Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitFromCelsius = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheitFromCelsius + "°F");

        System.out.println();

        // 2. Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusFromFahrenheit = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is equal to " + celsiusFromFahrenheit + "°C");

        scanner.close();
    }
}
