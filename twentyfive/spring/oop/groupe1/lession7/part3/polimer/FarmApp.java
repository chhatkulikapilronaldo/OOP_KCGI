package twentyfive.spring.oop.groupe1.lession7.part3.polimer;

public class FarmApp {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal pig = new Pig();
        Animal crocoduck = new Animal();

        dog.sound();
        pig.sound();
        crocoduck.sound();
    }
}
