package ttwentyfive.spring.oop.groupe1.lession7.part3.innerclass;
public class School {
    private final String schoolName;


    public School(String schoolName) {
        this.schoolName = schoolName;
    }


    public void enrollAndShowStudent(String studentName, int studentGrade) {
        // Create a student
        Student student = new Student(studentName, studentGrade);

        // Display student info
        student.showStudentInfo();
    }


    private class Student {
        private final String name;
        private final int grade;

        // Constructor for Student
        private Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }


        private void showStudentInfo() {
            System.out.println("+++Student Details++++");
            System.out.println("School Name: " + schoolName);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }


    public static void main(String[] args) {
        School school = new School("Sunrise International School");

        // Enroll student and show info
        school.enrollAndShowStudent("ram", 12);
    }
}
