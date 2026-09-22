/*
 * Problem 6 - FizzBuzz Using While Loop
 *
 * Rewrite the program 5 FizzBuzz using while loop.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is a positive integer
        if (number > 0) {

            // Initialize the counter
            int currentNumber = 0;

            // Loop from 0 to the given number using while loop
            while (currentNumber <= number) {

                // Check for multiples of both 3 and 5
                if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                    System.out.println("FizzBuzz");

                    // Check for multiples of 3
                } else if (currentNumber % 3 == 0) {
                    System.out.println("Fizz");

                    // Check for multiples of 5
                } else if (currentNumber % 5 == 0) {
                    System.out.println("Buzz");

                    // Print the number if it is not a multiple of 3 or 5
                } else {
                    System.out.println(currentNumber);
                }

                // Increment the counter
                currentNumber++;
            }
        }

        // Close the Scanner
        input.close();
    }
}