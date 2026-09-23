/*
 * Problem 4 - Store Multiple Values and Calculate Sum
 *
 * Write a program to store multiple values in an array up to a maximum of 10
 * or until the user enters a 0 or a negative number. Show all the numbers
 * as well as the sum of all numbers.
 *
 * Hint =>
 * a. Create an array of 10 elements of type double and a variable to store
 *    the total initialized to 0.0. Initialize the index variable to 0.
 * b. Use an infinite while loop as in while (true).
 * c. Take the user entry and check if the user entered 0 or a negative number
 *    to break the loop.
 * d. Also, break from the loop if the index has a value of 10 as the array
 *    size is limited to 10.
 * e. If the user entered a number other than 0 or a negative number, assign
 *    the number to the array element and increment the index value.
 * f. Take another for loop to get the values of each element and add them
 *    to the total.
 * g. Finally, display the total value.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double number = input.nextDouble();

            if (number <= 0 || index == 10) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total = " + total);

        input.close();
    }
}