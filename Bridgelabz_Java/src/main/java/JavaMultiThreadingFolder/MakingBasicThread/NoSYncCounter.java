/*
 * Question: Implementation and demonstration of No S Ync Counter
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for No S Ync Counter.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;

public class NoSYncCounter {
    private int count = 0;

    // Method to handle increment operations
    public  void increment() {
        count++;
    }

    // Method to handle get count operations
    public int getCount() {
        return count;
    }
}
