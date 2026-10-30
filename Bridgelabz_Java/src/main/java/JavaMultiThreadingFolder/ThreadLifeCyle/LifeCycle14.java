/*
 * Question: Implementation and demonstration of Life Cycle14
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Life Cycle14.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.ThreadLifeCyle;

import java.util.concurrent.atomic.AtomicInteger;
class Student {
    int sum;
    public Student(int sum) {
        this.sum = sum;
    }
    // Method to handle get sum operations
    public int getSum() {
        return sum;
    }
    // Method to handle set sum operations
    public void setSum(int sum) {
        this.sum = sum;
    }
    // Method to handle add to sum operations
    public void addToSum(int value) {
        this.sum += value;
    }
    // Method to handle multiply sum operations
    public void multiplySum(int value) {
        this.sum *= value;
    }
}
public class LifeCycle14 
{
    public static void main(String[] args) 
    {
        Student s = new Student(1);
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("T1: i is " + i + " and sum is " + s.getSum());
                
                s.multiplySum(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("T2: i is " + i + " and sum is " + s.getSum());
                System.out.println("Before start: t1 " + t1.getState());
                
                s.addToSum(i);
            }
        });
        System.out.println("Before start: t1 " + t1.getState());
        System.out.println("Before start: t2 " + t2.getState());
        t1.start();
        t2.start();
        try
        {
            t1.join();
            System.out.println("Before start: t1 " + t1.getState());
            t2.join();
            System.out.println("Before start: t2 " + t2.getState());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Before start: t1 " + t1.getState());
        System.out.println("Before start: t2" + t2.getState());
        System.out.println("Final sum: " + s.getSum());
    }
}
