/*
 * Problem 4 - Unit Converter
 *
 * Create a UnitConverter utility class with static methods
 * to convert between different units.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class UnitConverter {

    // Convert kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // Convert miles to kilometers
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // Convert meters to feet
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Convert feet to meters
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Convert kilometers to miles
        double miles = kilometersToMiles(kilometers);
        System.out.println("Miles: " + miles);

        // Take input for miles
        System.out.print("Enter distance in miles: ");
        miles = input.nextDouble();

        // Convert miles to kilometers
        kilometers = milesToKilometers(miles);
        System.out.println("Kilometers: " + kilometers);

        // Take input for meters
        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();

        // Convert meters to feet
        double feet = metersToFeet(meters);
        System.out.println("Feet: " + feet);

        // Take input for feet
        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        // Convert feet to meters
        meters = feetToMeters(feet);
        System.out.println("Meters: " + meters);

        // Close Scanner Object
        input.close();
    }
}