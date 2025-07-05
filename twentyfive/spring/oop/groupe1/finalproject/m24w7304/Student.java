package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Student extends User {
    private int studentId;

    public Student(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login() {
        if (AuthManager.studentLogin(getUsername(), getPassword())) {
            // Retrieve studentId from DB after login
            try {
                String sql = "SELECT student_id FROM students WHERE username=? AND deleted=0";
                PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(sql);
                stmt.setString(1, getUsername());
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    this.studentId = rs.getInt("student_id");
                    return true;
                }
            } catch (Exception e) {
                System.out.println("Error fetching student ID: " + e.getMessage());
            }
        }
        return false;
    }

    public int getStudentId() {
        return studentId;
    }

    // View courses and grades for this student
    public void viewCoursesAndGrades() {
        try {
            String sql = "SELECT c.title, c.credit_hours, e.grade " +
                    "FROM enrollments e " +
                    "JOIN courses c ON e.course_id = c.course_id " +
                    "WHERE e.student_id = ? AND e.deleted=0";
            PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(sql);
            stmt.setInt(1, studentId);
            ResultSet rs = stmt.executeQuery();

            System.out.println("\nYour Courses and Grades:");
            while (rs.next()) {
                System.out.println("Course: " + rs.getString("title") +
                        ", Credit Hours: " + rs.getInt("credit_hours") +
                        ", Grade: " + (rs.getString("grade") == null ? "Not assigned" : rs.getString("grade")));
            }
        } catch (Exception e) {
            System.out.println("Error fetching courses and grades: " + e.getMessage());
        }
    }
}
