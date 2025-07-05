package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends User {
    Scanner scanner = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login() {
        return AuthManager.adminLogin(this.getUsername(), this.getPassword());
    }

    // -------- STUDENT MANAGEMENT --------

    public void createStudent() {
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            String username;
            do {
                System.out.print("Enter username: ");
                username = scanner.nextLine();
                if (Validator.isUsernameValid(username)) {
                    System.out.println("Invalid username. Minimum 4 alphanumeric characters required.");
                    username = null;
                } else if (Validator.isDuplicateStudent(username)) {
                    System.out.println("Username already exists. Please try another.");
                    username = null;
                }
            } while (username == null);

            String password;
            do {
                System.out.print("Enter password: ");
                password = scanner.nextLine();
                if (Validator.isPasswordValid(password)) {
                    System.out.println("Password must have at least 1 digit, 1 lowercase, 1 uppercase, 1 special character, and be at least 6 characters long.");
                    password = null;
                }
            } while (password == null);
            password = PasswordEncoder.encode(password);

            String email;
            do {
                System.out.print("Enter email: ");
                email = scanner.nextLine();
                if (Validator.isEmailValid(email)) {
                    System.out.println("Invalid email format. Please try again.");
                    email = null;
                }
            } while (email == null);

            String query = "INSERT INTO students (name, username, password, email, deleted) VALUES (?, ?, ?, ?, 0)";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, name);
                stmt.setString(2, username);
                stmt.setString(3, password);
                stmt.setString(4, email);
                stmt.executeUpdate();
                System.out.println("Student created successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error creating student: " + e.getMessage());
        }
    }

    public void editStudent() {
        try {
            System.out.print("Enter student ID to edit: ");
            int studentId = Integer.parseInt(scanner.nextLine());

            if (Validator.doesStudentExist(studentId)) {
                System.out.println("Student ID does not exist.");
                return;
            }

            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();

            String newEmail;
            do {
                System.out.print("Enter new email: ");
                newEmail = scanner.nextLine();
                if (Validator.isEmailValid(newEmail)) {
                    System.out.println("Invalid email format.");
                    newEmail = null;
                }
            } while (newEmail == null);

            String query = "UPDATE students SET name=?, email=? WHERE student_id=? AND deleted=0";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, newName);
                stmt.setString(2, newEmail);
                stmt.setInt(3, studentId);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Student updated successfully.");
                } else {
                    System.out.println("Student update failed.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error editing student: " + e.getMessage());
        }
    }

    public void deleteStudent() {
        try {
            System.out.print("Enter student ID to delete (soft delete): ");
            int studentId = Integer.parseInt(scanner.nextLine());

            if (Validator.doesStudentExist(studentId)) {
                System.out.println("Student ID does not exist.");
                return;
            }

            String query = "UPDATE students SET deleted=1 WHERE student_id=?";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setInt(1, studentId);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Student soft deleted successfully.");
                } else {
                    System.out.println("Student deletion failed.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }

    // -------- ADMIN MANAGEMENT --------

    public void addAdmin() {
        try {
            System.out.print("Enter admin username: ");
            String username;
            do {
                username = scanner.nextLine();
                if (Validator.isUsernameValid(username)) {
                    System.out.println("Invalid username. Minimum 4 alphanumeric characters required.");
                    username = null;
                } else if (Validator.isDuplicateAdmin(username)) {
                    System.out.println("Username already exists. Please try another.");
                    username = null;
                }
            } while (username == null);

            String password;
            do {
                System.out.print("Enter password: ");
                password = scanner.nextLine();
                if (Validator.isPasswordValid(password)) {
                    System.out.println("Password must have at least 1 digit, 1 lowercase, 1 uppercase, 1 special character, and be at least 6 characters long.");
                    password = null;
                }
            } while (password == null);
            password = PasswordEncoder.encode(password);

            String query = "INSERT INTO admins (username, password, deleted) VALUES (?, ?, 0)";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.executeUpdate();
                System.out.println("Admin added successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error adding admin: " + e.getMessage());
        }
    }

    public void editAdmin() {
        try {
            System.out.print("Enter admin username to edit: ");
            String username = scanner.nextLine();

            if (!Validator.isDuplicateAdmin(username)) {
                System.out.println("Admin username does not exist.");
                return;
            }

            String newPassword;
            do {
                System.out.print("Enter new password: ");
                newPassword = scanner.nextLine();
                if (Validator.isPasswordValid(newPassword)) {
                    System.out.println("Password must have at least 1 digit, 1 lowercase, 1 uppercase, 1 special character, and be at least 6 characters long.");
                    newPassword = null;
                }
            } while (newPassword == null);

            newPassword = PasswordEncoder.encode(newPassword);

            String query = "UPDATE admins SET password=? WHERE username=? AND deleted=0";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, newPassword);
                stmt.setString(2, username);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Admin password updated successfully.");
                } else {
                    System.out.println("Admin update failed.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error editing admin: " + e.getMessage());
        }
    }

    public void deleteAdmin() {
        try {
            System.out.print("Enter admin username to delete (soft delete): ");
            String username = scanner.nextLine();

            if (!Validator.isDuplicateAdmin(username)) {
                System.out.println("Admin username does not exist.");
                return;
            }

            String query = "UPDATE admins SET deleted=1 WHERE username=?";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, username);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Admin soft deleted successfully.");
                } else {
                    System.out.println("Admin deletion failed.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error deleting admin: " + e.getMessage());
        }
    }

    public void viewAllAdmins() {
        try {
            String query = "SELECT username FROM admins WHERE deleted=0";
            ResultSet rs = DatabaseManager.executeQuery(query);
            System.out.println("\nAll Admins:");
            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
            }
        } catch (Exception e) {
            System.out.println("Error fetching admins: " + e.getMessage());
        }
    }

    // -------- STUDENT & ADMIN VIEWS --------

    public void viewAllStudents() {
        try {
            String query = "SELECT student_id, name, username, email FROM students WHERE deleted=0";
            ResultSet rs = DatabaseManager.executeQuery(query);
            System.out.println("\nAll Students:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("student_id") +
                        ", Name: " + rs.getString("name") +
                        ", Username: " + rs.getString("username") +
                        ", Email: " + rs.getString("email"));
            }
        } catch (Exception e) {
            System.out.println("Error fetching students: " + e.getMessage());
        }
    }

    // -------- COURSE MANAGEMENT --------

    // Return all courses as List<Course>
   /* public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try {
            String query = "SELECT course_id, title, credit_hours FROM courses WHERE deleted=0";
            ResultSet rs = DatabaseManager.executeQuery(query);
            while (rs.next()) {
                courses.add(new Course(rs.getInt("course_id"), rs.getString("title"), rs.getInt("credit_hours")));
            }
        } catch (Exception e) {
            System.out.println("Error fetching courses: " + e.getMessage());
        }
        return courses;
    }

    public void viewAllCourses() {
        System.out.println("\nAll Courses:");
        for (Course course : getAllCourses()) {
            System.out.println(course);
        }
    }

    */
    // -------- COURSE MANAGEMENT --------
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try {
            String query = "SELECT course_id, title, credit_hours FROM courses WHERE deleted=0";
            ResultSet rs = DatabaseManager.executeQuery(query);
            while (rs.next()) {
                courses.add(new Course(
                        rs.getInt("course_id"),
                        rs.getString("title"),
                        rs.getInt("credit_hours")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error fetching courses: " + e.getMessage());
        }
        return courses;
    }
    public void displayAllCourses() {
        List<Course> courses = getAllCourses();  // Fetches all courses

        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        System.out.println("\nAll Courses:");
        for (Course course : courses) {   // Iterates over each Course object
            //  GETTERS USED HERE
            System.out.println("Course ID: " + course.getCourseId() +
                    ", Title: " + course.getTitle() +
                    ", Credit Hours: " + course.getCreditHours());
        }
    }

    public void addCourse() {
        try {
            String title;
            do {
                System.out.print("Enter course title: ");
                title = scanner.nextLine();
                if (Validator.isDuplicateCourse(title)) {
                    System.out.println("Course already exists. Please try another title.");
                    title = null;
                }
            } while (title == null);

            int hours;
            do {
                System.out.print("Enter credit hours: ");
                try {
                    hours = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    hours = -1;
                }
                if (hours <= 0) {
                    System.out.println("Credit hours must be positive.");
                }
            } while (hours <= 0);

            String query = "INSERT INTO courses (title, credit_hours, deleted) VALUES (?, ?, 0)";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, title);
                stmt.setInt(2, hours);
                stmt.executeUpdate();
                System.out.println("Course added successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error adding course: " + e.getMessage());
        }
    }

    public void editCourse() {
        try {
            System.out.print("Enter course ID to edit: ");
            int id = Integer.parseInt(scanner.nextLine());

            if (Validator.doesCourseExist(id)) {
                System.out.println("Course ID does not exist.");
                return;
            }

            System.out.print("Enter new course title: ");
            String title = scanner.nextLine();

            System.out.print("Enter new credit hours: ");
            int hours = Integer.parseInt(scanner.nextLine());

            String query = "UPDATE courses SET title=?, credit_hours=? WHERE course_id=? AND deleted=0";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, title);
                stmt.setInt(2, hours);
                stmt.setInt(3, id);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Course updated successfully.");
                } else {
                    System.out.println("Course update failed.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error updating course: " + e.getMessage());
        }
    }

    public void deleteCourse() {
        try {
            System.out.print("Enter course ID to delete (soft delete): ");
            int id = Integer.parseInt(scanner.nextLine());

            if (Validator.doesCourseExist(id)) {
                System.out.println("Course ID does not exist.");
                return;
            }

            String query = "UPDATE courses SET deleted=1 WHERE course_id=?";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setInt(1, id);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Course soft deleted successfully.");
                } else {
                    System.out.println("Course deletion failed.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error deleting course: " + e.getMessage());
        }
    }

    // -------- ENROLLMENT MANAGEMENT --------
    public List<Enrollment> getAllEnrollments() {
        List<Enrollment> enrollments = new ArrayList<>();
        try {
            String query = "SELECT enroll_id, student_id, course_id, grade FROM enrollments WHERE deleted=0";
            ResultSet rs = DatabaseManager.executeQuery(query);
            while (rs.next()) {
                enrollments.add(new Enrollment(
                        rs.getInt("enroll_id"),
                        rs.getInt("student_id"),
                        rs.getInt("course_id"),
                        rs.getString("grade")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error fetching enrollments: " + e.getMessage());
        }
        return enrollments;
    }

    // ✅ STEP 2: Add this method below getAllEnrollments()
    public void displayAllEnrollments() {
        List<Enrollment> enrollments = getAllEnrollments();
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }
        System.out.println("\nAll Enrollments:");
        for (Enrollment enrollment : enrollments) {
            System.out.println("Enrollment ID: " + enrollment.getEnrollId() +
                    ", Student ID: " + enrollment.getStudentId() +
                    ", Course ID: " + enrollment.getCourseId() +
                    ", Grade: " + enrollment.getGrade());
        }
    }


    public void deleteEnrollment() {
        try {
            System.out.print("Enter enrollment ID to delete (soft delete): ");
            int enrollId = Integer.parseInt(scanner.nextLine());

            String query = "UPDATE enrollments SET deleted=1 WHERE enroll_id=?";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setInt(1, enrollId);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Enrollment soft deleted successfully.");
                } else {
                    System.out.println("Enrollment ID not found.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error deleting enrollment: " + e.getMessage());
        }
    }

    public void enrollStudent() {
        try {
            System.out.print("Enter student ID: ");
            int studentId = Integer.parseInt(scanner.nextLine());

            if (Validator.doesStudentExist(studentId)) {
                System.out.println("Student ID does not exist.");
                return;
            }

            System.out.print("Enter course ID: ");
            int courseId = Integer.parseInt(scanner.nextLine());

            if (Validator.doesCourseExist(courseId)) {
                System.out.println("Course ID does not exist.");
                return;
            }

            if (Validator.isAlreadyEnrolled(studentId, courseId)) {
                System.out.println("This student is already enrolled in this course.");
                return;
            }

            String query = "INSERT INTO enrollments (student_id, course_id, deleted) VALUES (?, ?, 0)";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setInt(1, studentId);
                stmt.setInt(2, courseId);
                stmt.executeUpdate();
                System.out.println("Student enrolled successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error enrolling student: " + e.getMessage());
        }
    }

    public void assignGrade() {
        try {
            System.out.print("Enter enrollment ID: ");
            int enrollId = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();

            if (!Validator.isGradeValid(grade)) {
                System.out.println("Invalid grade format. Please enter a valid grade (A, B+, C-, etc.).");
                return;
            }

            String query = "UPDATE enrollments SET grade=? WHERE enroll_id=? AND deleted=0";
            try (PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(query)) {
                stmt.setString(1, grade);
                stmt.setInt(2, enrollId);
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Grade assigned successfully.");
                } else {
                    System.out.println("Enrollment ID not found.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error assigning grade: " + e.getMessage());
        }
    }
}
