/*
 * Problem 4 - Check Abundant Number
 *
 * Create a program to check if a number is an Abundant Number.
 *
 * Hint =>
 * a. An abundant number is an integer in which the sum of all the divisors of the number is
 *    greater than the number itself. For example,
 *    Divisor of 12: 1, 2, 3, 4, 6
 *    Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
 * b. Get an integer input for the number variable.
 * c. Create an integer variable sum with initial value 0.
 * d. Run a for loop from i = 1 to i < number.
 * e. Inside the loop, check if number is divisible by i.
 * f. If true, add i to sum.
 * g. Outside the loop Check if sum is greater than number.
 * h. If the sum is greater than the number, print Abundant Number. Otherwise, print Not an
 *    Abundant Number.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level3;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        int number = input.nextInt();

        // Create a sum variable with initial value 0
        int sum = 0;

        // Find all proper divisors of the number
        for (int i = 1; i < number; i++) {

            // Check if the number is divisible by i
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        // Close the Scanner
        input.close();
    }
}