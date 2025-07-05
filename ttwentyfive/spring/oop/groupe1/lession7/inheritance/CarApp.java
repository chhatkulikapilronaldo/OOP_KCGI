package ttwentyfive.spring.oop.groupe1.lession7.inheritance;

public class CarApp {
    public static void main(String[] args) {
        Car mazda = new Car();
        mazda.honk();

        mazda.setBrand("Mazda");
        System.out.println(mazda.getBrand());

        Airplane boeing = new Airplane();
        boeing.setBrand("Boeining");
        System.out.println(boeing.getBrand());

        mazda.honk();
        System.out.println("---------------");
        boeing.honk();
    }
}
