package twentyfive.spring.oop.groupe1.lession7.polymorphism.activity4;

public class TransportTest {
    public static void main(String[] args) {
        // Create each object one by one
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle airplane = new Airplane();
        Vehicle boat = new Boat();

        // Call move() for each to demonstrate polymorphism
        System.out.println("Vehicle Movements");
        car.move();
        bicycle.move();
        airplane.move();
        boat.move();

        System.out.println();

        // Show method overloading with Car
        Car myCar = new Car();
        System.out.println("Car Fueling");
        myCar.fuel();           // Inherited method
        myCar.fuel("Petrol");   // Overloaded method
    }
}

