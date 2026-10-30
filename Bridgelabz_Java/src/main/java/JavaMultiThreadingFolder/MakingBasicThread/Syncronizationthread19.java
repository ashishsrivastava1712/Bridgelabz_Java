/*
 * Question: Implementation and demonstration of Syncronizationthread19
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Syncronizationthread19.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;



// class Counter {
//     private int count = 0;

// Method to handle increment operations
//     public synchronized void increment() {
//         count++;
//     }

// Method to handle get count operations
//     public int getCount() {
//         return count;
//     }
// }

public class Syncronizationthread19 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}
