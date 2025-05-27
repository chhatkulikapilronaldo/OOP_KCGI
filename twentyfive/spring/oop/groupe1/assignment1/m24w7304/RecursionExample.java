package twentyfive.spring.oop.groupe1.assignment1.m24w7304;
import java.util.Scanner;

public class RecursionExample {

    // Recursive method to count down and return sum
    public static int countDown(int n) {
        //base case
    	if (n <= 0) {
            return 0;
        }
        //System.out.print(n + " ");
        //recursive case
        return n + countDown(n - 1);
    }

    // Recursive method to calculate base^exponent
    public static int powerOf(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * powerOf(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for countDown
        System.out.print("Enter a number to count down: ");
        int n = input.nextInt();
        System.out.print("Counting down from " + n + ": ");
        int sum = countDown(n);
        System.out.println("\nSum: " + sum);

        // Get input for powerOf
        System.out.print("\nEnter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();
        int result = powerOf(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);

    }
}

