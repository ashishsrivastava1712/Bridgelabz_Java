/*
 * Question: Implementation and demonstration of Counter
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Counter.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;



class Counter {
    private int count = 0;

    // Method to handle increment operations
    public synchronized void increment() {
        count++;
    }

    // Method to handle get count operations
    public int getCount() {
        return count;
    }
}
