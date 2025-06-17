package twentyfive.spring.oop.groupe1.lession7.part3.abstractshapedesign;
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override calculatePerimeter
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

