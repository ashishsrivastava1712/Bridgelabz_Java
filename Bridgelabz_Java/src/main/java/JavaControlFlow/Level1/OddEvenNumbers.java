/*
 * Problem 16 - Print Odd and Even Numbers
 *
 * Create a program to print odd and even numbers between 1 to the number entered by the
 * user.
 *
 * Hint =>
 * a. Get an integer input from the user, assign to a variable number and check for Natural
 * Number
 * b. Using a for loop, iterate from 1 to the number
 * c. In each iteration of the loop, print the number is odd or even number
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Iterate from 1 to the given number
            for (int currentNumber = 1; currentNumber <= number; currentNumber++) {

                // Check whether the current number is odd or even
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is even");
                } else {
                    System.out.println(currentNumber + " is odd");
                }
            }

        } else {

            // Print the result for a non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner
        input.close();
    }
}