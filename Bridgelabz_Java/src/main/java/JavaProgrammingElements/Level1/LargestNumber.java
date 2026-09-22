/*
 * Problem 3 - GCR Control Flow Level 1
 * Write a program to check if the first, second, or third number is the largest of the three.
 * I/P => number1, number2, number3
 * O/P =>
 * Is the first number the largest? ____
 * Is the second number the largest? ___
 * Is the third number the largest? ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        System.out.println("Is the first number the largest? "
                + (number1 >= number2 && number1 >= number3));

        System.out.println("Is the second number the largest? "
                + (number2 >= number1 && number2 >= number3));

        System.out.println("Is the third number the largest? "
                + (number3 >= number1 && number3 >= number2));
    }
}