/*
 * Problem 10 - Java Programming Elements Level 1
 * Write a program that takes your height in centimeters
 * and converts it into feet and inches.
 *
 * Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
 *
 * I/P => height
 * O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double height = input.nextDouble();

        double totalInches = height / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + height
                + " while in feet is " + feet
                + " and inches is " + inches);
    }
}