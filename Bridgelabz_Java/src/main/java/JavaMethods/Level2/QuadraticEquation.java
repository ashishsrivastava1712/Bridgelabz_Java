/*
 * Problem 11 - Quadratic Equation
 *
 * Find the roots of a quadratic equation ax^2 + bx + c.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class QuadraticEquation {

    // Find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate the discriminant
        double delta = Math.pow(b, 2) - (4 * a * c);

        // If delta is negative, there are no real roots
        if (delta < 0) {
            return new double[0];
        }

        // If delta is zero, there is one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is positive, there are two roots
        double squareRoot = Math.sqrt(delta);

        double root1 = (-b + squareRoot) / (2 * a);
        double root2 = (-b - squareRoot) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for a, b and c
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Validate coefficient a
        if (a == 0) {
            System.out.println("Invalid quadratic equation.");
            input.close();
            return;
        }

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        // Close Scanner Object
        input.close();
    }
}