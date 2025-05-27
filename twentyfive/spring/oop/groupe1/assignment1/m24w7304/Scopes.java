package twentyfive.spring.oop.groupe1.assignment1.m24w7304;
public class Scopes {
    // Instance variable - accessible anywhere inside this class for non-static methods
    String instanceVariable = "I am an instance variable";

    // Static variable - accessible anywhere inside this class in static methods
    static String staticVariable = "I am a static variable";

    public void methodExample() {
        // Local variable - only accessible inside this method
        String localVariable = "I am a local variable";

        System.out.println(instanceVariable);  // accessible here
        System.out.println(staticVariable);    // accessible here
        System.out.println(localVariable);     // accessible here
    }

    public static void main(String[] args) {
        Scopes obj = new Scopes();
        obj.methodExample();

        // Can't access localVariable here, it only exists inside methodExample
        // System.out.println(localVariable); // ERROR!

        System.out.println(staticVariable); // accessible because main is static and variable is static
        // System.out.println(instanceVariable); // ERROR! Can't access instance variable in static method without object
    }
}

