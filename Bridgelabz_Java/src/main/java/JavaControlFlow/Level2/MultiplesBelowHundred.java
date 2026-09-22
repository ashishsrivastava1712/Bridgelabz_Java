/*
 * Problem 12 - Multiples of a Number Below 100
 *
 * Create a program to find all the multiple of a number taken as user input below 100.
 *
 * Hint =>
 * a. Get input value for a variable named number.
 * b. Run a for loop backward: from i = 100 to i = 1.
 * c. Inside the loop, check if i perfectly divide the number.
 * d. If true, print the number and continue the loop.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Find all multiples of the number below 100
        for (int i = 100; i >= 1; i--) {

            // Check if i is perfectly divisible by the number
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner
        input.close();
    }
}