/*
 * Problem 3 - GCR Control Flow Level 2
 * Write a DoubleOpt program by taking double values and doing
 * the same operations as IntOperation.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        double operation1 = a + b * c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;

        System.out.println("The results of Double Operations are "
                + operation1 + ", "
                + operation2 + ", "
                + operation3 + ", and "
                + operation4);
    }
}