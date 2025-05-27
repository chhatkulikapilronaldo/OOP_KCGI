package twentyfive.spring.oop.groupe1.assignment1.m24w7304;


import java.util.Scanner;

public class calculateArea {

    public static double calculateArea(double side) {
        return side * side;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Square area
        System.out.print("Enter side of square: ");
        double side = input.nextDouble();
        System.out.println("Area of square = " + calculateArea(side));

        // Rectangle area
        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = input.nextDouble();
        System.out.println("Area of rectangle = " + calculateArea(length, width));

    }
}
