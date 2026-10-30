/*
 * Question: Implementation and demonstration of Life Cycle13
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Life Cycle13.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;



public class LifeCycle13 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            System.out.println("Worker is executing");
        });

        System.out.println("Before start: " + t.getState());

        t.start();

        t.join();

        System.out.println("After join: " + t.getState());
    }
}
