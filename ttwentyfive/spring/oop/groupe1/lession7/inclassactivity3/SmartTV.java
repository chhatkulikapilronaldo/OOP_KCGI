package ttwentyfive.spring.oop.groupe1.lession7.inclassactivity3;

public class SmartTV extends ElectronicDevice {
    int screenSize;

    public SmartTV(String b, String m, double pc, int screen) {
        brand = b;
        model = m;
        powerConsumption = pc;
        screenSize = screen;
    }

    @Override
    public void turnOn() {
        System.out.println("SmartTV is starting with welcome screen.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV is powering off.");
    }

    @Override
    public void displaySpecifications() {
        System.out.println("SmartTV: " + brand + " " + model + ", Power: " + powerConsumption + "W, Screen: " + screenSize + " inches");
    }
}

