/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that generates the Fibonacci sequence
 * up to a specified number of terms entered by the user. Create a function
 * that calculates and prints the Fibonacci sequence.
 * Program: Fibonacci Sequence Generator
 */

import java.util.Scanner;

class FibonacciSequenceGenerator {

    // Method to generate and display Fibonacci sequence
    public static void generateFibonacci(int terms) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        generateFibonacci(terms);

        input.close();
    }
}