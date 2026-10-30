/*
 * Question: Implementation and demonstration of Custom Exception Age
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Custom Exception Age.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1.CustomExceptionAge;


import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionAge {
    // Method to handle validate age operations
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            try {
                validateAge(age);
                System.out.println("Access granted!");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid integer age.");
        }
    }
}
