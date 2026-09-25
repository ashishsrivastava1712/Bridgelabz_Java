/*
 * Create a program to find the Euclidean distance between two points
 * as well as the equation of the line using those two points.
 *
 * Hint =>
 * a. Take inputs for two points x1, y1 and x2, y2.
 * b. Write a method to find the Euclidean distance between two points
 *    using Math.pow() and Math.sqrt().
 * c. Write a method to find the equation of a line given two points.
 *    The method should return an array containing the slope and
 *    y-intercept.
 *
 *    Distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
 *
 *    Slope (m) = (y2 - y1) / (x2 - x1)
 *
 *    Y-intercept (b) = y1 - m * x1
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level3;

import java.util.Scanner;

public class EuclideanDistanceAndLine {

    // Calculate the Euclidean distance between two points
    public static double calculateDistance(
            double x1, double y1, double x2, double y2) {

        double xDifference = x2 - x1;
        double yDifference = y2 - y1;

        return Math.sqrt(
                Math.pow(xDifference, 2) +
                        Math.pow(yDifference, 2)
        );
    }

    // Find the slope and y-intercept of the line
    public static double[] findLineEquation(
            double x1, double y1, double x2, double y2) {

        double slope = (y2 - y1) / (x2 - x1);

        double yIntercept = y1 - slope * x1;

        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Take coordinates of the second point
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Find slope and y-intercept
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        // Display the distance
        System.out.println("Euclidean Distance: " + distance);

        // Display slope
        System.out.println("Slope: " + lineEquation[0]);

        // Display y-intercept
        System.out.println("Y-Intercept: " + lineEquation[1]);

        // Display equation of the line
        System.out.println(
                "Equation of the line: y = "
                        + lineEquation[0]
                        + "x + "
                        + lineEquation[1]
        );

        input.close();
    }
}