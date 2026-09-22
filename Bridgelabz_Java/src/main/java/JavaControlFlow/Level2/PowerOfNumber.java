/*
 * Problem 10 - Find the Power of a Number
 *
 * Create a program to find the power of a number.
 *
 * Hint =>
 * a. Get integer input for two variables named number and power.
 * b. Create a result variable with an initial value of 1.
 * c. Run a for loop from i = 1 to i <= power.
 * d. In each iteration of the loop, multiply the result with the number and assign the value to
 *    the result.
 * e. Finally, print the result.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number and power from the user
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize the result
        int result = 1;

        // Calculate the power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " = " + result);

        // Close the Scanner
        input.close();
    }
}