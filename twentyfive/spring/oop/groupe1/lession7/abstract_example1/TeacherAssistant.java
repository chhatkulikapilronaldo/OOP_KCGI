package twentyfive.spring.oop.groupe1.lession7.abstract_example1;

public class TeacherAssistant extends Person{

    public TeacherAssistant(String name, String surname, byte age, String id) {
        super(name, surname, age, id);
    }

    @Override
    public void study() {
        System.out.println("I study, but I also help to teach!");
    }
}
