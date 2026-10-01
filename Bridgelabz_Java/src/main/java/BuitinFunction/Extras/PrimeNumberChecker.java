/*
 * Author: Ashish Srivastava
 * Problem Description: Create a program that checks whether a given number
 * is a prime number. Use a separate function to perform the prime check
 * and return the result.
 * Program: Prime Number Checker
 */

import java.util.Scanner;

class PrimeNumberChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}