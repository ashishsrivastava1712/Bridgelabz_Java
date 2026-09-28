/*
 * Program to find vowels and consonants in a string
 * and display the count of vowels and consonants.
 *
 * Hint =>
 * 1. Create a method to check if a character is a vowel,
 *    consonant, or not a letter.
 * 2. Convert uppercase letters to lowercase using ASCII values.
 * 3. Find vowels and consonants using charAt().
 * 4. Return the count of vowels and consonants in an array.
 * 5. Display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check character type
    public static String checkCharacterType(char character) {

        // Convert uppercase to lowercase using ASCII value
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

    // Method to find vowel and consonant count
    public static int[] findVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            String type = checkCharacterType(text.charAt(i));

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Find vowels and consonants
        int[] result = findVowelsAndConsonants(text);

        // Display results
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        input.close();
    }
}