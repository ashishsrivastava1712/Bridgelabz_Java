/*
 * Program to split the text into words, compare the result
 * with the built-in split() method, and display the result.
 *
 * Hint =>
 * 1. Take user input using Scanner nextLine().
 * 2. Create a method to find the length without using length().
 * 3. Create a method to split text into words using charAt().
 * 4. Create a method to compare two String arrays.
 * 5. Compare the user-defined split() with built-in split().
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class StringSplit {

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

        // Store positions of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        // Create array to store words
        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < wordCount; i++) {

            int end;

            if (i < spaceIndexes.length) {
                end = spaceIndexes[i];
            } else {
                end = length;
            }

            String word = "";

            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] first, String[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Split using user-defined method
        String[] userDefinedWords = splitText(text);

        // Split using built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare both arrays
        boolean result = compareArrays(
                userDefinedWords,
                builtInWords
        );

        // Display user-defined words
        System.out.println("Words using charAt():");

        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        // Display built-in words
        System.out.println("\nWords using split():");

        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nBoth results are same: " + result);

        input.close();
    }
}