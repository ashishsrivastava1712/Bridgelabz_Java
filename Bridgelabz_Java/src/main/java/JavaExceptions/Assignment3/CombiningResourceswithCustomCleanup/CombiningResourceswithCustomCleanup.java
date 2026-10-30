/*
 * Question: Implementation and demonstration of Combining Resourceswith Custom Cleanup
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Combining Resourceswith Custom Cleanup.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment3.CombiningResourceswithCustomCleanup;



import java.io.Closeable;
import java.io.IOException;
class DatabaseConnection implements Closeable {
// Method to handle open operations
public void open() {
System.out.println("Database connection opened.");
}
// Method to handle close operations
public void close() throws IOException {
System.out.println("Database connection closed.");
}
}
class Transaction implements Closeable {
// Method to handle start operations
public void start() {
System.out.println("Transaction started.");
}
// Method to handle close operations
public void close() throws IOException {
System.out.println("Transaction ended.");
}
}
public class CombiningResourceswithCustomCleanup {
// Method to handle manage database operations
public void manageDatabase() {
try (DatabaseConnection connection = new DatabaseConnection();
Transaction transaction = new Transaction()) {

connection.open();
transaction.start();
// Simulate an operation that might fail
throw new IOException("Simulated operation error");
} catch (IOException e) {
System.err.println("Exception during database operation: "

+ e.getMessage());

}
}
// Main execution method to run and demonstrate the solution
public static void main(String[] args) {
CombiningResourceswithCustomCleanup manager = new CombiningResourceswithCustomCleanup();
manager.manageDatabase();
}
}
