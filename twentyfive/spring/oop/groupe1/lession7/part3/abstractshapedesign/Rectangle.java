package twentyfive.spring.oop.groupe1.lession7.part3.abstractshapedesign;
public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Override calculatePerimeter
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

