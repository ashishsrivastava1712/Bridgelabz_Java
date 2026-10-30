/*
 * Question: Implementation and demonstration of Bankingsystem
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Bankingsystem.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1.BankingSystem;
// Main execution method to run and demonstrate the solution
public class Bankingsystem {    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(2000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println(
            "Withdrawal successful, new balance: " + balance
        );
    }
}

