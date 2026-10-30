/*
 * Question: Implementation and demonstration of NO Syncronization18
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for NO Syncronization18.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;


// public class NoSYncCounter {
//     private int count = 0;

// Method to handle increment operations
//     public  void increment() {
//         count++;
//     }

// Method to handle get count operations
//     public int getCount() {
//         return count;
//     }
// }


public class NOSyncronization18 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) throws InterruptedException {
        NoSYncCounter counter = new NoSYncCounter();

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
