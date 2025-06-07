package twentyfive.spring.oop.groupe1.lession7.polymorphism.inclassactivity4;
class Vehicle {
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

    // Method to be overridden
    public void move() {
        System.out.println("Vehicle is moving");
    }

    // Method to be overloaded
    public void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}


