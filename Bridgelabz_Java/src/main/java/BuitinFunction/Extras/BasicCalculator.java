
/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that performs basic mathematical
 * operations such as addition, subtraction, multiplication, and division.
 * Each operation should be performed in its own function.
 * Program: Basic Calculator
 */

import java.util.Scanner;

class BasicCalculator {

    // Method to perform addition
    public static double add(double first, double second) {
        return first + second;
    }

    // Method to perform subtraction
    public static double subtract(double first, double second) {
        return first - second;
    }

    // Method to perform multiplication
    public static double multiply(double first, double second) {
        return first * second;
    }

    // Method to perform division
    public static double divide(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        double result = 0;

        switch (choice) {

            case 1:
                result = add(first, second);
                break;

            case 2:
                result = subtract(first, second);
                break;

            case 3:
                result = multiply(first, second);
                break;

            case 4:
                if (second != 0) {
                    result = divide(first, second);
                } else {
                    System.out.println("Cannot divide by zero");
                    input.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid choice");
                input.close();
                return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}