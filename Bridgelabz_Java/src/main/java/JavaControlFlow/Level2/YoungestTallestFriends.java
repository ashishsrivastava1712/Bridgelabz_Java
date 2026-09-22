/*
 * Problem 8 - Youngest and Tallest Friend
 *
 * Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on
 * their ages and the tallest among the friends based on their heights.
 *
 * Hint =>
 * a. Take user input for the age and height of the 3 friends and store it in a variable.
 * b. Find the smallest of the 3 ages to find the youngest friend and display it.
 * c. Find the largest of the 3 heights to find the tallest friend and display it.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get ages of the three friends
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        // Get heights of the three friends
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        // Find the youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend: Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend: Akbar");
        } else {
            System.out.println("Youngest friend: Anthony");
        }

        // Find the tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Akbar");
        } else {
            System.out.println("Tallest friend: Anthony");
        }

        // Close the Scanner
        input.close();
    }
}