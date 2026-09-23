/*
 * Problem 2 - Youngest and Tallest Friend
 *
 * Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony
 * based on their ages and the tallest among the friends based on their heights.
 *
 * Hint =>
 * a. Take user input for age and height for the 3 friends and store it in two
 *    arrays each to store the values for age and height of the 3 friends
 * b. Loop through the array and find the youngest of the 3 friends and the
 *    tallest of the 3 friends
 * c. Finally display the youngest and tallest of the 3 friends
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Declare an array to store friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Declare arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height of each friend
        for (int i = 0; i < friends.length; i++) {

            System.out.println("Enter details for " + friends[i]);

            // Take age input
            System.out.print("Enter age: ");
            ages[i] = input.nextInt();

            // Take height input
            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();
        }

        // Assume the first friend is the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find the youngest and tallest friend
        for (int i = 1; i < friends.length; i++) {

            // Check for youngest friend
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Check for tallest friend
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest friend
        System.out.println("\nYoungest Friend: " + friends[youngestIndex]);
        System.out.println("Age: " + ages[youngestIndex]);

        // Display the tallest friend
        System.out.println("\nTallest Friend: " + friends[tallestIndex]);
        System.out.println("Height: " + heights[tallestIndex]);

        // Close the Scanner Object
        input.close();
    }
}