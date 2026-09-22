/*
 * Problem 4 - Check Prime Number
 *
 * Write a Program to check if the given number is a prime number or not.
 *
 * Hint =>
 * a. A number that can be divided exactly only by itself and 1 are Prime Numbers.
 * b. Prime Numbers checks are done for numbers greater than 1.
 * c. Loop through all the numbers from 2 to the user input number and check if the reminder
 *    is zero. If the reminder is zero break out from the loop as the number is divisible by
 *    some other number and is not a prime number.
 * d. Use isPrime boolean variable to store the result.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        int number = input.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {

            // Check divisibility from 2 to the number
            for (int divisor = 2; divisor < number; divisor++) {

                // If the number is divisible by another number, it is not prime
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Close the Scanner
        input.close();
    }
}