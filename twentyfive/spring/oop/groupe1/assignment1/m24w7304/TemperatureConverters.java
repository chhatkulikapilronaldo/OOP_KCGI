package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

import java.util.Scanner;

public class TemperatureConverters {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitResult = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheitResult + "°F");

        // Get Fahrenheit input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsiusResult + "°C");

        scanner.close();
    }
}

