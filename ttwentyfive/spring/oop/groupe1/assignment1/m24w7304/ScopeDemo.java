package ttwentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class ScopeDemo {
    static String name = "John Wick";

    public static void main(String[] args) {
        int age = 12;
        System.out.println(age + name);

        {
            // here we are in a space delimited by opening and closing curly bracket {}
            // this space has been created as child of main function, which is a child of ScopeDemo class
            String address = "hyakumanben";
            System.out.println(age + " - " + name + " - " + address);
        }

        String address = "kyoto ekimae";
        System.out.println(age + name + address);
        // address has been created in the unnamed space which belongs into main() which belongs into ScopeDemo
        // if we create something in "parent place" it exists in every single child place,
        // however if we create something inside child place, it does not exists in the parent place

    }
}
