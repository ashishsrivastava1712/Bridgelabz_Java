/*
 * Program to split the text into words and return the words
 * along with their lengths in a 2D array.
 *
 * Hint =>
 * 1. Take user input using Scanner nextLine().
 * 2. Split the text into words using charAt().
 * 3. Find the length of each word without using length().
 * 4. Create a 2D String array containing the word and its length.
 * 5. Display the result in a tabular format.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class StringWordLength {

    // Method to find string length without using length()
    public static int findStringLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // End of string reached
        }

        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {

        int length = findStringLength(text);
        int wordCount = 1;

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int wordIndex = 0;
        String word = "";

        // Extract each word using charAt()
        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        // Store the last word
        words[wordIndex] = word;

        return words;
    }

    // Method to create 2D array containing word and length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];

            int length = findStringLength(words[i]);

            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Create 2D array of words and their lengths
        String[][] result = createWordLengthArray(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {

            String word = result[i][0];

            int length = Integer.parseInt(result[i][1]);

            System.out.println(word + "\t" + length);
        }

        input.close();
    }
}