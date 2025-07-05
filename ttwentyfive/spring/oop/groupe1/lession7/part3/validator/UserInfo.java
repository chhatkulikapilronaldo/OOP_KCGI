package ttwentyfive.spring.oop.groupe1.lession7.part3.validator;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = -1;
        double height = -1.0;
        boolean isStudent = false;

        // Name input with validation
        while (true) {
            System.out.print("Enter your name (at least 2 characters): ");
            name = scanner.nextLine();
            if (name.length() >= 2) {
                break;
            } else {
                System.out.println("Invalid name. Please try again.");
            }
        }

        // Age input with validation
        while (true) {
            System.out.print("Enter your age (0–120): ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0 && age <= 120) {
                    break;
                } else {
                    System.out.println("Age must be between 0 and 120.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Height input with validation
        while (true) {
            System.out.print("Enter your height in meters (positive number): ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    break;
                } else {
                    System.out.println("Height must be a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a decimal number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Consume newline
        scanner.nextLine();

        // Is Student input with validation
        while (true) {
            System.out.print("Are you a student? (true/false): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                isStudent = Boolean.parseBoolean(input);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
            }
        }

        // Summary
        System.out.println("\n--- User Information Summary ---");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Height    : " + height + " meters");
        System.out.println("Is Student: " + isStudent);
    }
}

