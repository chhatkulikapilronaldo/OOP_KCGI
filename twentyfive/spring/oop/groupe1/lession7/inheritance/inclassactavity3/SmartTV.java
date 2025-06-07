package twentyfive.spring.oop.groupe1.lession7.inheritance.inclassactavity3;

class SmartTV extends ElectronicDevice {
    int screenSize;
    String resolution;

    SmartTV(String b, String m, int p, int s, String r) {
        super(b, m, p);
        screenSize = s;
        resolution = r;
    }

    void turnOn() {
        System.out.println(model + " TV turning on with " + resolution + " resolution");
    }

    void turnOff() {
        System.out.println(model + " TV shutting down.");
    }

    void displaySpecifications() {
        System.out.println("SmartTV - " + brand + " " + model + ", Size: " + screenSize + " inch, Resolution: " + resolution + ", Power: " + powerConsumption + "W");
    }
}

