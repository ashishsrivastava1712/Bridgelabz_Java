/*
 * Problem 4 - Triangular Park Run
 *
 * An athlete runs in a triangular park with sides provided as input.
 * Find the number of rounds required to complete a 5 km run.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class TriangularParkRun {

    // Calculate the number of rounds required
    public double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;
        double requiredDistance = 5000;
        double rounds = requiredDistance / perimeter;

        return rounds;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the three sides
        System.out.print("Enter side 1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        double side3 = input.nextDouble();

        // Validate the user input
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.err.println("Invalid Side Length.");
            System.exit(0);
        }

        // Create object of TriangularParkRun class
        TriangularParkRun parkRun = new TriangularParkRun();

        // Calculate required rounds
        double rounds = parkRun.calculateRounds(side1, side2, side3);

        // Display the result
        System.out.println("Number of Rounds Required: " + rounds);

        // Close the Scanner Object
        input.close();
    }
}