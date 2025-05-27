package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctNumber = random.nextInt(100) + 1; // Random number from 1 to 100
        byte[] guesses = new byte[10]; // Store up to 10 valid guesses
        int attempts = 0; // Count valid guesses
        boolean guessedCorrectly = false;

        // Allow up to 10 valid guesses
        while (attempts < 10) {
            System.out.print("Guess the number (between 1 and 100): ");
            int guess = scanner.nextInt();

            // If guess is out of range
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Try a number between 1 and 100.");
                continue; // Skip to next input without increasing attempts
            }

            // Store the valid guess
            guesses[attempts] = (byte) guess;
            attempts++;

            // Check the guess
            if (guess == correctNumber) {
                System.out.println("Congratulations! You guessed the right number in " + attempts + " attempts!");
                guessedCorrectly = true;
                break; // End game on correct guess
            } else if (guess > correctNumber) {
                System.out.println("Too high.");
            } else {
                System.out.println("Too low.");
            }
        }

        // If number wasn't guessed in 10 tries
        if (!guessedCorrectly) {
            System.out.println("Game over! The correct number was " + correctNumber + ".");
        }

        //print here valid all number
        System.out.print("Your guesses were: [");
        for (int i = 0; i < attempts; i++) {
            System.out.print(guesses[i]);
            if (i < attempts - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
