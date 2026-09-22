/*
 * Problem 12 - GCR Control Flow Level 1
 * Write a program to find the distance in yards and miles
 * for the distance provided by user in feet.
 *
 * Hint =>
 * 1 mile = 1760 yards
 * 1 yard = 3 feet
 *
 * I/P => distanceInFeet
 * O/P => The distance in yards is ___ and in miles is ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards
                + " and in miles is " + distanceInMiles);
    }
}