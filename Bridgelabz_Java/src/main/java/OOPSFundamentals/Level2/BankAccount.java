/*
 * Author: Ashish Srivastava
 * Problem Description: Create a BankAccount class with attributes
 * accountHolder, accountNumber, and balance. Add methods for depositing
 * money, withdrawing money if sufficient balance exists, and displaying
 * the current balance.
 * Program: Simulate an ATM
 */

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    // Method to deposit money
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountHolder = "Ashish";
        account.accountNumber = 1234567890L;
        account.balance = 10000;

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Account Number: " + account.accountNumber);

        account.deposit(5000);
        account.withdraw(3000);
        account.displayBalance();
    }
}