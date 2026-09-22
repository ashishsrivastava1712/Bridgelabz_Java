/*
 * Problem 15 - Factorial Using For Loop
 *
 * Rewrite program 14 using for loop
 *
 * Hint =>
 * a. Take the integer input, check for natural number and determine the factorial using for
 * loop and finally print the result.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the integer input from the user
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Initialize the factorial
            long factorial = 1;

            // Calculate the factorial using a for loop
            for (int counter = 1; counter <= number; counter++) {
                factorial *= counter;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {

            // Print the result for a non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner
        input.close();
    }
}