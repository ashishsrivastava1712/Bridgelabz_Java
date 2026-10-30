/*
 * Question: Implementation and demonstration of Exception Propogation
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Exception Propogation.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1;

import java.io.*;


public class ExceptionPropogation {
    // Method to handle method1 operations
    static void method1() {
        int result = 10 / 0;
        System.out.println(result);
    }

    // Method to handle method2 operations
    static void method2() {
        method1();
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try {
            method2();

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
