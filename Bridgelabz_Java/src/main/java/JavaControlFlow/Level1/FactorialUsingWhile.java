/*
 * Problem 14 - Factorial of an Integer
 *
 * Write a Program to find the factorial of an integer entered by the user.
 *
 * Hint =>
 * a. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
 * b. Take an integer input from the user and assign it to the variable. Check the user has
 * entered a positive integer.
 * c. Using a while loop, compute the factorial.
 * d. Print the factorial at the end.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the integer from the user
        int number = input.nextInt();

        // Check whether the number is a positive integer
        if (number > 0) {

            // Initialize the factorial and counter
            long factorial = 1;
            int counter = 1;

            // Calculate the factorial using a while loop
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {

            // Print the result for a non-positive integer
            System.out.println("The number " + number + " is not a positive integer");
        }

        // Close the Scanner
        input.close();
    }
}