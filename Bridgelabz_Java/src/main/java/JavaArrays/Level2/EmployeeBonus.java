/*
 * Problem 1 - Employee Bonus Calculation
 *
 * Create a program to find the bonus of 10 employees based on their years of service
 * and the total bonus amount the company Zara has to pay, along with the old and new salary.
 *
 * Hint =>
 * a. Zara decides to give a bonus of 5% to employees whose year of service is more than
 *    5 years or 2% if less than 5 years.
 * b. Define a double array to save salary and years of service for each of the 10 employees.
 * c. Also define a double array to save the new salary and the bonus amount as well as
 *    variables to save the total bonus, total old salary, and new salary.
 * d. Define a loop to take input from the user. If salary or year of service is an invalid
 *    number then ask the user to enter again.
 * e. Define another loop to calculate the bonus of 10 employees based on their years of
 *    service. Save the bonus in the array, compute the new salary, and save in the array.
 *    Also, the total bonus and total old and new salary can be calculated in the loop.
 * f. Print the total bonus payout as well as the total old and new salary of all the employees.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Declare arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Declare arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Declare variables to store total salary and bonus
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;

        // Take input for salary and years of service of 10 employees
        for (int i = 0; i < salary.length; i++) {

            System.out.println("Enter details for Employee " + (i + 1));

            // Take salary input
            System.out.print("Enter salary: ");
            double employeeSalary = input.nextDouble();

            // Take years of service input
            System.out.print("Enter years of service: ");
            double employeeYears = input.nextDouble();

            // Validate salary and years of service
            if (employeeSalary <= 0 || employeeYears < 0) {
                System.err.println("Invalid input. Please enter valid values.");
                i--;
                continue;
            }

            // Store salary and years of service in arrays
            salary[i] = employeeSalary;
            yearsOfService[i] = employeeYears;
        }

        // Calculate bonus and new salary for each employee
        for (int i = 0; i < salary.length; i++) {

            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Calculate total values
            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display total old salary
        System.out.println("\nTotal Old Salary: " + totalOldSalary);

        // Display total bonus
        System.out.println("Total Bonus Payout: " + totalBonus);

        // Display total new salary
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the Scanner Object
        input.close();
    }
}