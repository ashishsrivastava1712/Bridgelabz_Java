/*
 * Program to convert the complete text to lowercase using charAt()
 * and compare the result with the built-in toLowerCase() method.
 *
 * Hint =>
 * 1. Take complete text as input using nextLine().
 * 2. Convert each uppercase character to lowercase using charAt().
 * 3. Compare both strings using charAt().
 * 4. Use the built-in toLowerCase() method.
 * 5. Display the results.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class StringToLowerCase {

    // Method to convert text to lowercase using charAt()
    public static String convertToLowerCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            // Convert uppercase character to lowercase
            if (character >= 'A' && character <= 'Z') {
                character = (char) (character + 32);
            }

            result += character;
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
        System.out.print("Enter complete text: ");
        String text = input.nextLine();

        // Convert using user-defined method
        String userDefinedResult = convertToLowerCase(text);

        // Convert using built-in method
        String builtInResult = text.toLowerCase();

        // Compare both results
        boolean result = compareStrings(
                userDefinedResult,
                builtInResult
        );

        // Display results
        System.out.println("Using charAt(): " + userDefinedResult);
        System.out.println("Using toLowerCase(): " + builtInResult);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}