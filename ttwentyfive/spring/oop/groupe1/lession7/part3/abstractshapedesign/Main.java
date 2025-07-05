package ttwentyfive.spring.oop.groupe1.lession7.part3.abstractshapedesign;
public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Rectangle(10, 5);
        Shape shape2 = new Circle(7);

        // Demonstrate polymorphism
        System.out.println("Rectangle Area: " + shape1.calculateArea());
        System.out.println("Rectangle Perimeter: " + shape1.calculatePerimeter());

        System.out.println("Circle Area: " + shape2.calculateArea());
        System.out.println("Circle Perimeter: " + shape2.calculatePerimeter());
    }
}

