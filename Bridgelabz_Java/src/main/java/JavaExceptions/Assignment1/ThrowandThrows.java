/*
 * Question: Implementation and demonstration of Throwand Throws
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Throwand Throws.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1;

public class ThrowandThrows {
    static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException(
                "Amount and rate must be positive"
            );
        }

        return amount * rate * years / 100.0;
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try {
            double interest = calculateInterest(10000, 5, 2);
            System.out.println("Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
