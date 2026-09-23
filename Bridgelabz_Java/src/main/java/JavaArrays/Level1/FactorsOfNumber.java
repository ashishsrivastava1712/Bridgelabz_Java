/*
 * Problem 8 - Find Factors of a Number Using an Array
 *
 * Create a program to find the factors of a number taken as user input,
 * store the factors in an array, and display the factors.
 *
 * Hint =>
 * a. Take the input for a number.
 * b. Find the factors of the number and save them in an array. For this
 *    create integer variable maxFactor and initialize to 10, factors array
 *    of size maxFactor and index variable to reflect the index of the array.
 * c. To find factors loop through the numbers from 1 to the number, find
 *    the factors, and add them to the array element by incrementing the
 *    index. If the index is equal to maxIndex, then need factors array to
 *    store more elements.
 * d. To store more elements, reset the maxIndex to twice its size, use the
 *    temp array to store the elements from the factors array, and eventually
 *    assign the factors array to the temp array.
 * e. Finally, display the factors of the number.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize maximum factor size and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find the factors of the number
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Check if the array needs more space
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    // Copy existing factors into the temporary array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store the factor in the array
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");

        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}