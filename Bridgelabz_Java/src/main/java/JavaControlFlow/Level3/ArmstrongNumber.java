/*
 * Problem 1 - Check Armstrong Number
 *
 * Create a program to check if a number is Armstrong or not. Use the hints to show the steps
 * clearly in the code.
 *
 * Hint =>
 * a. Armstrong Number is a number whose Sum of cubes of each digit results in the original
 *    number e.g. 153 = 1^3 + 5^3 + 3^3
 * b. Get an integer input and store it in the number variable define sum variable, initialize it
 *    to zero and originalNumber variable, and assign it to the input number variable
 * c. Use the while loop till the originalNumber is not equal to zero
 * d. In the while loop find the reminder number by using the modulus operator as in
 *    number % 10. Find the cube of the number and add it to the sum variable
 * e. Again in while loop find the quotient of the number and assign it to the original number
 *    using number / 10 expression. This removes the last digit of the original number.
 * f. Finally check if the number and the sum are the same, if same its an Armstrong number
 *    else not. So display accordingly
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        int number = input.nextInt();

        // Store the original number and initialize sum to zero
        int originalNumber = number;
        int sum = 0;

        // Use while loop to access each digit of the number
        while (number != 0) {

            // Find the last digit using modulus operator
            int digit = number % 10;

            // Find the cube of the digit and add it to sum
            sum += digit * digit * digit;

            // Remove the last digit from the number
            number = number / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

        // Close the Scanner
        input.close();
    }
}