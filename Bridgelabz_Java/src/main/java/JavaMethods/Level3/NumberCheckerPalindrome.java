/*
 * Create a program to check whether a number is a Palindrome or Duck Number
 * using an array of digits.
 *
 * Hint =>
 * 1. Write a method to count the number of digits in the given number.
 * 2. Write a method to store the digits of the number in an array.
 * 3. Write a method to reverse the digits array.
 * 4. Write a method to compare two arrays.
 * 5. Write a method to check whether the number is a Palindrome Number.
 * 6. Write a method to check whether the number is a Duck Number.
 * 7. Finally display the results.
 *
 * Author: Ashish Srivastava
 */



package JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheckerPalindrome {

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

    // Reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversedDigits = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }

        return reversedDigits;
    }

    // Compare two arrays
    public static boolean compareArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }

        return true;
    }

    // Check if the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseArray(digits);

        return compareArrays(digits, reversedDigits);
    }

    // Check if the number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }

        return false;
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

        // Reverse the digits array
        int[] reversedDigits = reverseArray(digits);

        // Compare original and reversed arrays
        boolean arraysEqual = compareArrays(digits, reversedDigits);

        // Check palindrome
        boolean palindrome = isPalindrome(digits);

        // Check duck number
        boolean duckNumber = isDuckNumber(digits);

        // Display results
        System.out.println("Number of Digits: " + count);
        System.out.println("Original Array and Reversed Array Equal: " + arraysEqual);
        System.out.println("Palindrome Number: " + palindrome);
        System.out.println("Duck Number: " + duckNumber);

        input.close();
    }
}