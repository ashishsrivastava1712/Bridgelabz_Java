/*
 * Problem 3 - Check Harshad Number
 *
 * Create a program to check if a number taken from the user is a Harshad Number.
 *
 * Hint =>
 * a. A Harshad number is an integer which is divisible by the sum of its digits.
 *    For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
 * b. Get an integer input for the number variable.
 * c. Create an integer variable sum with initial value 0.
 * d. Create a while loop to access each digit of the number.
 * e. Inside the loop, add each digit of the number to sum.
 * f. Check if the number is perfectly divisible by the sum.
 * g. If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a
 *    Harshad Number.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        int number = input.nextInt();

        // Store the original number and initialize sum to zero
        int originalNumber = number;
        int sum = 0;

        // Access each digit of the number
        while (number != 0) {

            // Find the last digit
            int digit = number % 10;

            // Add the digit to sum
            sum += digit;

            // Remove the last digit
            number = number / 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        // Close the Scanner
        input.close();
    }
}