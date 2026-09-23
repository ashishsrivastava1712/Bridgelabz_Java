/*
 * Problem 17 - Employee Bonus
 *
 * Create a program to find the bonus of employees based on their years of service.
 *
 * Hint =>
 * a. Give a bonus of 5% to employees whose year of service is more than 5 years.
 * b. Take salary and year of service as input.
 * c. Print the bonus amount.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take salary as input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Take years of service as input
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Validate salary and years of service
        if (salary < 0 || yearsOfService < 0) {
            System.err.println("Invalid Input.");
            System.exit(0);
        }

        // Initialize bonus amount
        double bonus = 0.0;

        // Calculate 5% bonus if service is more than 5 years
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Display the bonus amount
        System.out.println("Bonus Amount: " + bonus);

        // Close the Scanner Object
        input.close();
    }
}