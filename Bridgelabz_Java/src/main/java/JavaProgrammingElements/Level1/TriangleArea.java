/*
 * Problem 10 - GCR Control Flow Level 1
 * Write a program that takes the base and height to find area of a triangle
 * in square inches and square centimeters.
 *
 * Hint => Area of a Triangle is 1/2 * base * height
 *
 * I/P => base, height
 * O/P => Area of triangle is ___ square centimeters
 *        and ___ square inches
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in centimeters: ");
        double base = input.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double height = input.nextDouble();

        double areaInCm = 0.5 * base * height;

        double areaInInches = areaInCm / (2.54 * 2.54);

        System.out.println("The area of triangle is " + areaInCm
                + " square centimeters and " + areaInInches
                + " square inches");
    }
}