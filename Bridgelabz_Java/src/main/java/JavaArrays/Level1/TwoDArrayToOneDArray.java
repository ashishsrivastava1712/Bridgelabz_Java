/*
 * Problem 9 - Copy 2D Array into a Single Dimension Array
 *
 * Working with Multi-Dimensional Arrays. Write a Java program to create
 * a 2D Array and Copy the 2D Array into a single dimension array.
 *
 * Hint =>
 * a. Take user input for rows and columns, create a 2D array (Matrix),
 *    and take the user input.
 * b. Copy the elements of the matrix to a 1D array. For this create a
 *    1D array of size rows * columns as in int[] array = new int[rows * columns].
 * c. Define the index variable and Loop through the 2D array. Copy every
 *    element of the 2D array into the 1D array and increment the index.
 * d. Note: For looping through the 2D array, you will need Nested for loop,
 *    Outer for loop for rows, and the inner for loops to access each element.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class TwoDArrayToOneDArray {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Create the 2D array
        int[][] matrix = new int[rows][columns];

        // Take input for the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array of size rows * columns
        int[] array = new int[rows * columns];

        // Initialize index variable
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("The elements of the 1D array are:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}