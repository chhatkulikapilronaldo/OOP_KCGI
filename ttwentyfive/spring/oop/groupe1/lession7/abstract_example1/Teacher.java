package ttwentyfive.spring.oop.groupe1.lession7.abstract_example1;

public class Teacher extends Person{
    public Teacher(String name, String surname, byte age, String id) {
        super(name, surname, age, id);
    }

    @Override
    public void study() {
        System.out.println("Unfortunately, if i want to study at home i can only do it when my child is a sleep because otherwise it's a mess.");
    }

    public void doAttendance(){
        System.out.println("Marking who came to the class now!");
    }
}
