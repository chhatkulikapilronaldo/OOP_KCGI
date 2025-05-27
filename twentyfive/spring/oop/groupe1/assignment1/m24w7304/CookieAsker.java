package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

import java.util.Scanner;

public class CookieAsker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Can I have a cookie, please? ");
            String input = scanner.nextLine();

            if (input.equals("cookie")) {
                System.out.println("Thank you! Goodbye!");
                break;
            } else {
                System.out.println("I'm still waiting for a cookie...");
            }
        }

        scanner.close();
    }
}

