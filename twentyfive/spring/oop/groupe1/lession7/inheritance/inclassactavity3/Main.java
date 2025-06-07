package twentyfive.spring.oop.groupe1.lession7.inheritance.inclassactavity3;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy A15", 15, "Android", 64);
        Laptop laptop = new Laptop("HP", "Pavilion", 65, 8, "Intel i5");
        SmartTV tv = new SmartTV("LG", "OLED55", 120, 55, "4K");

        ElectronicDevice[] myDevices = { phone, laptop, tv };
        DeviceManager manager = new DeviceManager(myDevices);

        System.out.println("--- Device Specifications ---");
        manager.showAll();

        System.out.println("\n--- Turning ON all devices ---");
        manager.turnOnAll();

        System.out.println("\n--- Turning OFF all devices ---");
        manager.turnOffAll();
    }
}


