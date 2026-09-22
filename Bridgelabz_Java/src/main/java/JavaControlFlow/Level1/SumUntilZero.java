/*
 * Problem 10 - Sum of Numbers Until Zero
 *
 * Write a program to find the sum of numbers until the user enters 0
 *
 * Hint =>
 * a. Create a variable total of type double initialize to 0.0. Also, create a variable to store the
 * double value the user enters
 * b. Use the while loop to check if the user entered is 0
 * c. If the user entered value is not 0 then inside the while block add user entered value to
 * the total and ask the user to input again
 * d. The loop will continue till the user enters zero and outside the loop display the total value
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize the total sum
        double total = 0.0;

        // Get the first number from the user
        double number = input.nextDouble();

        // Continue adding numbers until the user enters zero
        while (number != 0) {
            total += number;
            number = input.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close the Scanner
        input.close();
    }
}