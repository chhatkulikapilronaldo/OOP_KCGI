package twentyfive.spring.oop.groupe1.lession7.abstract_example1;

public class Student extends Person {
    public Student(String name, String surname, byte age, String id) {
        super(name, surname, age, id);
    }

    @Override
    public void study() {
        System.out.println("I only study with buds in my ears and on a touchpad because programming with keyboard is old fashion.");
    }
}
