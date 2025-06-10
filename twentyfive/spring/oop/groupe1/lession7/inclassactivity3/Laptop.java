package twentyfive.spring.oop.groupe1.lession7.inclassactivity3;

public class Laptop extends ElectronicDevice {
    int ramSize;

    public Laptop(String b, String m, double pc, int ram) {
        brand = b;
        model = m;
        powerConsumption = pc;
        ramSize = ram;
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on with boot screen.");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is shutting down.");
    }

    @Override
    public void displaySpecifications() {
        System.out.println("Laptop: " + brand + " " + model + ", Power: " + powerConsumption + "W, RAM: " + ramSize + "GB");
    }
}

