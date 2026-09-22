/*
 * Problem 4 - Check Natural Number and Find Sum
 *
 * Write a program to check for the natural number and write the sum of n natural numbers.
 *
 * Hint =>
 * a. A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
 * b. A sum of n natural numbers is n * (n+1) / 2
 *
 * I/P => number
 *
 * O/P => If the number is a positive integer then the output is
 * The sum of ___ natural numbers is ___
 * Otherwise
 * The number ___ is not a natural number
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}