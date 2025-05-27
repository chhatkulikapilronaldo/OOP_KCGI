package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

import java.util.Scanner;

public class ModuloCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user give first number
        System.out.print("Enter the first number (dividend): ");
        int dividend = scanner.nextInt();

        //user give second number
        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display result 
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
