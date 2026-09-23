/*
 * Problem 7 - Sum of Natural Numbers
 *
 * Write a program to find the sum of n natural numbers using loop.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Calculate the sum of n natural numbers
    public int calculateSum(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate the user input
        if (number <= 0) {
            System.err.println("Invalid Natural Number.");
            System.exit(0);
        }

        // Create object of SumOfNaturalNumbers class
        SumOfNaturalNumbers naturalNumbers = new SumOfNaturalNumbers();

        // Calculate the sum
        int sum = naturalNumbers.calculateSum(number);

        // Display the result
        System.out.println("Sum of Natural Numbers: " + sum);

        // Close the Scanner Object
        input.close();
    }
}