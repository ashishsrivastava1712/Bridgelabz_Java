/*
 * Problem 1 - Check Divisibility by 5
 *
 * Write a program to check if a number is divisible by 5
 *
 * I/P => number
 * O/P => Is the number ___ divisible by 5? ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Check whether the number is divisible by 5
        boolean isDivisible = number % 5 == 0;

        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close the Scanner
        input.close();
    }
}