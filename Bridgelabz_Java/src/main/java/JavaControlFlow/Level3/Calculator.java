/*
 * Problem 6 - Calculator Using Switch Case
 *
 * Write a program to create a calculator using switch...case.
 *
 * Hint =>
 * a. Create two double variables named first and second and a String variable named op.
 * b. Get input values for all variables.
 * c. The input for the operator can only be one of the four values: "+", "-", "*" or "/".
 * d. Run a for loop from i = 1 to i < number.
 * e. Based on the input value of the op, perform specific operations using the switch...case
 *    statement and print the result.
 * f. If op is +, perform addition between first and second; if it is -, perform subtraction and
 *    so on.
 * g. If op is neither of those 4 values, print Invalid Operator.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create variables for the two numbers and operator
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        // Perform the operation using switch case
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                System.out.println("Result: " + (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }

        // Close the Scanner
        input.close();
    }
}