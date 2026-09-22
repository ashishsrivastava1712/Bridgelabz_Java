/*
 * Problem 5 - Day Of Week
 *
 * Write a program DayOfWeek that takes a date as input and prints the day of the week
 * that the date falls on. Your program should take three command-line arguments: m
 * (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For
 * output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following
 * formulas, for the Gregorian calendar (where / denotes integer division):
 *
 * y0 = y - (14 - m) / 12
 * x = y0 + y0 / 4 - y0 / 100 + y0 / 400
 * m0 = m + 12 × ((14 - m) / 12) - 2
 * d0 = (d + x + 31m0 / 12) mod 7
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level3;

public class DayOfWeek {
    public static void main(String[] args) {

        // Get month, day, and year from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        // Calculate y0 using the given formula
        int y0 = year - (14 - month) / 12;

        // Calculate x using the given formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate m0 using the given formula
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate the day of the week
        int d0 = (day + x + 31 * m0 / 12) % 7;

        // Print the result
        System.out.println(d0);
    }
}