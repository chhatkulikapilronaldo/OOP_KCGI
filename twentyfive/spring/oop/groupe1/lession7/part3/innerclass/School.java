package twentyfive.spring.oop.groupe1.lession7.part3.innerclass;
public class School {
    private final String schoolName;

    // Constructor to initialize school name
    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    // Method to demonstrate creating and displaying student info
    public void enrollAndShowStudent(String studentName, int studentGrade) {
        // Create a student
        Student student = new Student(studentName, studentGrade);

        // Display student info
        student.showStudentInfo();
    }

    // Private inner class
    private class Student {
        private final String name;
        private final int grade;

        // Constructor for Student
        private Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        // Method to show student info
        private void showStudentInfo() {
            System.out.println("=== Student Details ===");
            System.out.println("School Name: " + schoolName); // access outer class member
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    // Main method
    public static void main(String[] args) {
        School school = new School("Sunrise International School");

        // Enroll student and show info
        school.enrollAndShowStudent("ram", 12);
    }
}
