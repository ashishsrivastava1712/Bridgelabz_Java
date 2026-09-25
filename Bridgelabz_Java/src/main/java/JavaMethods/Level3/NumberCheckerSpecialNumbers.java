/*
 * Create a program to check whether a number is a Prime, Neon, Spy,
 * Automorphic, or Buzz Number.
 *
 * Hint =>
 * 1. Write a method to check whether the given number is a Prime Number.
 * 2. Write a method to find the sum of digits of the number.
 * 3. Write a method to find the product of digits of the number.
 * 4. Write a method to check whether the number is a Neon Number.
 * 5. Write a method to check whether the number is a Spy Number.
 * 6. Write a method to check whether the number is an Automorphic Number.
 * 7. Write a method to check whether the number is a Buzz Number.
 * 8. Finally display the results.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheckerSpecialNumbers {

    // Check if the number is a prime number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Find the sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }

    // Find the product of digits
    public static int productOfDigits(int number) {
        int product = 1;
        int temp = number;

        while (temp > 0) {
            product *= temp % 10;
            temp /= 10;
        }

        return product;
    }

    // Check if the number is a Neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = sumOfDigits(square);

        return sum == number;
    }

    // Check if the number is a Spy number
    public static boolean isSpyNumber(int number) {
        int sum = sumOfDigits(number);
        int product = productOfDigits(number);

        return sum == product;
    }

    // Check if the number is an Automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }

            square /= 10;
            temp /= 10;
        }

        return true;
    }

    // Check if the number is a Buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid Number.");
            input.close();
            return;
        }

        System.out.println("Prime Number: " + isPrimeNumber(number));
        System.out.println("Neon Number: " + isNeonNumber(number));
        System.out.println("Spy Number: " + isSpyNumber(number));
        System.out.println("Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Buzz Number: " + isBuzzNumber(number));

        input.close();
    }
}