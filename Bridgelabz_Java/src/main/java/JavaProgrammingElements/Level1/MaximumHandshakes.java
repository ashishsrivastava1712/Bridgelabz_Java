/*
 * Problem 16 - GCR Control Flow Level 1
 * Create a program to find the maximum number of handshakes
 * among N number of students.
 *
 * Hint =>
 * Get integer input for numberOfStudents variable.
 * Use the combination = (n * (n - 1)) / 2 formula to calculate
 * the maximum number of possible handshakes.
 *
 * I/P => numberOfStudents
 * O/P => The maximum number of handshakes is ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int maximumHandshakes =
                (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes is "
                + maximumHandshakes);
    }
}