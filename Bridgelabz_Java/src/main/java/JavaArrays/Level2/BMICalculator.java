/*
 * Problem 6 - Body Mass Index (BMI)
 *
 * An organization took up an exercise to find the Body Mass Index (BMI)
 * of all the persons in the team. Create a program to find the BMI and
 * display the height, weight, BMI and status of each individual.
 *
 * Hint =>
 * a. Take input for a number of persons.
 * b. Create arrays to store the weight, height, BMI, and weight status
 *    of the persons.
 * c. Take input for the weight and height of the persons.
 * d. Calculate the BMI of all the persons and store them in an array
 *    and also find the weight status of the persons.
 * e. Display the height, weight, BMI, and weight status of each person.
 * f. Use the table to determine the weight status of the person.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Validate the number of persons
        if (number <= 0) {
            System.err.println("Invalid number of persons.");
            System.exit(0);
        }

        // Create arrays to store height, weight, BMI and weight status
        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        // Take input for height and weight of each person
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            // Take height input in meters
            System.out.print("Enter height in meters: ");
            height[i] = input.nextDouble();

            // Take weight input in kilograms
            System.out.print("Enter weight in kilograms: ");
            weight[i] = input.nextDouble();

            // Validate height and weight
            if (height[i] <= 0 || weight[i] <= 0) {
                System.err.println("Invalid height or weight.");
                i--;
                continue;
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display height, weight, BMI and weight status
        System.out.println("\nPerson Details:");

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}