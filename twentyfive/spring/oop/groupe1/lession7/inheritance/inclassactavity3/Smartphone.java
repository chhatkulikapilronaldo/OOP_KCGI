package twentyfive.spring.oop.groupe1.lession7.inheritance.inclassactavity3;

class Smartphone extends ElectronicDevice {
    String os;
    int camera;

    Smartphone(String b, String m, int p, String o, int c) {
        super(b, m, p);
        os = o;
        camera = c;
    }

    void turnOn() {
        System.out.println(model + " smartphone turning on with " + os);
    }

    void turnOff() {
        System.out.println(model + " smartphone shutting down.");
    }

    void displaySpecifications() {
        System.out.println("Smartphone - " + brand + " " + model + ", OS: " + os + ", Camera: " + camera + "MP, Power: " + powerConsumption + "W");
    }
}

