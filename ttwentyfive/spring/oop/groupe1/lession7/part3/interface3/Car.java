package ttwentyfive.spring.oop.groupe1.lession7.part3.interface3;
public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key ignition.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped with a push of a button.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating smoothly on the highway.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking using ABS system.");
    }
}

