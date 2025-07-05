package ttwentyfive.spring.oop.groupe1.lession6.inclassactivity2;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private Customer owner;
    private double overdraftLimit;

    public BankAccount(String accountNumber, double balance, Customer owner, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " JPY to " + owner.getFullName());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " JPY from " + owner.getFullName());
        } else {
            System.out.println("Insufficient funds or exceeds overdraft limit.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner.getFullName());
        System.out.println("Balance: " + balance + " JPY");
        System.out.println("------------------------------");
    }

    public double getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }
}

