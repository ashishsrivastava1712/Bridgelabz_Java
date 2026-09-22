/*
 * Problem 6 - Check Positive, Negative, or Zero
 *
 * Write a program to check whether a number is positive, negative, or zero.
 *
 * Hint =>
 * a. Get integer input from the user and store it in the number variable.
 * b. If the number is positive, print positive.
 * c. If the number is negative, print negative.
 * d. Otherwise, print zero.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        input.close();
    }
}