/*
 * Program to return all characters in a String using a user-defined method
 * and compare the result with the built-in toCharArray() method.
 *
 * Hint =>
 * 1. Take user input for the String.
 * 2. Return characters using charAt() without using toCharArray().
 * 3. Compare the two character arrays.
 * 4. Display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class StringToCharacterArray {

    // Method to return characters using charAt()
    public static char[] getCharacters(String text) {

        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] first, char[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
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

        // User-defined method
        char[] userDefinedArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareArrays(userDefinedArray, builtInArray);

        // Display result
        System.out.print("Characters using user-defined method: ");
        for (char character : userDefinedArray) {
            System.out.print(character + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char character : builtInArray) {
            System.out.print(character + " ");
        }

        System.out.println();
        System.out.println("Both arrays are same: " + result);

        input.close();
    }
}