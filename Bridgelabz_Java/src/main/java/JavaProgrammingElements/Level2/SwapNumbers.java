/*
 * Problem 7 - GCR Java Programming Elements Level 2
 * Create a program to swap two numbers.
 *
 * I/P => number1, number2
 * O/P => The swapped numbers are ___ and ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}