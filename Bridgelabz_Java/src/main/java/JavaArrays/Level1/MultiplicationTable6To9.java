/*
 * Problem 5 - Multiplication Table from 6 to 9
 *
 * Create a program to find the multiplication table of a number entered
 * by the user from 6 to 9 and display the result.
 *
 * Hint =>
 * a. Take integer input and store it in the variable number as well as
 *    define an integer array to store the multiplication result in the
 *    variable multiplicationResult.
 * b. Using a for loop, find the multiplication table of numbers from 6
 *    to 9 and save the result in the array.
 * c. Finally, display the result from the array in the format
 *    number * i = ___
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create an integer array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Find the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the multiplication table from the array
        for (int i = 6; i <= 9; i++) {
            System.out.println(
                    number + " * " + i + " = " + multiplicationResult[i - 6]
            );
        }

        // Close the Scanner Object
        input.close();
    }
}