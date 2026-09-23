/*
 * Problem 10 - Frequency of Each Digit
 *
 * Create a program to take a number as input, find the frequency of
 * each digit in the number using an array and display the frequency
 * of each digit.
 *
 * Hint =>
 * a. Take the input for a number.
 * b. Find the count of digits in the number.
 * c. Find the digits in the number and save them in an array.
 * d. Define a frequency array of size 10. Loop through the digits
 *    array and increase the frequency of each digit.
 * e. Display the frequency of each digit in the number.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class DigitFrequency {
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
        temp = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create a frequency array of size 10
        int[] frequency = new int[10];

        // Find the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " = " + frequency[i]);
            }
        }

        // Close the Scanner Object
        input.close();
    }
}