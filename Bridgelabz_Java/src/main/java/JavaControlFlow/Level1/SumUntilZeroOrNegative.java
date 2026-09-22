/*
 * Problem 11 - Sum Until Zero or Negative Number
 *
 * Rewrite the program 10 to find the sum until the user enters 0 or a negative number using
 * while loop and break statement
 *
 * Hint =>
 * a. Use infinite while loop as in while (true)
 * b. Take the user entry and check if the user entered 0 or a negative number to break the
 * loop using break;
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize the total sum
        double total = 0.0;

        // Use an infinite while loop
        while (true) {

            // Get the number from the user
            double number = input.nextDouble();

            // Stop the loop if the number is zero or negative
            if (number <= 0) {
                break;
            }

            // Add the positive number to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close the Scanner
        input.close();
    }
}