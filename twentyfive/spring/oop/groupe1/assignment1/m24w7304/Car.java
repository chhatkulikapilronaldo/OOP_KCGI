package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class Car {
    public static final byte NUMBER_OF_WHEELS = 4;

    String name;
    int weight;
    boolean petrol;
    char color;
    String engine;

    public Car(String name, int weight, boolean petrol, char color, String engine){
        this.name = name;
        this.weight = weight;
        this.petrol = petrol;
        this.color = color;
        this.engine = engine;
    }

    public Car(){
    }

    public void startEngine(){
        System.out.println("Brrrrm, brrrrm");
    }

    public void diskBrake(){
        System.out.println("Wheeeeeeeeeeeeeeeez");
    }

    public void tellUsAboutYou(){
        System.out.println("I'm " + name);
        System.out.println(NUMBER_OF_WHEELS);
        System.out.println(weight + "kg");
        System.out.println("Do I run on petrol? " + petrol);
        if(color == 'r'){
            System.out.println("My color is red");
        } else if (color == 'y') {
            System.out.println("My color is yellow");
        } else{
            System.out.println("My color is white");
        }
        System.out.println("Engine: " + engine);
    }

    public static void muhehe(){
        System.out.println("muhehe");
    }
}
