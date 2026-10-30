/*
 * Question: Implementation and demonstration of Thead Using Run3
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Thead Using Run3.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.MakingBasicThread;

public class TheadUsingRun3 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread(()->{System.out.println("Hello from A"); System.out.println("Hello from B"); });
        t.run();
        System.out.println("Hello from C");
       
    }
}
