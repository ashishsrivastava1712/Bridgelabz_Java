/*
 * Problem 5 - Reverse a Number Using an Array
 *
 * Create a program to take a number as input and reverse the number.
 * To do this, store the digits of the number in an array and display
 * the array in reverse order.
 *
 * Hint =>
 * a. Take user input for a number.
 * b. Find the count of digits in the number.
 * c. Find the digits in the number and save them in an array.
 * d. Create an array to store the elements of the digits array in
 *    reverse order.
 * e. Finally, display the elements of the array in reverse order.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the user input
        if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }

        // Find the count of digits
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Handle zero as a single digit
        if (number == 0) {
            count = 1;
        }

        // Create an array to store the digits
        int[] digits = new int[count];

        // Store the digits in the array
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Create an array to store digits in reverse order
        int[] reverseDigits = new int[count];

        // Copy digits into the reverse array
        for (int i = 0; i < digits.length; i++) {
            reverseDigits[i] = digits[digits.length - 1 - i];
        }

        // Display the reversed number
        System.out.print("Reversed Number: ");

        for (int i = 0; i < reverseDigits.length; i++) {
            System.out.print(reverseDigits[i]);
        }

        System.out.println();

        // Close the Scanner Object
        input.close();
    }
}