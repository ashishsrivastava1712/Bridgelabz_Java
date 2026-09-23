/*
 * Problem 5 - Check Number Sign
 *
 * Write a program to check whether a number is positive,
 * negative, or zero.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class NumberSign {

    // Return -1 for negative, 1 for positive and 0 for zero
    public int checkNumberSign(int number) {

        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create object of NumberSign class
        NumberSign numberSign = new NumberSign();

        // Check the number sign
        int result = numberSign.checkNumberSign(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        // Close the Scanner Object
        input.close();
    }
}