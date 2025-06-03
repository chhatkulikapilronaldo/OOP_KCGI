package twentyfive.spring.oop.groupe1.lession7.encapsulation;
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();

        //Using setter methods instead of direct access
        s.setName("Alice123#@%");
        s.setAge(-5);     // Invalid, will print error
        s.setGpa(5.5);    // Invalid, will print error

        // Correct values
        //s.gpa = -1;
        s.setAge(20);

        //s.age = 541;
        s.setGpa(3.7);

        //display info
        s.displayInfo();
    }
}

