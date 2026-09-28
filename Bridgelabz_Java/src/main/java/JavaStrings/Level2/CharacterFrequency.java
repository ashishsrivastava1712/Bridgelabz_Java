/*
 * Program to find the frequency of each character in a string.
 *
 * Hint =>
 * 1. Take user input using Scanner nextLine().
 * 2. Create a method to find unique characters.
 * 3. Create a method to find the frequency of each character.
 * 4. Create a 2D array containing character and frequency.
 * 5. Display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find unique characters
    public static char[] uniqueCharacters(String text) {

        int[] frequency = new int[256];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (frequency[character] == 0) {
                frequency[character] = 1;
                uniqueCount++;
            }
        }

        char[] unique = new char[uniqueCount];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (frequency[character] == 1) {
                unique[index] = character;
                frequency[character] = 2;
                index++;
            }
        }

        return unique;
    }

    // Method to find frequency of each character
    public static int[] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        return frequency;
    }

    // Method to create 2D result array
    public static String[][] createResult(String text) {

        char[] unique = uniqueCharacters(text);
        int[] frequency = findFrequency(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }

        return result;
    }

    // Method to display character frequencies
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
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Create character frequency result
        String[][] result = createResult(text);

        // Display result
        displayResult(result);

        input.close();
    }
}