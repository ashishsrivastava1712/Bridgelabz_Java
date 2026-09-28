/*
 * Program to calculate the BMI of 10 persons and display
 * their height, weight, BMI, and BMI status.
 *
 * Hint =>
 * 1. Take weight in kg and height in cm for 10 persons
 *    and store them in a 2D array.
 * 2. Create a method to calculate BMI and status.
 * 3. Create a method to create a 2D String array containing
 *    height, weight, BMI, and status.
 * 4. Create a method to display the result in tabular format.
 * 5. Finally display the results.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and determine BMI status
    public static String[] calculateBMI(double weight, double height) {

        // Convert height from centimeters to meters
        double heightInMeter = height / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        // Determine BMI status
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

        return new String[]{
                String.valueOf(height),
                String.valueOf(weight),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to calculate BMI details for all persons
    public static String[][] calculateBMIForAll(double[][] personData) {

        String[][] result = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            String[] bmiResult = calculateBMI(weight, height);

            for (int j = 0; j < bmiResult.length; j++) {
                result[i][j] = bmiResult[j];
            }
        }

        return result;
    }

    // Method to display BMI results in tabular format
    public static void displayResults(String[][] result) {

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                            result[i][0] + "\t\t" +
                            result[i][1] + "\t\t" +
                            result[i][2] + "\t" +
                            result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create 2D array for 10 persons
        double[][] personData = new double[10][2];

        // Take input for weight and height
        for (int i = 0; i < personData.length; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height in cm: ");
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI and status for all persons
        String[][] result = calculateBMIForAll(personData);

        // Display results
        displayResults(result);

        input.close();
    }
}