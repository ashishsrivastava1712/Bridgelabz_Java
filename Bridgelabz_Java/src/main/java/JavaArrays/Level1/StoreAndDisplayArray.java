/*
 * Problem 1 - Store and Display Elements of an Array
 *
 * Write a program to take 5 integer values from the user,
 * store them in an array, and display all the elements of the array.
 *
 * Hint =>
 * a. Create an integer array of size 5.
 * b. Use a loop to take input from the user and store the values in the array.
 * c. Use another loop to display all the elements of the array.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class StoreAndDisplayArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}