/*
 * Problem 8 - Youngest and Tallest Friend
 *
 * Find the youngest among Amar, Akbar and Anthony based on their ages
 * and the tallest among them based on their heights.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class YoungestTallestFriend {

    // Find the index of the youngest friend
    public static int findYoungest(int[] ages) {

        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }

    // Find the index of the tallest friend
    public static int findTallest(double[] heights) {

        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Store names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Create arrays for ages and heights
        int[] ages = new int[names.length];
        double[] heights = new double[names.length];

        // Take input for age and height
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Find youngest friend
        int youngestIndex = findYoungest(ages);

        // Find tallest friend
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);

        // Close Scanner Object
        input.close();
    }
}