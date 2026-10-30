/*
 * Question: Implementation and demonstration of Static Sync Counter
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Static Sync Counter.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;

public class StaticSyncCounter 
{
    private static int count = 0;

    // Method to handle increment operations
    public static synchronized void increment() {
        count++;
    }

    // Method to handle get count operations
    public int getCount() {
        return count;
    }
}
