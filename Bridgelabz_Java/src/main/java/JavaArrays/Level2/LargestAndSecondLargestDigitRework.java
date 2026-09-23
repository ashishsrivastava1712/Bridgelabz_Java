/*
 * Problem 4 - Largest and Second Largest Digit Using Dynamic Array
 *
 * Rework the program from Problem 3. If the index is equal to maxDigit,
 * increase the size of the array by 10 instead of breaking from the loop.
 * This allows all digits of the number to be stored and considered.
 *
 * Hint =>
 * a. If the index is equal to maxDigit, increase maxDigit by 10.
 * b. Create a new temp array of size maxDigit.
 * c. Copy the digits from the current array into the temp array.
 * d. Assign the current digits array to the temp array.
 * e. Find the largest and second largest digit from the array.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class LargestAndSecondLargestDigitRework {
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

        // Store all digits of the number in the array
        while (number != 0) {

            // Check if the array is full
            if (index == maxDigit) {

                // Increase the array size by 10
                maxDigit += 10;

                // Create a temporary array
                int[] temp = new int[maxDigit];

                // Copy the existing digits into the temporary array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the temporary array to digits
                digits = temp;
            }

            // Store the last digit
            digits[index] = number % 10;

            // Remove the last digit
            number /= 10;

            // Increment the index
            index++;
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

        // Display the largest digit
        System.out.println("Largest Digit: " + largest);

        // Display the second largest digit
        System.out.println("Second Largest Digit: " + secondLargest);

        // Close the Scanner Object
        input.close();
    }
}