package ttwentyfive.spring.oop.groupe1.lession7.classdiscuse;

public class CarApp {
    public static void main(String[] args) {
        Car suzuki = new Car();
        suzuki.brand = "Suzuki";
        suzuki.honk();
        System.out.println(suzuki.protectionFromRain);
        suzuki.honk((byte)5);

        Scooter vespa = new Scooter();
        vespa.brand = "Vespa";
        vespa.honk(); // this will trigger honk() situated directly in Scooter class
        //System.out.println(vespa.protectionFromRain)
        vespa.honk((byte)3); // this will trigger honk(byte reps) in superclass Vehicle
    }
}
