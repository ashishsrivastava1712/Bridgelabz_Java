/*
 * Problem 12 - Sum of n Natural Numbers Using While Loop
 *
 * Write a program to find the sum of n natural numbers using while loop compare the result
 * with the formulae n*(n+1)/2 and show the result from both computations was correct.
 *
 * Hint =>
 * a. Take the user input number and check whether it's a Natural number
 * b. If it's a natural number Compute using formulae as well as compute using while loop
 * c. Compare the two results and print the result
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class NaturalNumberSumComparison {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Calculate the sum using the formula n * (n + 1) / 2
            int formulaSum = number * (number + 1) / 2;

            // Initialize variables for the while loop calculation
            int counter = 1;
            int whileSum = 0;

            // Calculate the sum using a while loop
            while (counter <= number) {
                whileSum += counter;
                counter++;
            }

            // Compare both results
            boolean isCorrect = formulaSum == whileSum;

            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);
            System.out.println("Both computations are correct: " + isCorrect);

        } else {

            // Print the result for a non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner
        input.close();
    }
}