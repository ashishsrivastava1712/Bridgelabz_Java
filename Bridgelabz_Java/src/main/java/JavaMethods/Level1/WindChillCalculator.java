/*
 * Problem 11 - Wind Chill Temperature
 *
 * Write a program to calculate the wind chill temperature
 * given the temperature and wind speed.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class WindChillCalculator {

    // Calculate the wind chill temperature
    public double calculateWindChill(
            double temperature, double windSpeed) {

        double windChill =
                35.74
                        + (0.6215 * temperature)
                        + ((0.4275 * temperature) - 35.75)
                        * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for temperature
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        // Take input for wind speed
        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();

        // Validate the user input
        if (windSpeed < 0) {
            System.err.println("Invalid Wind Speed.");
            System.exit(0);
        }

        // Create object of WindChillCalculator class
        WindChillCalculator calculator =
                new WindChillCalculator();

        // Calculate wind chill
        double windChill =
                calculator.calculateWindChill(
                        temperature, windSpeed
                );

        // Display the result
        System.out.println("Wind Chill Temperature: " + windChill);

        // Close the Scanner Object
        input.close();
    }
}