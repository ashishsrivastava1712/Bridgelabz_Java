/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that takes two date inputs and
 * compares them to check if the first date is before, after, or the
 * same as the second date. Use isBefore(), isAfter(), and isEqual()
 * methods from the LocalDate class.
 * Program: Date Comparison
 */

import java.time.LocalDate;
import java.util.Scanner;

class DateComparison {

    // Method to compare two dates
    public static void compareDates(LocalDate firstDate, LocalDate secondDate) {

        if (firstDate.isBefore(secondDate)) {

            System.out.println("First date is before the second date.");

        } else if (firstDate.isAfter(secondDate)) {

            System.out.println("First date is after the second date.");

        } else if (firstDate.isEqual(secondDate)) {

            System.out.println("Both dates are the same.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstInput = input.nextLine();

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondInput = input.nextLine();

        LocalDate firstDate = LocalDate.parse(firstInput);
        LocalDate secondDate = LocalDate.parse(secondInput);

        compareDates(firstDate, secondDate);

        input.close();
    }
}