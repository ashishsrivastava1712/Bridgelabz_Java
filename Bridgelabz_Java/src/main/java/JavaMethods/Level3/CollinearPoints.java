/*
 * Write a program to find whether 3 points are collinear using
 * the slope formula and area of triangle formula.
 *
 * Check A(2, 4), B(4, 6) and C(6, 8) as a sample.
 *
 * Hint =>
 * a. Take inputs for 3 points x1, y1, x2, y2 and x3, y3.
 *
 * b. Write a method to check whether the 3 points are collinear
 *    using the slope formula.
 *
 *    Slope AB = (y2 - y1) / (x2 - x1)
 *    Slope BC = (y3 - y2) / (x3 - x2)
 *    Slope AC = (y3 - y1) / (x3 - x1)
 *
 *    Points are collinear if:
 *    Slope AB = Slope BC = Slope AC
 *
 * c. Write a method to check whether the 3 points are collinear
 *    using the area of triangle formula.
 *
 *    Area = 0.5 * (x1 * (y2 - y3)
 *                 + x2 * (y3 - y1)
 *                 + x3 * (y1 - y2))
 *
 *    The three points are collinear if the area of the triangle is 0.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level3;

import java.util.Scanner;

public class CollinearPoints {

    // Check whether three points are collinear using slope formula
    public static boolean areCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Check whether three points are collinear using area formula
    public static boolean areCollinearUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3)
                        + x2 * (y3 - y1)
                        + x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take coordinates of first point
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Take coordinates of second point
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Take coordinates of third point
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Check collinearity using slope method
        boolean collinearUsingSlope = areCollinearUsingSlope(
                x1, y1, x2, y2, x3, y3
        );

        // Check collinearity using area method
        boolean collinearUsingArea = areCollinearUsingArea(
                x1, y1, x2, y2, x3, y3
        );

        // Display results
        System.out.println("\nUsing Slope Formula:");
        System.out.println("Are the points collinear? " + collinearUsingSlope);

        System.out.println("\nUsing Area Formula:");
        System.out.println("Are the points collinear? " + collinearUsingArea);

        input.close();
    }
}