/*
 * Problem 7 - BMI Using Multi-Dimensional Array
 *
 * Rewrite the above BMI program using a multi-dimensional array to store
 * height, weight, and BMI in a 2D array for all the persons.
 *
 * Hint =>
 * a. Take input for a number of persons.
 * b. Create a multi-dimensional array to store weight, height and BMI.
 *    Also create an array to store the weight status of the persons.
 * c. Use double[][] personData = new double[number][3].
 * d. Calculate BMI and store the BMI in the 2D array.
 * e. Find the weight status of each person.
 * f. Display height, weight, BMI and weight status of each person.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class BMIUsingMultiDimensionalArray {
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

        // Create a 2D array to store height, weight and BMI
        double[][] personData = new double[number][3];

        // Create an array to store weight status
        String[] weightStatus = new String[number];

        // Take input for height and weight
        for (int i = 0; i < personData.length; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            // Take height input
            System.out.print("Enter height in meters: ");
            personData[i][0] = input.nextDouble();

            // Take weight input
            System.out.print("Enter weight in kilograms: ");
            personData[i][1] = input.nextDouble();

            // Validate height and weight
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.err.println("Invalid height or weight.");
                i--;
                continue;
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < personData.length; i++) {

            // Calculate and store BMI
            personData[i][2] =
                    personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display height, weight, BMI and weight status
        System.out.println("\nPerson Details:");

        for (int i = 0; i < personData.length; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + personData[i][0] + " m");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}