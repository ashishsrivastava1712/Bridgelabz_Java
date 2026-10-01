/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that takes three integer inputs from
 * the user and finds the maximum of the three numbers. Use separate methods
 * for taking input and calculating the maximum value.
 * Program: Maximum of Three Numbers
 */

import java.util.Scanner;

class MaximumOfThreeNumbers {

    // Method to take integer input
    public static int getNumber(Scanner input, String message) {
        System.out.print(message);
        return input.nextInt();
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int first, int second, int third) {

        int maximum = first;

        if (second > maximum) {
            maximum = second;
        }

        if (third > maximum) {
            maximum = third;
        }

        return maximum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first = getNumber(input, "Enter first number: ");
        int second = getNumber(input, "Enter second number: ");
        int third = getNumber(input, "Enter third number: ");

        int maximum = findMaximum(first, second, third);

        System.out.println("Maximum number: " + maximum);

        input.close();
    }
}