package ttwentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class TemperatureConverter {
    public static void main(String[] args) {
    
        final double CELSIUS_TO_FAHRENHEIT_MULTIPLIER = 9.0 / 5.0;
        final double CELSIUS_TO_FAHRENHEIT_OFFSET = 32.0;

        double celsius = 25.0;

        double fahrenheit = celsius * CELSIUS_TO_FAHRENHEIT_MULTIPLIER + CELSIUS_TO_FAHRENHEIT_OFFSET;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
    }
}
