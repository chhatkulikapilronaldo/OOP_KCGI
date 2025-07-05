package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

public class Enrollment {
    private final int enrollId;
    private final int studentId;
    private final int courseId;
    private final String grade;

    // Constructor
    public Enrollment(int enrollId, int studentId, int courseId, String grade) {
        this.enrollId = enrollId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }

    // ✅ Getters
    public int getEnrollId() {
        return enrollId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getGrade() {
        return grade;
    }

    // ✅ toString
    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollId=" + enrollId +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", grade='" + grade + '\'' +
                '}';
    }
}