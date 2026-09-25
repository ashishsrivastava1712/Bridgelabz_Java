/*
 * Program to create a substring from a String using charAt()
 * and compare it with the substring created using the
 * built-in substring() method.
 *
 * Hint =>
 * 1. Take user input for String, start index and end index.
 * 2. Create substring using charAt().
 * 3. Compare two strings using charAt().
 * 4. Use built-in substring() method.
 * 5. Display the results.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class StringSubstring {

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
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

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        // Validate indexes
        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid index.");
            input.close();
            return;
        }

        // Create substring using charAt()
        String userDefinedSubstring =
                createSubstring(text, start, end);

        // Create substring using built-in substring()
        String builtInSubstring =
                text.substring(start, end);

        // Compare both substrings
        boolean result =
                compareStrings(userDefinedSubstring, builtInSubstring);

        // Display results
        System.out.println("Substring using charAt(): "
                + userDefinedSubstring);

        System.out.println("Substring using substring(): "
                + builtInSubstring);

        System.out.println("Both results are same: " + result);

        input.close();
    }
}