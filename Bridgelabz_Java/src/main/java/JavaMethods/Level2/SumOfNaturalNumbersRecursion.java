/*
 * Problem 2 - Sum of Natural Numbers Using Recursion
 *
 * Write a program to find the sum of n natural numbers using recursive
 * method and compare the result with the formula n*(n+1)/2.
 *
 * Hint =>
 * a. Take the user input number and check whether it is a Natural number.
 * b. Write a method to find the sum using recursion.
 * c. Write a method to find the sum using the formula n*(n+1)/2.
 * d. Compare both results and print whether they are correct.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {

    // Find the sum of n natural numbers using recursion
    public static int findSumUsingRecursion(int number) {

        // Base condition
        if (number == 1) {
            return 1;
        }

        // Recursive call
        return number + findSumUsingRecursion(number - 1);
    }

    // Find the sum of n natural numbers using formula
    public static int findSumUsingFormula(int number) {

        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate the user input
        if (number <= 0) {
            System.err.println("Invalid Number. Please enter a natural number.");
            System.exit(0);
        }

        // Find sum using recursion
        int recursiveSum = findSumUsingRecursion(number);

        // Find sum using formula
        int formulaSum = findSumUsingFormula(number);

        // Display both results
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula: " + formulaSum);

        // Compare both results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Both computations are not equal.");
        }

        // Close the Scanner Object
        input.close();
    }
}