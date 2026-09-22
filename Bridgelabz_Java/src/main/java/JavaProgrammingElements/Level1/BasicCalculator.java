/*
 * Problem 11 - Java Programming Elements Level 1
 * Write a program to create a basic calculator that can perform
 * addition, subtraction, multiplication, and division.
 *
 * I/P => number1, number2
 * O/P => The addition, subtraction, multiplication and division
 * value of 2 numbers ___ and ___ is ___, ____, ____, and ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division "
                + "value of 2 numbers " + number1 + " and " + number2
                + " is " + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);
    }
}