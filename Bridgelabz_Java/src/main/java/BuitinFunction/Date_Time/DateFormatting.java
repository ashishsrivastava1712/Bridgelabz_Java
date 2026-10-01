/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that displays the current date
 * in three different formats: dd/MM/yyyy, yyyy-MM-dd, and
 * EEE, MMM dd, yyyy. Use DateTimeFormatter with custom patterns.
 * Program: Date Formatting
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormatting {

    // Method to display date in different formats
    public static void displayFormattedDates(LocalDate date) {

        DateTimeFormatter formatOne =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formatTwo =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter formatThree =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + date.format(formatOne));
        System.out.println("Format 2: " + date.format(formatTwo));
        System.out.println("Format 3: " + date.format(formatThree));
    }

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        displayFormattedDates(currentDate);
    }
}