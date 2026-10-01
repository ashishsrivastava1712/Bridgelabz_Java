/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that takes a date input and adds
 * 7 days, 1 month, and 2 years to it. Then subtracts 3 weeks from
 * the result. Use LocalDate date arithmetic methods.
 * Program: Date Arithmetic
 */

import java.time.LocalDate;
import java.util.Scanner;

class DateArithmetic {

    // Method to perform date arithmetic
    public static LocalDate calculateDate(LocalDate date) {

        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);

        return date;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateInput = input.nextLine();

        LocalDate date = LocalDate.parse(dateInput);

        LocalDate result = calculateDate(date);

        System.out.println("Original Date: " + date);
        System.out.println("Final Date: " + result);

        input.close();
    }
}