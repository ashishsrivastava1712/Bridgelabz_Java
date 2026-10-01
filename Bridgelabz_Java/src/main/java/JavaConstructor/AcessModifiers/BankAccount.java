/*
 * Author: Ashish Srivastava
 * Problem Description: Create a BankAccount class with public
 * accountNumber, protected accountHolder, and private balance.
 * Provide public methods to access and modify balance. Create a
 * SavingsAccount subclass to demonstrate access to accountNumber
 * and accountHolder.
 */

class BankAccount {

    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, String accountHolder,
                   double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Demonstrating public and protected members
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

class BankAccountDemo {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(
                        "ACC101",
                        "Ashish",
                        50000
                );

        account.displayDetails();

        account.setBalance(65000);

        System.out.println("Updated Balance: "
                + account.getBalance());
    }
}