/*
 * Problem 7 - Find the BMI of a Person
 *
 * Create a program to find the BMI of a person.
 *
 * Hint =>
 * a. Take user input in double for the weight (in kg) of the person and height (in cm) for the
 *    person and store it in the corresponding variable.
 * b. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm
 *    to meter.
 * c. Use the table to determine the weight status of the person.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get weight in kilograms and height in centimeters
        double weight = input.nextDouble();
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeter = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        // Display the BMI
        System.out.println("BMI: " + bmi);

        // Determine the weight status using the BMI value
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        // Close the Scanner
        input.close();
    }
}