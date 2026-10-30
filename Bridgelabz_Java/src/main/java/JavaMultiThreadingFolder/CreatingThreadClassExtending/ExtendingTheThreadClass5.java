/*
 * Question: Implementation and demonstration of Extending The Thread Class5
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Extending The Thread Class5.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.CreatingThreadClassExtending;


class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hello from A");
        System.out.println("Hello from B");
    }
}
public class ExtendingTheThreadClass5 {
    public static void main(String[] args) 
    {
        MyThread t = new MyThread();
        t.start();
        System.out.println("Hello from C");
    }
}
