/*
 * Program to find the first non-repeating character in a string
 * and display the result.
 *
 * Hint =>
 * 1. A non-repeating character occurs only once in the string.
 * 2. Create an array to store the frequency of characters.
 * 3. Use ASCII values as indexes in the frequency array.
 * 4. Loop through the text to find the frequency of characters.
 * 5. Loop through the text again to find the first character
 *    whose frequency is 1.
 * 6. Finally, display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Find the frequency of each character
    public static int[] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        return frequency;
    }

    // Find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {

        int[] frequency = findFrequency(text);

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (frequency[character] == 1) {
                return character;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Display result
        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        input.close();
    }
}