/*
 * Author: Ashish
 * Problem: Bank Account System
 */

public class BankAccount {

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Ashish", 101);
        BankAccount account2 = new BankAccount("Rahul", 102);

        if (account1 instanceof BankAccount) {
            account1.displayDetails();
        }

        if (account2 instanceof BankAccount) {
            account2.displayDetails();
        }

        getTotalAccounts();
    }
}