/*
 * Question: Implementation and demonstration of Thread Using Runnable Only4
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Thread Using Runnable Only4.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;



public class ThreadUsingRunnableOnly4 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {

        Runnable task = new Runnable() {
            @Override
            // Method to handle run operations
            public void run() {
                System.out.println("Hello from A");
                System.out.println("Hello from B");
            }
        };

        Thread t = new Thread(task);
        t.start();
        System.out.println("We can also use this syntax to create a thread using lambda expression");
        Runnable task2 = () -> {
            System.out.println("Hello from C");
            System.out.println("Hello from D");
        };
        Thread t2 = new Thread(task2);
        t2.start();
    }
}

