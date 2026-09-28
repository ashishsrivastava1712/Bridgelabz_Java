/*
 * Program to find vowels and consonants in a string
 * and display the character type - Vowel, Consonant,
 * or Not a Letter.
 *
 * Hint =>
 * 1. Create a method to check if a character is a vowel,
 *    consonant, or not a letter.
 * 2. Convert uppercase letters to lowercase using ASCII values.
 * 3. Find the character type using charAt().
 * 4. Return the character and its type in a 2D array.
 * 5. Display the 2D array in tabular format.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class VowelConsonantType {

    // Method to check character type
    public static String checkCharacterType(char character) {

        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        if (character >= 'a' && character <= 'z') {

            if (character == 'a' ||
                    character == 'e' ||
                    character == 'i' ||
                    character == 'o' ||
                    character == 'u') {
                return "Vowel";
            }

            return "Consonant";
        }

        return "Not a Letter";
    }

    // Method to create 2D array of character and type
    public static String[][] findCharacterTypes(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            result[i][0] = String.valueOf(character);
            result[i][1] = checkCharacterType(character);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] result) {

        System.out.println("\nCharacter\tType");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Find character types
        String[][] result = findCharacterTypes(text);

        // Display result
        displayTable(result);

        input.close();
    }
}