/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that converts temperatures between
 * Fahrenheit and Celsius. Use separate functions for converting Fahrenheit
 * to Celsius and Celsius to Fahrenheit.
 * Program: Temperature Converter
 */

import java.util.Scanner;

class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        if (choice == 1) {

            double result = fahrenheitToCelsius(temperature);

            System.out.println("Temperature in Celsius: " + result);

        } else if (choice == 2) {

            double result = celsiusToFahrenheit(temperature);

            System.out.println("Temperature in Fahrenheit: " + result);

        } else {

            System.out.println("Invalid choice");
        }

        input.close();
    }
}