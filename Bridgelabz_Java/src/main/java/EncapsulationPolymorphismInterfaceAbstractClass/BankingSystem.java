package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Create a banking system with different account types
 * using abstraction, encapsulation, interfaces and polymorphism.
 */

abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit.");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Interest calculation differs by account type.
    public abstract double calculateInterest();
}

interface Loanable {

    void applyForLoan();

    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(String number, String holder, double balance) {
        super(number, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Savings account loan application submitted.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(String number, String holder, double balance) {
        super(number, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Current account loan application submitted.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 100000;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(
                new SavingsAccount("S101", "Ashish", 80000)
        );

        accounts.add(
                new CurrentAccount("C102", "Rahul", 150000)
        );

        for (BankAccount account : accounts) {

            System.out.println("Account Holder: "
                    + account.getHolderName());

            System.out.println("Balance: "
                    + account.getBalance());

            account.deposit(5000);

            System.out.println("Interest: "
                    + account.calculateInterest());

            Loanable loanAccount = (Loanable) account;

            loanAccount.applyForLoan();

            System.out.println(
                    "Loan Eligible: "
                            + loanAccount.calculateLoanEligibility()
            );

            System.out.println("--------------------");
        }
    }
}