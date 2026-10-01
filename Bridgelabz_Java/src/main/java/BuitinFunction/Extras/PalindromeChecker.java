/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that checks if a given string is a
 * palindrome. Break the program into functions for input, checking the
 * palindrome condition, and displaying the result.
 * Program: Palindrome Checker
 */

import java.util.Scanner;

class PalindromeChecker {

    // Method to take string input
    public static String getInput(Scanner input) {
        System.out.print("Enter a string: ");
        return input.nextLine();
    }

    // Method to check whether string is palindrome
    public static boolean isPalindrome(String text) {

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

    // Method to display result
    public static void displayResult(String text, boolean result) {

        if (result) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = getInput(input);

        boolean result = isPalindrome(text);

        displayResult(text, result);

        input.close();
    }
}