/*
 * Problem 8 - GCR Programming Elements Level 1
 * Create a program to convert distance in kilometers to miles.
 *
 * Hint =>
 * a. Create a variable km and assign type as double.
 * b. Create Scanner Object to take user input from Keyboard.
 * c. Use Scanner Object to take user input for km.
 * d. Use 1 mile = 1.6 km formula to calculate miles.
 *
 * I/P => km
 * O/P => The total miles is ___ mile for the given ___ km
 *
 * Author: Ashish Srivastava
 * Date: 21-09-2026
 */

package JavaProgrammingElements.Level1;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles +
                " mile for the given " + km + " km");
    }
}