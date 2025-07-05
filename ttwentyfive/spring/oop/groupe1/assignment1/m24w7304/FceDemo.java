package ttwentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class FceDemo {
    // public - access modifier ... deals with fce/method visibility for other codes
    // static - we are literally saying this is function (belonging to the class) [wihtout usage of "static" we define method - belonging to an object]
    // void - here we say, that our function does not return any value
    // notice one simple rule - methods always start with lowercase letter!
    //() - empty brackets ... there is no input parameter [not empty () brackets ... there is input]

    public static void solveQuadraticEquation(double a, double b, double c){
        System.out.println(a + "*x^2 + "+b+"*x + "+c+" == 0");
        if (a<0){
            System.out.println("Not quadratic, if a == 0, then x power by two is zero, therefore it's linear function");
        }else{
            double discriminant = b*b - 4*a*c;
            System.out.println("Discriminant is: " + discriminant);

            if(discriminant == 0){
                double root = -b/(2*a);
                System.out.println("There is only one root: " + root);
            } else if (discriminant < 0) {
                System.out.println("No real solution, use complex numbers.");
            } else{
                // discriminant > 0
                double root1 = (-b+Math.sqrt(discriminant))/(2*a);
                double root2 = (-b-Math.sqrt(discriminant))/(2*a);
                System.out.println("There are two roots.");
                System.out.println("Root 1 is: " + root1);
                System.out.println("Root 2 is: " + root2);
            }
        }
    }

    public static void welcome(){
        System.out.println("Hi class, happy to see you again!");
    }

    public static void sayWhatItellYouToSay(String input){
        System.out.println("Hi, " + input + "!");
    }

    public static void main(String[] args) {
        System.out.println(calculateArea(3));
        System.out.println(calculateArea(5,6));

        /*
        32.0°F = 0.0°C
        98.6°F = 37.0°C
        -40.0°F = -40.0°C
        */

        System.out.println(fahrenheitToCelsius(98.6));

        System.out.println();
        System.out.println("muhehe");

        welcome();
        sayWhatItellYouToSay("yaaay");

        solveQuadraticEquation(3,-5,1);
        solveQuadraticEquation(2,-1,1);

        /*
        for (int coeficient_a = -3; coeficient_a < 3; coeficient_a++) {
            for (int coeficient_b = -3; coeficient_b < 3; coeficient_b++) {
                for (int coeficient_c = -3; coeficient_c < 3; coeficient_c++) {
                    solveQuadraticEquation(coeficient_a,coeficient_b,coeficient_c);
                }
            }
        }
        */
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        //Takes a double parameter (fahrenheit) and returns the temperature in Celsius
        //C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    /*
    Create a method called calculateArea with the following overloaded versions:
    Takes one double parameter (side) and returns the area of a square
    Takes two double parameters (length, width) and returns the area of a rectangle
    In the main method:
    Call each version of the method with appropriate values
    Print the results with proper labels indicating what shape's area was calculated
    Expected output:
    Area of square with side 5.0: 25.0 square units
    Area of rectangle with length 4.0 and width 6.0: 24.0 square units
    */
    public static double calculateArea(double side){
        // we deal with square
        return side*side;
    }

    public static double calculateArea(double length, double width){
        // we deal with rectangle
        return length*width;
    }
}
