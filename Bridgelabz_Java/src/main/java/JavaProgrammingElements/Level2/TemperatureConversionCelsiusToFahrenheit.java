/*
 * Problem 4 - GCR Control Flow Level 2
 * Write a TemperatureConversion program, given the temperature
 * in Celsius as input outputs the temperature in Fahrenheit.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class TemperatureConversionCelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " Celsius is "
                + fahrenheitResult + " Fahrenheit");
    }
}