/*
 * Problem 11 - Factors of a Number
 *
 * Create a program to find the factors of a number taken as user input.
 *
 * Hint =>
 * a. Get the input value for a variable named number.
 * b. Run a for loop from i = 1 to i < number.
 * c. In each iteration of the loop, check if number is perfectly divisible by i.
 * d. If true, print the value of i.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Find the factors of the number
        for (int i = 1; i < number; i++) {

            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner
        input.close();
    }
}