/*
 * Problem 9 - Number Analysis
 *
 * Take user input for 5 numbers and check whether each number is
 * positive or negative. For positive numbers, check whether the
 * number is even or odd. Finally compare the first and last
 * elements of the array.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class NumberAnalysis {

    // Check whether the number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Check whether the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Compare two numbers
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Take input for the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {

                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }

            } else {
                System.out.println(numbers[i] + " is Negative.");
            }
        }

        // Compare first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        // Display comparison result
        if (comparisonResult == 1) {
            System.out.println("First element is greater than last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        // Close Scanner Object
        input.close();
    }
}