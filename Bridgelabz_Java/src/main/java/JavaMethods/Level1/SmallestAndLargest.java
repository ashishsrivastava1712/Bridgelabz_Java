/*
 * Problem 8 - Smallest and Largest of Three Numbers
 *
 * Write a program to find the smallest and largest of three numbers.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class SmallestAndLargest {

    // Find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(
            int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for three numbers
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        // Find smallest and largest
        int[] result =
                findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("Smallest Number: " + result[0]);
        System.out.println("Largest Number: " + result[1]);

        // Close the Scanner Object
        input.close();
    }
}