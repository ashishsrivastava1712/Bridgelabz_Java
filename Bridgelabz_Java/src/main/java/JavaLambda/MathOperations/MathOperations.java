/*
 * Question: Implementation and demonstration of Math Operations
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Math Operations.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaLambda.MathOperations;
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathOperations {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));
    }
}
