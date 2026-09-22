/*
 * Problem 11 - GCR Control Flow Level 1
 * Write a program to find the side of the square whose perimeter
 * you read from user.
 *
 * Hint => Perimeter of Square is 4 times side
 *
 * I/P => perimeter
 * O/P => The length of the side is ___ whose perimeter is ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side
                + " whose perimeter is " + perimeter);
    }
}