package ttwentyfive.spring.oop.groupe1.lession7.part3.interface3;
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Car ");
        car.startEngine();
        car.accelerate();
        car.brake();
        car.stopEngine();

        System.out.println("Motorcycle");
        motorcycle.startEngine();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.stopEngine();
    }
}

