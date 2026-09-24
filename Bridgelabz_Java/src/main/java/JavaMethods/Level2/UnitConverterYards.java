/*
 * Problem 5 - Unit Converter
 *
 * Create a UnitConverter utility class with static methods
 * for different unit conversions.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

public class UnitConverterYards {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCentimeters = 2.54;
        return inches * inchesToCentimeters;
    }

    public static void main(String[] args) {

        // Test unit conversions
        System.out.println("10 Yards to Feet: " + convertYardsToFeet(10));
        System.out.println("10 Feet to Yards: " + convertFeetToYards(10));
        System.out.println("10 Meters to Inches: " + convertMetersToInches(10));
        System.out.println("10 Inches to Meters: " + convertInchesToMeters(10));
        System.out.println("10 Inches to Centimeters: " + convertInchesToCentimeters(10));
    }
}