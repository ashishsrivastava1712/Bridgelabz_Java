/*
 * Problem 6 - Check Whether a Number is Positive, Negative, or Zero
 *
 * Write a program to check whether a number is positive, negative, or zero.
 *
 * Hint =>
 * a. Get integer input from the user and store it in the number variable.
 * b. If the number is positive, print positive.
 * c. If the number is negative, print negative.
 * d. If the number is zero, print zero.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // Close the Scanner
        input.close();
    }
}