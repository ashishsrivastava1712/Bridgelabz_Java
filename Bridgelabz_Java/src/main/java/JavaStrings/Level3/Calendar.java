/*
 * Program to display a calendar for a given month and year.
 *
 * Hint =>
 * a. Write a method to get the name of the month using a month array.
 * b. Write a method to get the number of days in the month using
 *    a days array and check for leap year in February.
 * c. Write a method to get the first day of the month using
 *    the Gregorian calendar algorithm.
 * d. Use two for loops to display the calendar with proper indentation.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class Calendar {

    // Get the name of the month
    public static String getMonthName(int month) {

        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return monthNames[month - 1];
    }

    // Check whether the year is a leap year
    public static boolean isLeapYear(int year) {

        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Get the number of days in the month
    public static int getNumberOfDays(int month, int year) {

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Get the first day of the month
    public static int getFirstDay(int month, int year) {

        int day = 1;

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        return (day + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take month and year input
        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Validate input
        if (month < 1 || month > 12 || year < 1) {
            System.err.println("Invalid month or year.");
            input.close();
            return;
        }

        // Get calendar details
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDay(month, year);

        // Display calendar heading
        System.out.println("\n     " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Display days of the month
        for (int day = 1; day <= numberOfDays; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}
