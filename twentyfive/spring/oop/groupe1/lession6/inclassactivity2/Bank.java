package twentyfive.spring.oop.groupe1.lession6.inclassactivity2;

public class Bank {
    public void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        System.out.println("Transferring " + amount + " JPY...");
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transfer complete.");
        System.out.println("------------------------------");
    }

    // Main method here for testing
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Chhatkuli Kapil", "C001");
        Customer customer2 = new Customer("ram", "C002");

        // Create accounts
        BankAccount account1 = new BankAccount("A001", 1000000, customer1, 50000);
        BankAccount account2 = new BankAccount("A002", 300000, customer2, 30000);

        // Display initial info
        System.out.println("Initial Account Info:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        // Create bank and perform transfer
        Bank bank = new Bank();
        bank.transfer(account1, account2, 200000);

        // Display updated info
        System.out.println("Updated Account Info:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}

