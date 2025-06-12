package twentyfive.spring.oop.group1.lesson7.example_of_not_putting_classes_next_to_each_other;

public class Test {
    // class inside the class is "okay"
    public class Inner{

    }

    public static void main(String[] args) {
        System.out.println("Will this crash?");
    }
}

// WE NEVER DO CLASS NEXT TO THE CLASS
/*
public class NextClassSituatedNextToTheFirstClass{

}
 */

