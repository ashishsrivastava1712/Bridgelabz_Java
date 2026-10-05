package Inheritance.HierarchicalInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Model different bank account types using
 * hierarchical inheritance.
 */

public class BankAccountTypes {

    // Parent class
    static class BankAccount {

        String accountNumber;
        double balance;

        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Can be overridden by child classes
        void displayAccountType() {
            System.out.println("Bank Account");
        }

        // Common account details
        void displayDetails() {
            System.out.println(
                    "Account Number: " + accountNumber
            );
            System.out.println(
                    "Balance: ₹" + balance
            );
        }
    }

    // Child class 1
    static class SavingsAccount extends BankAccount {

        double interestRate;

        SavingsAccount(String accountNumber,
                       double balance,
                       double interestRate) {

            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        @Override
        void displayAccountType() {

            System.out.println(
                    "Account Type: Savings Account"
            );

            System.out.println(
                    "Interest Rate: "
                            + interestRate + "%"
            );
        }
    }

    // Child class 2
    static class CheckingAccount extends BankAccount {

        double withdrawalLimit;

        CheckingAccount(String accountNumber,
                        double balance,
                        double withdrawalLimit) {

            super(accountNumber, balance);
            this.withdrawalLimit = withdrawalLimit;
        }

        @Override
        void displayAccountType() {

            System.out.println(
                    "Account Type: Checking Account"
            );

            System.out.println(
                    "Withdrawal Limit: ₹"
                            + withdrawalLimit
            );
        }
    }

    // Child class 3
    static class FixedDepositAccount extends BankAccount {

        FixedDepositAccount(String accountNumber,
                            double balance) {

            super(accountNumber, balance);
        }

        @Override
        void displayAccountType() {

            System.out.println(
                    "Account Type: Fixed Deposit Account"
            );
        }
    }

    public static void main(String[] args) {

        /*
         * Parent reference stores objects of different
         * child classes.
         */
        BankAccount[] accounts = {
                new SavingsAccount("S101", 50000, 6.5),
                new CheckingAccount("C101", 30000, 10000),
                new FixedDepositAccount("F101", 100000)
        };

        for (BankAccount account : accounts) {

            System.out.println("\n--- Account ---");

            account.displayDetails();

            // Runtime polymorphism
            account.displayAccountType();
        }
    }
}