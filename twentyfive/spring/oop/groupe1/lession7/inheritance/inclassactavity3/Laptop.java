package twentyfive.spring.oop.groupe1.lession7.inheritance.inclassactavity3;
class Laptop extends ElectronicDevice {
    int ram;
    String cpu;

    Laptop(String b, String m, int p, int r, String c) {
        super(b, m, p);
        ram = r;
        cpu = c;
    }

    void turnOn() {
        System.out.println(model + " laptop turning on with " + cpu);
    }

    void turnOff() {
        System.out.println(model + " laptop shutting down.");
    }

    void displaySpecifications() {
        System.out.println("Laptop - " + brand + " " + model + ", RAM: " + ram + "GB, CPU: " + cpu + ", Power: " + powerConsumption + "W");
    }
}

