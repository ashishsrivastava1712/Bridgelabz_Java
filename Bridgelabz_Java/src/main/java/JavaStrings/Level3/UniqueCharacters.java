/*
 * Program to find unique characters in a string using charAt()
 * method and display the result.
 *
 * Hint =>
 * 1. Create a method to find the length of the text without
 *    using the String method length().
 * 2. Create a method to find unique characters in a string
 *    using the charAt() method and return them as a 1D array.
 * 3. Use a nested loop to check whether each character is unique.
 * 4. Create a new array to store only the unique characters.
 * 5. Finally display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class UniqueCharacters {

    // Find the length of the string without using length()
    public static int findStringLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        return count;
    }

    // Find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        int length = findStringLength(text);

        // Array to temporarily store unique characters
        char[] unique = new char[length];
        int uniqueCount = 0;

        // Check each character
        for (int i = 0; i < length; i++) {

            char currentCharacter = text.charAt(i);
            boolean isUnique = true;

            // Compare with previous characters
            for (int j = 0; j < i; j++) {

                if (text.charAt(j) == currentCharacter) {
                    isUnique = false;
                    break;
                }
            }

            // Store character if it is unique
            if (isUnique) {
                unique[uniqueCount] = currentCharacter;
                uniqueCount++;
            }
        }

        // Create new array of exact size
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display result
        System.out.println("Unique Characters:");

        for (char character : uniqueCharacters) {
            System.out.print(character + " ");
        }

        input.close();
    }
}