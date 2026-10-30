/*
 * Question: Implementation and demonstration of Dameonsthreads17
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Dameonsthreads17.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;


public class Dameonsthreads17 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) throws InterruptedException {

        Thread background = new Thread(() -> {
            while (true) {
                System.out.println("Background task running");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        background.setDaemon(true);
        // if you dont do this then it will keep executing even after the main thread is over
        background.start();

        Thread.sleep(1200);

        System.out.println("Main thread is finishing");
    }
}
