/*
 * Program to find the frequency of characters in a string
 * using nested loops and display the result.
 *
 * Hint =>
 * 1. Create an array to store the frequency of each character
 *    and an array to store the characters using toCharArray().
 * 2. Use a nested loop with an outer loop for each character
 *    and an inner loop to check duplicate characters.
 * 3. Initialize the frequency of each character to 1.
 * 4. For duplicate characters, increment the frequency and
 *    set the duplicate character to '0'.
 * 5. Create a 1D String array to store the characters and
 *    their frequencies.
 * 6. Finally display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Find frequency of characters using nested loops
    public static String[] findCharacterFrequency(String text) {

        char[] characters = text.toCharArray();

        // Array to store frequency of each character
        int[] frequency = new int[characters.length];

        // Outer loop for each character
        for (int i = 0; i < characters.length; i++) {

            // Skip duplicate characters
            if (characters[i] == '0') {
                continue;
            }

            frequency[i] = 1;

            // Inner loop to find duplicates
            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create 1D String array
        String[] result = new String[uniqueCount];

        int index = 0;

        // Store character and frequency
        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {
                result[index] =
                        characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find character frequencies
        String[] result = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter Frequencies:");

        for (String value : result) {
            System.out.println(value);
        }

        input.close();
    }
}