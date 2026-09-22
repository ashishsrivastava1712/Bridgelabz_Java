/*
 * Problem 2 - Count Number of Digits
 *
 * Create a program to count the number of digits in an integer.
 *
 * Hint =>
 * a. Get an integer input for the number variable.
 * b. Create an integer variable count with value 0.
 * c. Use a loop to iterate until number is not equal to 0.
 * d. Remove the last digit from number in each iteration.
 * e. Increase count by 1 in each iteration.
 * f. Finally display the count to show the number of digits.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        int number = input.nextInt();

        // Create a count variable with initial value 0
        int count = 0;

        // Iterate until the number becomes 0
        while (number != 0) {

            // Remove the last digit from the number
            number = number / 10;

            // Increase the digit count
            count++;
        }

        // Display the number of digits
        System.out.println("Number of digits: " + count);

        // Close the Scanner
        input.close();
    }
}