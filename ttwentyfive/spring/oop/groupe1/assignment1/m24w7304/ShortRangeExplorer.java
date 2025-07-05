package ttwentyfive.spring.oop.groupe1.assignment1.m24w7304;
public class ShortRangeExplorer {
    // Declare constants for special ASCII characters
    public static final char PLUS_MINUS_SYMBOL = '±';
    public static final char HALF_SYMBOL = '½';
    public static final char QUARTER_SYMBOL = '¼';

    public static void main(String[] args) {
        // Manually defining the range of short (since Short.MIN_VALUE = -32768, Short.MAX_VALUE = 32767)
        short minShort = (short) -Math.pow(2, 15); // -32768
        short maxShort = (short) (Math.pow(2, 15) - 1); // 32767

        // Calculate the total range using int to prevent overflow
        int totalRange = maxShort - minShort; // 65535

        // Calculate ¼ and ½ of the range
        double quarterRange = totalRange / 4.0;
        double halfRange = totalRange / 2.0;

        // Generate a random value within the range (between minShort and maxShort)
        int randomValue = (int) (Math.random() * (maxShort - minShort + 1)) + minShort;

        // Output
        System.out.println("The range of the short data type is approximately " + PLUS_MINUS_SYMBOL + totalRange / 2);
        System.out.println("The " + QUARTER_SYMBOL + " of this range is: " + PLUS_MINUS_SYMBOL + String.format("%.1f", quarterRange));
        System.out.println("The " + HALF_SYMBOL + " of this range is: " + PLUS_MINUS_SYMBOL + String.format("%.1f", halfRange));
        System.out.println("A random value within this range: " + PLUS_MINUS_SYMBOL + Math.abs(randomValue));
    }
}

