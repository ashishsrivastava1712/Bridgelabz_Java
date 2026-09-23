/*
 * Problem 1 - Simple Interest
 *
 * Write a program to input the Principal, Rate, and Time values
 * and calculate Simple Interest.
 *
 * Hint =>
 * a. Simple Interest = Principal * Rate * Time / 100
 * b. Take user input for principal, rate, time
 * c. Write a method to calculate the simple interest
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class SimpleInterest {

    // Calculate the simple interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for principal
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        // Take input for rate
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        // Take input for time
        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        // Validate the user input
        if (principal < 0 || rate < 0 || time < 0) {
            System.err.println("Invalid Input.");
            System.exit(0);
        }

        // Create object of SimpleInterest class
        SimpleInterest simpleInterest = new SimpleInterest();

        // Calculate the simple interest
        double result = simpleInterest.calculateSimpleInterest(
                principal, rate, time
        );

        // Display the result
        System.out.println(
                "The Simple Interest is " + result
                        + " for Principal " + principal
                        + ", Rate of Interest " + rate
                        + " and Time " + time
        );

        // Close the Scanner Object
        input.close();
    }
}