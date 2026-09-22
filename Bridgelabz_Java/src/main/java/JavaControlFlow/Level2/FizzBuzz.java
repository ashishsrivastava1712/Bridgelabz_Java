/*
 * Problem 5 - FizzBuzz
 *
 * Write a program FizzBuzz, take a number as user input, and if it is a positive integer
 * loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead
 * of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
 *
 * Hint =>
 * a. Write the program and use for loop
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is a positive integer
        if (number > 0) {

            // Loop from 0 to the given number
            for (int currentNumber = 0; currentNumber <= number; currentNumber++) {

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
            }
        }

        // Close the Scanner
        input.close();
    }
}