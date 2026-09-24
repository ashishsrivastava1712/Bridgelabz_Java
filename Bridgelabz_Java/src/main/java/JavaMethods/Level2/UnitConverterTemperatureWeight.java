/*
 * Problem 6 - Unit Converter
 *
 * Extend/Create a UnitConvertor utility class with static methods
 * for temperature, weight, and volume conversions.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

public class UnitConverterTemperatureWeight {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {

        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;

        return fahrenheitToCelsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {

        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;

        return celsiusToFahrenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {

        double poundsToKilograms = 0.453592;

        return pounds * poundsToKilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {

        double kilogramsToPounds = 2.20462;

        return kilograms * kilogramsToPounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {

        double gallonsToLiters = 3.78541;

        return gallons * gallonsToLiters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {

        double litersToGallons = 0.264172;

        return liters * litersToGallons;
    }

    public static void main(String[] args) {

        // Test temperature conversions
        System.out.println("100 Fahrenheit to Celsius: "
                + convertFahrenheitToCelsius(100));

        System.out.println("100 Celsius to Fahrenheit: "
                + convertCelsiusToFahrenheit(100));

        // Test weight conversions
        System.out.println("100 Pounds to Kilograms: "
                + convertPoundsToKilograms(100));

        System.out.println("100 Kilograms to Pounds: "
                + convertKilogramsToPounds(100));

        // Test volume conversions
        System.out.println("100 Gallons to Liters: "
                + convertGallonsToLiters(100));

        System.out.println("100 Liters to Gallons: "
                + convertLitersToGallons(100));
    }
}