/*
 * Problem 5 - GCR Java Programming Elements Level 2
 * Write a TemperatureConversion program, given the temperature
 * in Fahrenheit as input outputs the temperature in Celsius.
 *
 * I/P => fahrenheit
 * O/P => The ____ fahrenheit is _____ celsius
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class TemperatureConversionFahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsiusResult + " celsius");
    }
}