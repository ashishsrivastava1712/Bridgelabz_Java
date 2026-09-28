/*
 * Program to split the text into words and find the shortest
 * and longest strings in the given text.
 *
 * Hint =>
 * 1. Take user input using Scanner nextLine().
 * 2. Split the text into words using charAt().
 * 3. Find the length of each word without using length().
 * 4. Create a 2D array containing each word and its length.
 * 5. Find the shortest and longest string.
 * 6. Display the result.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class ShortestLongestWord {

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

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int wordIndex = 0;
        String word = "";

        // Extract words
        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        // Store last word
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

    // Method to find shortest and longest word
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength =
                Integer.parseInt(wordLengthArray[0][1]);

        int longestLength =
                Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {

            int currentLength =
                    Integer.parseInt(wordLengthArray[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Create 2D array containing words and lengths
        String[][] wordLengthArray =
                createWordLengthArray(words);

        // Find shortest and longest words
        int[] result =
                findShortestAndLongest(wordLengthArray);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        // Display results
        System.out.println("\nShortest Word: "
                + wordLengthArray[shortestIndex][0]);

        System.out.println("Shortest Word Length: "
                + wordLengthArray[shortestIndex][1]);

        System.out.println("Longest Word: "
                + wordLengthArray[longestIndex][0]);

        System.out.println("Longest Word Length: "
                + wordLengthArray[longestIndex][1]);

        input.close();
    }
}