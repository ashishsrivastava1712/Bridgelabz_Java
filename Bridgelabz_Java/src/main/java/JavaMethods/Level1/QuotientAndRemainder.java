/*
 * Problem 9 - Quotient and Remainder
 *
 * Write a program to take two numbers and print their
 * quotient and remainder.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class QuotientAndRemainder {

    // Find quotient and remainder
    public static int[] findRemainderAndQuotient(
            int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Take input for divisor
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Validate the divisor
        if (divisor == 0) {
            System.err.println("Divisor cannot be zero.");
            System.exit(0);
        }

        // Find quotient and remainder
        int[] result =
                findRemainderAndQuotient(number, divisor);

        // Display the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        // Close the Scanner Object
        input.close();
    }
}