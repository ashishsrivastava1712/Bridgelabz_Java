/*
 * Question: Implementation and demonstration of RU Nvs START7
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for RU Nvs START7.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.ChangingNameOFThreadToUnderstandRunAndStart;


class MyTask implements Runnable 
{
    @Override
    // Method to handle run operations
    public void run() {
        System.out.println("Task thread: "+ Thread.currentThread().getName());
    }
}

public class RUNvsSTART7 {
    public static void main(String[] args) 
    {
        MyTask task = new MyTask();

        Thread t = new Thread(task, "Worker");

        System.out.println("Main thread: " + Thread.currentThread().getName());

        t.run();

        t.start();

        /* we cant do this
        Thread t = new Thread(() -> {
        System.out.println("Working");
        });

        t.start();
        t.start();
        but we can do this
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
         */
    }
}
