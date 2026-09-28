/*
 * Program to find the frequency of characters in a string
 * using the charAt() method and display the result.
 *
 * Hint =>
 * 1. Create a method to find the frequency of characters.
 * 2. Use an array of size 256 to store character frequencies.
 * 3. Use ASCII values as indexes in the frequency array.
 * 4. Create a 2D array to store characters and their frequencies.
 * 5. Finally display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Find frequency of each character using charAt()
    public static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        // Find frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count characters having frequency greater than zero
        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        // Create 2D array to store character and frequency
        String[][] result = new String[count][2];

        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
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
        String[][] result = findFrequency(text);

        // Display result
        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }

        input.close();
    }
}