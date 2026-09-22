/*
 * Problem 9 - Greatest Factor of a Number
 *
 * Create a program to print the greatest factor of a number beside itself using a loop.
 *
 * Hint =>
 * a. Get an integer input and assign it to the number variable. As well as define a
 *    greatestFactor variable and assign it to 1
 * b. Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
 * c. Inside the loop, check if the number is perfectly divisible by i then assign i to
 *    greatestFactor variable and break the loop.
 * d. Display the greatestFactor variable outside the loop
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Initialize the greatest factor
        int greatestFactor = 1;

        // Check factors from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor beside the number
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);

        // Close the Scanner
        input.close();
    }
}