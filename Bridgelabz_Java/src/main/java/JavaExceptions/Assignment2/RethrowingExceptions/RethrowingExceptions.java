/*
 * Question: Implementation and demonstration of Rethrowing Exceptions
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Rethrowing Exceptions.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment2.RethrowingExceptions;

import java.io.*;
public class RethrowingExceptions {
    // Method to handle perform division operations
    static int performDivision(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }

        return numerator / denominator;
    }

    // Method to handle calculate operations
    static int calculate(int numerator, int denominator) throws ArithmeticException {
        try {
            return performDivision(numerator, denominator);

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Calculation failed: " + e.getMessage());
        }
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try {
            int result = calculate(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
