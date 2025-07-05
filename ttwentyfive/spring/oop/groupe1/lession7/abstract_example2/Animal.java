package ttwentyfive.spring.oop.groupe1.lession7.abstract_example2;

// abstract parent class
abstract class Animal {
    boolean healthy = true;
    // abstract method (without body)
    public abstract void sound();
    // standard method
    public void walk(){
        System.out.println("Walking");
    }
}
