package twentyfive.spring.oop.groupe1.lession7.polymorphism.inclassactivity4;

class TransportTest {
    public static void main(String[] args) {
        // Polymorphism using Vehicle references
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Airplane();
        vehicles[3] = new Boat();

        // Demonstrate polymorphism
        System.out.println("--- Vehicle Movement ---");
        for (Vehicle v : vehicles) {
            v.move();  // Calls overridden method
        }

        // Demonstrate method overloading
        System.out.println("\n--- Fueling Vehicles ---");
        vehicles[0].fuel(); // Car's fuel method (from Vehicle class)

        // To access overloaded method, we need to cast to Car
        Car myCar = (Car) vehicles[0];
        myCar.fuel("Petrol");
    }
}

