/*
 * Problem 3 - Maximum Number of Handshakes Using Method
 *
 * Create a program to find the maximum number of handshakes
 * among N number of students.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class MaximumHandshakesMethod {

    // Calculate the maximum number of handshakes
    public int calculateMaximumHandshakes(int numberOfStudents) {
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate the user input
        if (numberOfStudents < 0) {
            System.err.println("Invalid Number of Students.");
            System.exit(0);
        }

        // Create object of MaximumHandshakesMethod class
        MaximumHandshakesMethod handshakes =
                new MaximumHandshakesMethod();

        // Calculate maximum handshakes
        int result =
                handshakes.calculateMaximumHandshakes(numberOfStudents);

        // Display the result
        System.out.println("Maximum Number of Handshakes: " + result);

        // Close the Scanner Object
        input.close();
    }
}