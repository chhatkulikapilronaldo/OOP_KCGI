package twentyfive.spring.oop.groupe1.lession7.polymorphism.inclassactivity4;
class Car extends Vehicle {
    public Car() {
        super("Car");
    }

    public void move() {
        System.out.println("Car is driving on roads");
    }

    // Overloaded method
    public void fuel(String fuelType) {
        System.out.println("Car is refueled with " + fuelType);
    }
}


