/*
 * Problem 2 - Check if the First Number is the Smallest
 *
 * Write a program to check if the first is the smallest of the 3 numbers.
 *
 * I/P => number1, number2, number3
 *
 * O/P => Is the first number the smallest? ____
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class FirstNumberSmallest {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get three numbers from the user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = number1 <= number2 && number1 <= number3;

        // Display the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the Scanner
        input.close();
    }
}