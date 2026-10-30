/*
 * Question: Implementation and demonstration of Rethrowing With Custom Exceptions
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Rethrowing With Custom Exceptions.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment2.RethrowingWithCustomExceptions;



class TransactionException extends Exception {
    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}

class TransactionService {
    public void processTransaction(String transactionId, double amount)
            throws TransactionException {

        try {
            if (amount <= 0) {
                throw new IllegalArgumentException(
                    "Amount must be greater than zero"
                );
            }

            System.out.println("Transaction processed: " + transactionId);

        } catch (IllegalArgumentException e) {
            throw new TransactionException(
                "Transaction " + transactionId + " failed: "
                    + e.getMessage(),
                e
            );
        }
    }
}

public class RethrowingWithCustomExceptions {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        TransactionService service = new TransactionService();

        try {
            service.processTransaction("TXN101", -500);

        } catch (TransactionException e) {
            System.out.println(e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
}
