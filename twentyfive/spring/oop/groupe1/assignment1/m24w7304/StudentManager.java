package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class StudentManager {
    public static void main(String[] args) {
        Student programmingStudent = new Student("M12W45767", "Fiona", "Wick", (byte) 45, 4.0F);
        programmingStudent.displayInfo();
        programmingStudent.setSurname("Stark");
        //programmingStudent.surname = "Stark"; // by making surname Student class attribute private we protect it from direct "touch"
        programmingStudent.displayInfo();

        programmingStudent.setAge((byte) 50);
        programmingStudent.displayInfo();


        System.out.println(programmingStudent.getAge());

        programmingStudent.study("Object-Oriented chaos");

        Student literatureStudent = new Student("M99W3985", "George", "Brown", (byte) 25, 3.5F);
        literatureStudent.study("Poems");
        System.out.println(literatureStudent.getAge());
        literatureStudent.displayInfo();

        Student iotStudent = new Student("M99W3985", "Jim", "Black", (byte) 15, 3.1F);
        Student ictStudent = new Student("M99W3985", "Ben", "White", (byte) 23, 3.8F);
        Student englishStudent = new Student("M99W3985", "Hubert", "Gray", (byte) 57, 3.3F);

        System.out.println(Student.getTotalStudents());
    }
}
