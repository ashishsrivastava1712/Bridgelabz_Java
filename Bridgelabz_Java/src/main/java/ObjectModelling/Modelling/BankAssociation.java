package ObjectModelling.Modelling;

import java.util.ArrayList;

/*
 * Author: Ashish
 * Problem Description: Demonstrate association between Bank and Customer.
 */

class Customer {
    String name;
    ArrayList<String> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(String accountNumber) {
        accounts.add(accountNumber);
    }

    void viewBalance(Bank bank, String accountNumber) {
        bank.showBalance(accountNumber);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, String accountNumber) {
        customer.addAccount(accountNumber);

        System.out.println(
                "Account " + accountNumber +
                        " opened for " + customer.name
        );
    }

    void showBalance(String accountNumber) {
        System.out.println(
                "Balance of " + accountNumber + ": ₹50000"
        );
    }
}

public class BankAssociation {
    public static void main(String[] args) {

        Bank bank = new Bank("ABC Bank");

        Customer customer = new Customer("Ashish");

        bank.openAccount(customer, "ACC101");

        customer.viewBalance(bank, "ACC101");
    }
}