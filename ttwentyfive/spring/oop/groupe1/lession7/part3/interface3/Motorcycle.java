package ttwentyfive.spring.oop.groupe1.lession7.part3.interface3;
public class Motorcycle implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick start.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped by turning off the switch.");
    }
    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating quickly with a twist of the throttle.");
    }
    @Override
    public void brake() {
        System.out.println("Motorcycle is braking using hand and foot brakes.");
    }
}

