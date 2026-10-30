/*
 * Question: Implementation and demonstration of Exceptionhandling With Resouce Cleanup
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Exceptionhandling With Resouce Cleanup.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment2.ExceptionhandlingWithResouceCleanup;


class MyConnection {
    // Method to handle connect operations
    public void connect() {
        System.out.println("Connection opened");
    }

    // Method to handle process operations
    public void process() {
        System.out.println("Processing data");
        throw new RuntimeException("Processing failed");
    }

    // Method to handle close operations
    public void close() {
        System.out.println("Connection closed");
    }
}

public class ExceptionhandlingWithResouceCleanup {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        MyConnection connection = new MyConnection();

        try {
            connection.connect();
            connection.process();

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            connection.close();
        }
    }
}
