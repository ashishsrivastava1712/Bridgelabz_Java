/*
 * Problem 12 - GCR Java Programming Elements Level 2
 * Create a program to convert weight in pounds to kilograms.
 *
 * Hint => 1 pound = 2.2 kg
 *
 * I/P => weight
 * O/P => The weight of the person in pound is ___ and in kg is ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();

        double weightInKg = weight / 2.2;

        System.out.println("The weight of the person in pound is "
                + weight + " and in kg is " + weightInKg);
    }
}