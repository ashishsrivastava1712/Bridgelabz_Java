/*
 * Problem 10 - BMI Calculator
 *
 * Calculate BMI of 10 persons and display their height,
 * weight, BMI and weight status.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class BMICalculator {

    // Calculate BMI using weight and height
    public static double calculateBMI(double weight, double heightInCm) {

        // Convert height from centimeters to meters
        double heightInMeter = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        return bmi;
    }

    // Determine BMI status
    public static String determineBMIStatus(double bmi) {

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Number of persons
        int numberOfPersons = 10;

        // Create 2D array to store weight, height and BMI
        double[][] personData = new double[numberOfPersons][3];

        // Create array to store BMI status
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height
        for (int i = 0; i < personData.length; i++) {

            System.out.println("Enter details for Person " + (i + 1));

            // Take weight input
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();

            // Validate weight
            while (weight <= 0) {
                System.out.print("Invalid weight. Enter positive weight: ");
                weight = input.nextDouble();
            }

            // Take height input
            System.out.print("Enter height in cm: ");
            double height = input.nextDouble();

            // Validate height
            while (height <= 0) {
                System.out.print("Invalid height. Enter positive height: ");
                height = input.nextDouble();
            }

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate and store BMI
            personData[i][2] = calculateBMI(weight, height);

            // Determine and store BMI status
            weightStatus[i] = determineBMIStatus(personData[i][2]);
        }

        // Display BMI details
        System.out.println("\nBMI Details:");

        for (int i = 0; i < personData.length; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        // Close Scanner Object
        input.close();
    }
}