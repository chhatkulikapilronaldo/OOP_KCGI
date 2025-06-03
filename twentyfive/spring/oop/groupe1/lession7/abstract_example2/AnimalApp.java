package twentyfive.spring.oop.groupe1.lession7.abstract_example2;

// Main class
class AnimalApp {
    public static void main(String[] args) {
        Shepherd puppy = new Shepherd();
        puppy.walk();
        puppy.sound();
        puppy.shakeHand();

        Dog german_boxer_dog = new Dog();
        german_boxer_dog.sound();
        german_boxer_dog.walk();
        //german_boxer_dog.shakeHand(); // only shepherds are capable of shakingHands!

        Duck donald = new Duck();
        donald.sound();
        System.out.println(donald.healthy);
        donald.walk();
    }
}

