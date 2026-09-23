/*
 * Problem 18 - Multiplication Table from 6 to 9
 *
 * Create a program to find the multiplication table of a number entered
 * by the user from 6 to 9 and display the result.
 *
 * Hint =>
 * a. Take integer input and store it in the variable number.
 * b. Using a for loop, find the multiplication table of number from 6 to 9
 *    and print it in the format number * i = ___
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the user input
        if (number <= 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }

        // Find and display multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close the Scanner Object
        input.close();
    }
}