package twentyfive.spring.oop.groupe1.assignment1.m24w7304;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user account details
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        // Deposit
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        balance = deposit(balance, depositAmount);
        System.out.println("After deposit: $" + balance);

        // Withdraw
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        balance = withdraw(balance, withdrawAmount);
        System.out.println("After withdrawal: $" + balance);

        // Interest calculation
        System.out.print("Enter annual interest rate (e.g., 0.05 for 5%): ");
        double rate = scanner.nextDouble();

        double interest = calculateInterest(balance, rate);
        System.out.println("Annual interest: $" + interest);

        System.out.print("Enter number of years for future value: ");
        int years = scanner.nextInt();

        double futureValue = calculateInterest(balance, rate, years);
        System.out.println("Value after " + years + " years: $" + futureValue);

        double compoundValue = compoundInterest(balance, rate, years);
        System.out.println("Compound interest after " + years + " years: $" + compoundValue);

        // Print statement
        printStatement(accountNumber, name, balance);

        scanner.close();
    }

    public static double deposit(double balance, double amount) {
        if (amount > 0) {
            return balance + amount;
        } else {
            System.out.println("Deposit amount must be positive.");
            return balance;
        }
    }

    public static double withdraw(double balance, double amount) {
        if (amount > 0 && amount <= balance) {
            return balance - amount;
        } else {
            System.out.println("Withdrawal cannot be processed: Insufficient funds or invalid amount.");
            return balance;
        }
    }

    public static double calculateInterest(double balance, double rate) {
        return balance * rate;
    }

    public static double calculateInterest(double balance, double rate, int years) {
        return balance * Math.pow(1 + rate, years);
    }

    public static void printStatement(String accountNumber, String name, double balance) {
        String date = new SimpleDateFormat("MMMM dd, yyyy").format(new Date());
        System.out.println("\nACCOUNT STATEMENT");
        System.out.println("-----------------");
        System.out.println("Date: " + date);
        System.out.println("Account: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.printf("Balance: $%.2f\n", balance);
    }

    public static double compoundInterest(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return compoundInterest(principal * (1 + rate), rate, years - 1);
    }
}

