/*
 * Problem 3 - Leap Year
 *
 * Write a program that takes a year as input and outputs whether
 * the year is a Leap Year or not.
 *
 * Hint =>
 * a. The Leap Year program only works for year >= 1582,
 *    corresponding to a year in the Gregorian calendar.
 * b. Leap year is divisible by 4 and not divisible by 100,
 *    or divisible by 400.
 * c. Write a method to check for Leap Year using the conditions.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class LeapYear {

    // Check whether the given year is a leap year
    public static boolean isLeapYear(int year) {

        // Check the leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Validate the year
        if (year < 1582) {
            System.err.println("Invalid Year. Year must be 1582 or later.");
            System.exit(0);
        }

        // Check whether the year is a leap year
        boolean leapYear = isLeapYear(year);

        // Display the result
        if (leapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the Scanner Object
        input.close();
    }
}