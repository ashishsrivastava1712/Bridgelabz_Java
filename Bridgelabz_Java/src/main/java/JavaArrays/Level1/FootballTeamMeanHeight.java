/*
 * Problem 6 - Mean Height of Football Players
 *
 * Create a program to find the mean height of players present in a football team.
 *
 * Hint =>
 * a. The formula to calculate the mean is:
 *    mean = sum of all elements / number of elements
 * b. Create a double array named heights of size 11 and get input values from the user.
 * c. Find the sum of all the elements present in the array.
 * d. Divide the sum by 11 to find the mean height and print the mean height
 *    of the football team.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Create a double array of size 11
        double[] heights = new double[11];

        // Take input for the height of each player
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        // Find the sum of all the heights
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.println("Mean height of the football team: " + mean);

        // Close the Scanner Object
        input.close();
    }
}