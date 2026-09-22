/*
 * Problem 3 - Check the Largest of Three Numbers
 *
 * Write a program to check if the first, second, or third number is the largest of the three.
 *
 * I/P => number1, number2, number3
 * O/P =>
 * Is the first number the largest? ____
 * Is the second number the largest? ___
 * Is the third number the largest? ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get three numbers from the user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if the first number is the largest
        boolean isFirstLargest = number1 > number2 && number1 > number3;

        // Check if the second number is the largest
        boolean isSecondLargest = number2 > number1 && number2 > number3;

        // Check if the third number is the largest
        boolean isThirdLargest = number3 > number1 && number3 > number2;

        // Print the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the Scanner
        input.close();
    }
}