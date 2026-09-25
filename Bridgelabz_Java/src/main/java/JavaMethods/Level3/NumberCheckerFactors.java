/*
 * Create a program to find the factors of a number and use the factors
 * to determine various properties of the number.
 *
 * Hint =>
 * 1. Write a method to find all factors of a number and store them in an array.
 * 2. Write a method to find the greatest factor of the number.
 * 3. Write a method to find the sum of all factors.
 * 4. Write a method to find the product of all factors.
 * 5. Write a method to find the product of cubes of all factors.
 * 6. Write methods to check whether the number is Perfect, Abundant,
 *    or Deficient.
 * 7. Write a method to check whether the number is a Strong Number.
 * 8. Finally display all the results.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheckerFactors {

    // Find all factors of a number
    public static int[] findFactors(int number) {

        // First loop to count factors
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array according to factor count
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = factors[0];

        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }

        return greatestFactor;
    }

    // Find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Find product of cubes of factors
    public static long findProductOfCubesOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= (long) Math.pow(factor, 3);
        }

        return product;
    }

    // Check if number is a perfect number
    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return sum == number;
    }

    // Check if number is an abundant number
    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return sum > number;
    }

    // Check if number is a deficient number
    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return sum < number;
    }

    // Find factorial of a number
    public static long findFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Check if number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        long sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += findFactorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid Number.");
            input.close();
            return;
        }

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);

        // Find sum of factors
        int sumOfFactors = findSumOfFactors(factors);

        // Find product of factors
        long productOfFactors = findProductOfFactors(factors);

        // Find product of cubes
        long productOfCubes = findProductOfCubesOfFactors(factors);

        // Check special numbers
        boolean perfectNumber = isPerfectNumber(number, factors);
        boolean abundantNumber = isAbundantNumber(number, factors);
        boolean deficientNumber = isDeficientNumber(number, factors);
        boolean strongNumber = isStrongNumber(number);

        // Display results
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);
        System.out.println("Perfect Number: " + perfectNumber);
        System.out.println("Abundant Number: " + abundantNumber);
        System.out.println("Deficient Number: " + deficientNumber);
        System.out.println("Strong Number: " + strongNumber);

        input.close();
    }
}