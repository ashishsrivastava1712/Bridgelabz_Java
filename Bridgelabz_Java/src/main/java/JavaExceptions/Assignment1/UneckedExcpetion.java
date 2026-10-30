/*
 * Question: Implementation and demonstration of Unecked Excpetion
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Unecked Excpetion.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UneckedExcpetion {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            System.out.println("Result: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
