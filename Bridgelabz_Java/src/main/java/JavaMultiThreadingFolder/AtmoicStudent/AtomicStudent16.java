/*
 * Question: Implementation and demonstration of Atomic Student16
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Atomic Student16.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.AtmoicStudent;


import java.util.concurrent.atomic.AtomicInteger;

class Student {
    private final AtomicInteger sum;

    public Student(int sum) {
        this.sum = new AtomicInteger(sum);
    }

    // Method to handle get sum operations
    public int getSum() {
        return sum.get();
    }

    // Method to handle add to sum operations
    public void addToSum(int value) {
        sum.addAndGet(value);
    }

    // Method to handle multiply sum operations
    public void multiplySum(int value) {
        sum.updateAndGet(current -> current * value);
    }
}

public class AtomicStudent16 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) throws InterruptedException {
        Student s = new Student(1);

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                int multiplier = i;
                
                System.out.println("T1: i = " + multiplier +", sum before multiplication = " + s.getSum());

                s.multiplySum(multiplier);
            }
        });
      
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("T2: i = " + i +", sum before addition = " + s.getSum());
                s.addToSum(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final sum: " + s.getSum());
    }
}
