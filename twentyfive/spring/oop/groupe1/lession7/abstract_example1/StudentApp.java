package twentyfive.spring.oop.groupe1.lession7.abstract_example1;

public class StudentApp {
    public static void main(String[] args) {
        //Person person = new Person(); // we can not create instance from unfinished (abstract) class
        Student peter_parker = new Student("Peter", "Parker", (byte) 22, "M12W3456");
        Teacher albert_einstein = new Teacher("Albert", "Einstein", (byte) 65, "TC123456");
        albert_einstein.printFullName();
        peter_parker.printFullName();

        TeacherAssistant helper = new TeacherAssistant("John", "Wick", (byte) 40, "TA987654");
        helper.printFullName();

        albert_einstein.doAttendance();
        //helper.doAttendance();
        //peter_parker.doAttedance();
    }
}
