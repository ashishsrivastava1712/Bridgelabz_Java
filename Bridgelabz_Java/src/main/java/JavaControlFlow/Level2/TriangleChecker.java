/*
 * Problem 1 - Check Internal Angles of a Triangle
 *
 * Create a program to check if 3 values are internal angles of a triangle.
 *
 * IMP => Follow Good Programming Practice demonstrated in the program in all Practice Programs.
 *
 * Hint =>
 * a. Get integer input for 3 variables named x, y, and z.
 * b. Find the sum of x, y, and z.
 * c. If the sum is equal to 180, print "The given angles are internal angles of a
 *    triangle" else print "They are not".
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get 3 input values for angles
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // Find the sum of all angles
        int sumOfAngles = x + y + z;

        // Check if sum is equal to 180
        System.out.println(
                "The given angles " + x + ", " + y + ", " + z +
                        " add to " + sumOfAngles
        );

        if (sumOfAngles == 180) {
            System.out.println("The given angles are internal angles of a Triangle");
        } else {
            System.out.println("The given angles are not internal angles of a Triangle");
        }

        // Closing the Scanner Stream
        input.close();
    }
}