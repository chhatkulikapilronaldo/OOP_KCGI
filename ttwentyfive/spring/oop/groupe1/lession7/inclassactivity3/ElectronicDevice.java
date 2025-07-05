package ttwentyfive.spring.oop.groupe1.lession7.inclassactivity3;

public abstract class ElectronicDevice {
    String brand;
    String model;
    double powerConsumption;

    // Abstract methods to be implemented in subclasses
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void displaySpecifications();
}
