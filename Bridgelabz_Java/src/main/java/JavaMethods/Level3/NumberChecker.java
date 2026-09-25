/*
 * Create a program to check whether a number is a Duck Number or Armstrong Number
 * and find the largest, second largest, smallest, and second smallest digits.
 *
 * Hint =>
 * 1. Write a method to count the number of digits in the given number.
 * 2. Write a method to store the digits of the number in an array.
 * 3. Write a method to check whether the number is a Duck Number.
 * 4. Write a method to check whether the number is an Armstrong Number.
 * 5. Write a method to find the largest and second largest digits.
 * 6. Write a method to find the smallest and second smallest digits.
 * 7. Finally display the results.
 *
 * Author: Ashish Srivastava
 */



package JavaMethods.Level3;

import java.util.Scanner;

public class NumberChecker {

    // Find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    // Store the digits of the number in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        return digits;
    }

    // Check if the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    // Check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int numberOfDigits = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, numberOfDigits);
        }

        return sum == number;
    }

    // Find largest and second largest elements
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Find smallest and second smallest elements
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the number
        if (number < 0) {
            System.err.println("Invalid Number.");
            input.close();
            return;
        }

        // Find the count of digits
        int count = countDigits(number);

        // Store digits in an array
        int[] digits = getDigits(number, count);

        // Check Duck Number
        boolean duckNumber = isDuckNumber(digits);

        // Check Armstrong Number
        boolean armstrongNumber = isArmstrongNumber(number, digits);

        // Find largest and second largest
        int[] largestValues = findLargestAndSecondLargest(digits);

        // Find smallest and second smallest
        int[] smallestValues = findSmallestAndSecondSmallest(digits);

        // Display results
        System.out.println("Number of Digits: " + count);
        System.out.println("Duck Number: " + duckNumber);
        System.out.println("Armstrong Number: " + armstrongNumber);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);

        input.close();
    }
}