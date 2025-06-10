package twentyfive.spring.oop.groupe1.lession7.inclassactivity3;


public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Apple", "iPhone 15", 5.0, 48);
        Laptop laptop = new Laptop("HP", "hp3", 60.0, 16);
        SmartTV tv = new SmartTV("Sony", "sony1", 120.0, 55);

        // Print details for phone
        phone.turnOn();
        phone.displaySpecifications();
        phone.turnOff();
        System.out.println("--------------------");

        // Print details for laptop
        laptop.turnOn();
        laptop.displaySpecifications();
        laptop.turnOff();
        System.out.println("--------------------");

        // Print details for tv
        tv.turnOn();
        tv.displaySpecifications();
        tv.turnOff();
        System.out.println("--------------------");
    }
}


