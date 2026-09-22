/*
 * Problem 13 - Sum of n Natural Numbers Using For Loop
 *
 * Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n
 * Natural Numbers.
 *
 * Hint =>
 * a. Take the user input number and check whether it's a Natural number
 * b. If it's a natural number Compute using formulae as well as compute using for loop
 * c. Compare the two results and print the result
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class NaturalNumberSumForLoop {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Calculate the sum using the formula n * (n + 1) / 2
            int formulaSum = number * (number + 1) / 2;

            // Initialize the sum for the for loop
            int forLoopSum = 0;

            // Calculate the sum using a for loop
            for (int counter = 1; counter <= number; counter++) {
                forLoopSum += counter;
            }

            // Compare both results
            boolean isCorrect = formulaSum == forLoopSum;

            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forLoopSum);
            System.out.println("Both computations are correct: " + isCorrect);

        } else {

            // Print the result for a non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner
        input.close();
    }
}