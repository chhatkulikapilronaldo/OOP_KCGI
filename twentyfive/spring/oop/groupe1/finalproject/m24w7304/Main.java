package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Course Management System ---");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter admin username: ");
                    String adminUsername = scanner.nextLine().trim();

                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.nextLine().trim();

                    Admin admin = new Admin(adminUsername, adminPassword);
                    if (admin.login()) {
                        System.out.println("Admin login successful.");

                        boolean adminLoggedIn = true;
                        while (adminLoggedIn) {
                            System.out.println("\n--- Admin Menu ---");
                            System.out.println("1. Create Student");
                            System.out.println("2. Edit Student");
                            System.out.println("3. Delete Student");
                            System.out.println("4. Add Admin");
                            System.out.println("5. Edit Admin");
                            System.out.println("6. Delete Admin");
                            System.out.println("7. View All Admins");
                            System.out.println("8. Add Course");
                            System.out.println("9. Edit Course");
                            System.out.println("10. Delete Course");
                            System.out.println("11. Enroll Student");
                            System.out.println("12. Assign Grade");
                            System.out.println("13. Delete Enrollment");
                            System.out.println("14. View All Students");
                            System.out.println("15. View All Courses");
                            System.out.println("16. View All Enrollments");
                            System.out.println("17. Logout");
                            System.out.print("Enter your choice: ");

                            int adminChoice = -1;
                            try {
                                adminChoice = Integer.parseInt(scanner.nextLine().trim());
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid number.");
                                continue;
                            }

                            switch (adminChoice) {
                                case 1 -> admin.createStudent();
                                case 2 -> admin.editStudent();
                                case 3 -> admin.deleteStudent();
                                case 4 -> admin.addAdmin();
                                case 5 -> admin.editAdmin();
                                case 6 -> admin.deleteAdmin();
                                case 7 -> admin.viewAllAdmins();
                                case 8 -> admin.addCourse();
                                case 9 -> admin.editCourse();
                                case 10 -> admin.deleteCourse();
                                case 11 -> admin.enrollStudent();
                                case 12 -> admin.assignGrade();
                                case 13 -> admin.deleteEnrollment();
                                case 14 -> admin.viewAllStudents();
                                case 15 -> admin.displayAllCourses();
                                //case 16 -> admin.getAllEnrollments();
                                case 16 -> admin.displayAllEnrollments(); // ✅ Call the new display method

                                case 17 -> {
                                    System.out.println("Admin logged out.");
                                    adminLoggedIn = false;
                                }
                                default -> System.out.println("Invalid choice. Please select a valid option.");
                            }
                            pauseForUser(scanner);
                        }
                    } else {
                        System.out.println("Invalid admin credentials. Please try again.");
                    }
                }

                case 2 -> {
                    System.out.print("Enter student username: ");
                    String studentUsername = scanner.nextLine().trim();

                    System.out.print("Enter student password: ");
                    String studentPassword = scanner.nextLine().trim();

                    Student student = new Student(studentUsername, studentPassword);
                    if (student.login()) {
                        System.out.println("Student login successful.");

                        boolean studentLoggedIn = true;
                        while (studentLoggedIn) {
                            System.out.println("\n--- Student Menu ---");
                            System.out.println("1. View Courses and Grades");
                            System.out.println("2. Export Transcript");
                            System.out.println("3. Logout");
                            System.out.print("Enter your choice: ");

                            int studentChoice = -1;
                            try {
                                studentChoice = Integer.parseInt(scanner.nextLine().trim());
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid number.");
                                continue;
                            }

                            switch (studentChoice) {
                                case 1 -> student.viewCoursesAndGrades();
                                case 2 -> TranscriptGenerator.generateTranscript(student.getStudentId());
                                case 3 -> {
                                    System.out.println("Student logged out.");
                                    studentLoggedIn = false;
                                }
                                default -> System.out.println("Invalid choice. Please select a valid option.");
                            }
                            pauseForUser(scanner);
                        }
                    } else {
                        System.out.println("Invalid student credentials. Please try again.");
                    }
                }

                case 3 -> {
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    private static void pauseForUser(@NotNull Scanner scanner) {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
}
