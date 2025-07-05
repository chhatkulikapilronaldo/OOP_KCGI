package ttwentyfive.spring.oop.groupe1.lession7.inclassactivity3;
public class Smartphone extends ElectronicDevice {
    int cameraMegapixels;

    // Set values manually
    public Smartphone(String b, String m, double pc, int cam) {
        brand = b;
        model = m;
        powerConsumption = pc;
        cameraMegapixels = cam;
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on with logo animation.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turning off now.");
    }

    @Override
    public void displaySpecifications() {
        System.out.println("Smartphone: " + brand + " " + model + ", Power: " + powerConsumption + "W, Camera: " + cameraMegapixels + "MP");
    }
}


