/*
 * Author: Ashish Srivastava
 * Problem Description: Create a program that calculates the Greatest Common
 * Divisor (GCD) and Least Common Multiple (LCM) of two numbers using
 * separate functions.
 * Program: GCD and LCM Calculator
 */

import java.util.Scanner;

class GCDLCMCalculator {

    // Method to calculate GCD
    public static int calculateGCD(int first, int second) {

        while (second != 0) {

            int remainder = first % second;
            first = second;
            second = remainder;
        }

        return first;
    }

    // Method to calculate LCM
    public static int calculateLCM(int first, int second) {

        int gcd = calculateGCD(first, second);

        return Math.abs(first * second) / gcd;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int gcd = calculateGCD(first, second);
        int lcm = calculateLCM(first, second);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        input.close();
    }
}