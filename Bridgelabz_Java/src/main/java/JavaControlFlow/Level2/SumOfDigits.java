/*
 * Problem 2 - Sum of All Digits
 *
 * Create a program to find the sum of all the digits of a number given by a user.
 *
 * Hint =>
 * a. Get an integer input for the number variable.
 * b. Create an integer variable sum with an initial value of 0.
 * c. Create a while loop to access each digit of the number.
 * d. Inside the loop, add each digit of the number to the sum.
 * e. Finally, print the sum outside the loop.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input value for number
        int originalNumber = input.nextInt();

        // Define number and sum initialized to zero
        int number = originalNumber;
        int sum = 0;

        // Run while loop to access each digit of number
        while (number != 0) {

            // Use number % 10 to find each digit of number from last
            int digit = number % 10;

            // Add each digit to sum
            sum += digit;

            // Remove the last digit from number
            number = number / 10;
        }

        // Print the sum
        System.out.println("The sum of digit of number:" + originalNumber + " = " + sum);

        // Closing the Scanner Stream
        input.close();
    }
}