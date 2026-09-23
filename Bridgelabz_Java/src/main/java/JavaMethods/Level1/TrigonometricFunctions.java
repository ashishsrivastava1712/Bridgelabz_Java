/*
 * Problem 12 - Trigonometric Functions
 *
 * Write a program to calculate various trigonometric functions
 * using Math class given an angle in degrees.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class TrigonometricFunctions {

    // Calculate sine, cosine and tangent
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for angle
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Create object of TrigonometricFunctions class
        TrigonometricFunctions trigonometricFunctions =
                new TrigonometricFunctions();

        // Calculate trigonometric functions
        double[] result =
                trigonometricFunctions
                        .calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        // Close the Scanner Object
        input.close();
    }
}