/*
 * Program to check if a text is palindrome using three different
 * logics and display the result.
 *
 * Hint =>
 * 1. Logic 1: Compare characters from the start and end indexes.
 * 2. Logic 2: Use recursion to compare characters from start and end.
 * 3. Logic 3: Reverse the string using charAt(), create character
 *    arrays, and compare the original and reverse arrays.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class StringPalindrome {

    // Logic 1: Check palindrome using loop
    public static boolean isPalindromeUsingLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Check palindrome using recursion
    public static boolean isPalindromeUsingRecursion(
            String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeUsingRecursion(
                text, start + 1, end - 1);
    }

    // Reverse string using charAt()
    public static char[] reverseString(String text) {

        char[] reversed = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        return reversed;
    }

    // Compare two character arrays
    public static boolean compareArrays(
            char[] firstArray, char[] secondArray) {

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

    // Logic 3: Check palindrome using character arrays
    public static boolean isPalindromeUsingArrays(String text) {

        char[] originalArray = text.toCharArray();
        char[] reverseArray = reverseString(text);

        return compareArrays(originalArray, reverseArray);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Palindrome check using three logics
        boolean resultUsingLoop =
                isPalindromeUsingLoop(text);

        boolean resultUsingRecursion =
                isPalindromeUsingRecursion(
                        text, 0, text.length() - 1);

        boolean resultUsingArrays =
                isPalindromeUsingArrays(text);

        // Display results
        System.out.println(
                "Palindrome using Loop: " + resultUsingLoop);

        System.out.println(
                "Palindrome using Recursion: "
                        + resultUsingRecursion);

        System.out.println(
                "Palindrome using Character Arrays: "
                        + resultUsingArrays);

        input.close();
    }
}