package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import java.sql.ResultSet;

public class Validator {

    public static boolean isEmailValid(String email) {
        return !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    public static boolean isUsernameValid(String username) {
        return !username.matches("^[a-zA-Z0-9]{4,}$");
    }

    public static boolean isPasswordValid(String password) {
        return !password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{6,}$");
    }

    public static boolean isDuplicateAdmin(String username) {
        try {
            ResultSet rs = DatabaseManager.executeQuery("SELECT * FROM admins WHERE username='" + username + "' AND deleted=0");
            return rs.next();
        } catch (Exception e) {
            System.out.println("Error checking admin duplication: " + e.getMessage());
            return true;
        }
    }

    public static boolean isDuplicateStudent(String username) {
        try {
            ResultSet rs = DatabaseManager.executeQuery("SELECT * FROM students WHERE username='" + username + "' AND deleted=0");
            return rs.next();
        } catch (Exception e) {
            System.out.println("Error checking student duplication: " + e.getMessage());
            return true;
        }
    }

    public static boolean isDuplicateCourse(String courseTitle) {
        try {
            ResultSet rs = DatabaseManager.executeQuery("SELECT * FROM courses WHERE title='" + courseTitle + "' AND deleted=0");
            return rs.next();
        } catch (Exception e) {
            System.out.println("Error checking course duplication: " + e.getMessage());
            return true;
        }
    }

    public static boolean isAlreadyEnrolled(int studentId, int courseId) {
        try {
            ResultSet rs = DatabaseManager.executeQuery("SELECT * FROM enrollments WHERE student_id=" + studentId + " AND course_id=" + courseId + " AND deleted=0");
            return rs.next();
        } catch (Exception e) {
            System.out.println("Error checking enrollment duplication: " + e.getMessage());
            return true;
        }
    }

    public static boolean doesStudentExist(int studentId) {
        try {
            ResultSet rs = DatabaseManager.executeQuery("SELECT * FROM students WHERE student_id=" + studentId + " AND deleted=0");
            return !rs.next();
        } catch (Exception e) {
            System.out.println("Error checking student existence: " + e.getMessage());
            return true;
        }
    }

    public static boolean doesCourseExist(int courseId) {
        try {
            ResultSet rs = DatabaseManager.executeQuery("SELECT * FROM courses WHERE course_id=" + courseId + " AND deleted=0");
            return !rs.next();
        } catch (Exception e) {
            System.out.println("Error checking course existence: " + e.getMessage());
            return true;
        }
    }

    public static boolean isGradeValid(String grade) {
        return grade.matches("^[A-F][+-]?$");
    }
}
