package twentyfive.spring.oop.groupe1.lession7.inheritance.inclassactavity3;
abstract class ElectronicDevice {
    String brand;
    String model;
    int powerConsumption;

    // Constructor
    ElectronicDevice(String b, String m, int p) {
        brand = b;
        model = m;
        powerConsumption = p;
    }

    abstract void turnOn();
    abstract void turnOff();
    abstract void displaySpecifications();
}

