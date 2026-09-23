/*
 * Problem 10 - FizzBuzz Using Array
 *
 * Write a program FizzBuzz, take a number as user input and if it is a
 * positive integer loop from 0 to the number and save the number, but for
 * multiples of 3 save "Fizz" instead of the number, for multiples of 5
 * save "Buzz", and for multiples of both save "FizzBuzz". Finally, print
 * the array results for each index position in the format
 * Position 1 = 1, ..., Position 3 = Fizz, ...
 *
 * Hint =>
 * a. Create a String Array to save the results and
 * b. Finally, loop again to show the results of the array based on the
 *    index position.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate the user input
        if (number <= 0) {
            System.err.println("Invalid Number. Please enter a positive integer.");
            System.exit(0);
        }

        // Create a String array to save the results
        String[] results = new String[number + 1];

        // Save FizzBuzz results in the array
        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results from the array
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}