/*
 * Problem 4 - Check Natural Number and Find Sum
 *
 * Write a program to check for the natural number and write the sum of n natural numbers
 *
 * Hint =>
 * a. A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
 * b. A sum of n natural numbers is n * (n+1) / 2
 *
 * I/P => number
 * O/P => If the number is a positive integer then the output is
 * The sum of ___ natural numbers is ___
 * Otherwise
 * The number ___ is not a natural number
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);

        } else {

            // Print the result for a non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner
        input.close();
    }
}