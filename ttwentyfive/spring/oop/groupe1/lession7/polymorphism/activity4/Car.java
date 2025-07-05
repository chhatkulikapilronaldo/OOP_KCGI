package ttwentyfive.spring.oop.groupe1.lession7.polymorphism.activity4;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }

    // Overloaded fuel method
    public void fuel(String fuelType) {
        System.out.println("Car uses " + fuelType);
    }
}

