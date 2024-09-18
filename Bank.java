package anudip;

public class Bank {
    // Attributes
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Bank(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Main method to simulate transactions
    public static void main(String[] args) {
        // Creating a BankAccount object
        Bank myAccount = new Bank("123456789", "John Doe", 500.0);

        // Displaying account details
        myAccount.displayAccountDetails();

        // Performing transactions
        myAccount.deposit(150.0); // Depositing money
        myAccount.withdraw(200.0); // Withdrawing money
        myAccount.withdraw(1000.0); // Attempting to withdraw more than the balance

        // Displaying updated account details
        myAccount.displayAccountDetails();
    }
}
