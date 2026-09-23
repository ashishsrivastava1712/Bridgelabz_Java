/*
 * Problem 7 - Save Odd and Even Numbers into Arrays
 *
 * Create a program to save odd and even numbers into odd and even arrays
 * between 1 to the number entered by the user. Finally, print the odd and
 * even numbers array.
 *
 * Hint =>
 * a. Get an integer input from the user, assign it to a variable number,
 *    and check for Natural Number. If not a natural number then print an
 *    error and exit the program.
 * b. Create an integer array for even and odd numbers with size =
 *    number / 2 + 1.
 * c. Create index variables for odd and even numbers and initialize them
 *    to zero.
 * d. Using a for loop, iterate from 1 to the number, and in each iteration
 *    of the loop, save the odd or even number into the corresponding array.
 * e. Finally, print the odd and even numbers array using the odd and even index.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate the user input
        if (number <= 0) {
            System.err.println("Invalid Number. Please enter a natural number.");
            System.exit(0);
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initialize index variables
        int oddIndex = 0;
        int evenIndex = 0;

        // Store odd and even numbers in their respective arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Display odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i]);
        }

        // Display even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}