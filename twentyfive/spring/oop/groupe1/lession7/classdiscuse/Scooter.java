package twentyfive.spring.oop.group1.lesson7.inheritance_example;

public class Scooter extends Vehicle{

    // EXAMPLE OF OVERRIDING
    // this method is already defined in the parent (superclass)
    // but java prefers to trigger version closer to the object, on which you trigger it
    // this object is Scooter, so if you create instance of scooter and trigger honk() on it, this method is closer than parent's method honk() so this oen will be triggered
    public void honk(){
        System.out.println("Quikkkk, Quikkk");
    }

    // notice in purpose here is missing
    // the updated version honk(byte reps), therefore this behavior will be served based as described in the parent class
}
