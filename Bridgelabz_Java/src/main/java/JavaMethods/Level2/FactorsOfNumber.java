/*
 * Problem 1 - Factors of a Number
 *
 * Create a program to find the factors of a number taken as user input,
 * store the factors in an array and display the factors.
 * Also find the sum, sum of square of factors and product of the factors.
 *
 * Hint =>
 * a. Take the input for a number
 * b. Write a static method to find the factors and return the array
 * c. Use two loops: one to count factors and one to store factors
 * d. Write a method to find the sum of factors
 * e. Write a method to find the product of factors
 * f. Write a method to find the sum of square of factors using Math.pow()
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class FactorsOfNumber {

    // Find and return all factors of the given number
    public static int[] findFactors(int number) {

        // Count the number of factors
        int factorCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }

        // Create an array based on the number of factors
        int[] factors = new int[factorCount];

        // Store the factors in the array
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Find the sum of all factors
    public static int findFactorSum(int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    // Find the product of all factors
    public static long findFactorProduct(int[] factors) {

        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    // Find the sum of squares of all factors
    public static double findSumOfFactorSquares(int[] factors) {

        double sumOfSquares = 0;

        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }

        return sumOfSquares;
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the user input
        if (number <= 0) {
            System.err.println("Invalid Number. Please enter a positive number.");
            System.exit(0);
        }

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.println("Factors of " + number + ":");

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        // Find the sum of factors
        int sum = findFactorSum(factors);

        // Find the product of factors
        long product = findFactorProduct(factors);

        // Find the sum of squares of factors
        double sumOfSquares = findSumOfFactorSquares(factors);

        // Display the results
        System.out.println("\nSum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + sumOfSquares);

        // Close the Scanner Object
        input.close();
    }
}