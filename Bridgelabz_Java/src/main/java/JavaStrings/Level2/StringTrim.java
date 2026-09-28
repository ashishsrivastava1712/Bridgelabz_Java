/*
 * Program to trim leading and trailing spaces from a String
 * using the charAt() method and compare the result with
 * the built-in trim() method.
 *
 * Hint =>
 * 1. Find the starting and ending points without spaces.
 * 2. Create a substring using charAt().
 * 3. Compare the two strings using charAt().
 * 4. Use the built-in trim() method and compare the results.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class StringTrim {

    // Method to find start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Find first non-space character
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter a text with leading/trailing spaces: ");
        String text = input.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(text);

        String userDefinedResult;

        // Handle a string containing only spaces
        if (indexes[0] > indexes[1]) {
            userDefinedResult = "";
        } else {
            userDefinedResult = createSubstring(
                    text,
                    indexes[0],
                    indexes[1]
            );
        }

        // Use built-in trim()
        String builtInResult = text.trim();

        // Compare both results
        boolean result = compareStrings(
                userDefinedResult,
                builtInResult
        );

        // Display results
        System.out.println("Using charAt(): [" + userDefinedResult + "]");
        System.out.println("Using trim(): [" + builtInResult + "]");
        System.out.println("Both results are same: " + result);

        input.close();
    }
}