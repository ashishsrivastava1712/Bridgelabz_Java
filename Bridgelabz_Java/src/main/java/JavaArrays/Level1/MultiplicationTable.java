/*
 * Problem 3 - Multiplication Table Using Array
 *
 * Create a program to print a multiplication table of a number.
 *
 * Hint =>
 * a. Get an integer input and store it in the number variable. Also, define
 *    an integer array to store the results of multiplication from 1 to 10.
 * b. Run a loop from 1 to 10 and store the results in the multiplication
 *    table array.
 * c. Finally, display the result from the array in the format number * i = ___
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int[] multiplicationTable = new int[10];

        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        input.close();
    }
}