/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that calculates the factorial of a
 * number using a recursive function. Use separate methods for input,
 * calculation, and output.
 * Program: Factorial Using Recursion
 */

import java.util.Scanner;

class FactorialUsingRecursion {

    // Method to take number input
    public static int getNumber(Scanner input) {
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }

    // Method to display result
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = getNumber(input);

        long factorial = calculateFactorial(number);

        displayResult(number, factorial);

        input.close();
    }
}