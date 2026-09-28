/*
 * Program to find the frequency of characters in a string
 * using unique characters and display the result.
 *
 * Hint =>
 * 1. Create a method to find unique characters in a string
 *    using the charAt() method and nested loops.
 * 2. Create a method to find the frequency of characters
 *    using an ASCII frequency array.
 * 3. Call the uniqueCharacters() method to find unique characters.
 * 4. Create a 2D String array to store the unique characters
 *    and their frequencies.
 * 5. Finally display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Find unique characters using charAt() and nested loops
    public static char[] findUniqueCharacters(String text) {

        char[] uniqueCharacters = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char currentCharacter = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {

                if (text.charAt(j) == currentCharacter) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCharacters[uniqueCount] = currentCharacter;
                uniqueCount++;
            }
        }

        // Create array of exact size
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }

        return result;
    }

    // Find frequency of characters
    public static int[] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        return frequency;
    }

    // Create 2D array containing characters and frequencies
    public static String[][] createResult(String text) {

        char[] uniqueCharacters = findUniqueCharacters(text);
        int[] frequency = findFrequency(text);

        String[][] result = new String[uniqueCharacters.length][2];

        for (int i = 0; i < uniqueCharacters.length; i++) {

            result[i][0] = String.valueOf(uniqueCharacters[i]);
            result[i][1] = String.valueOf(
                    frequency[uniqueCharacters[i]]
            );
        }

        return result;
    }

    // Display character frequencies
    public static void displayResult(String[][] result) {

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Create character frequency result
        String[][] result = createResult(text);

        // Display result
        displayResult(result);

        input.close();
    }
}