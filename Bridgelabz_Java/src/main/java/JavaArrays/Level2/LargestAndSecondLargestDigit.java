/*
 * Problem 3 - Largest and Second Largest Digit
 *
 * Create a program to store the digits of the number in an array and find
 * the largest and second largest element of the array.
 *
 * Hint =>
 * a. Create a number variable and take user input.
 * b. Define an array to store the digits. Set the size of the array to
 *    maxDigit variable initially set to 10.
 * c. Create an integer variable index with the value 0.
 * d. Use a loop to iterate until the number is not equal to 0.
 * e. Remove the last digit from the number and add it to the array.
 * f. Increment the index and if index equals maxDigit, break the loop.
 * g. Define variables to store largest and second largest digit.
 * h. Loop through the array and find the largest and second largest digit.
 * i. Finally display the largest and second-largest digit.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class LargestAndSecondLargestDigit {
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

        // Define maximum number of digits
        int maxDigit = 10;

        // Create an array to store the digits
        int[] digits = new int[maxDigit];

        // Initialize the index
        int index = 0;

        // Store the digits in the array
        while (number != 0) {

            // Store the last digit in the array
            digits[index] = number % 10;

            // Remove the last digit
            number /= 10;

            // Increment the index
            index++;

            // Stop if maximum array size is reached
            if (index == maxDigit) {
                break;
            }
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digit
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        // Close the Scanner Object
        input.close();
    }
}