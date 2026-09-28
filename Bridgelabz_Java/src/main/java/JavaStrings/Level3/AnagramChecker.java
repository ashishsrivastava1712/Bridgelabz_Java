/*
 * Program to check if two texts are anagrams and display the result.
 *
 * Hint =>
 * 1. Check if the lengths of the two texts are equal.
 * 2. Create arrays to store the frequency of characters
 *    in both texts.
 * 3. Find the frequency of characters in both texts using loops.
 * 4. Compare the frequency arrays.
 * 5. If the frequencies are equal, the texts are anagrams.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class AnagramChecker {

    // Check whether two texts are anagrams
    public static boolean areAnagrams(String firstText, String secondText) {

        // Check if lengths are equal
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Create frequency arrays
        int[] firstFrequency = new int[256];
        int[] secondFrequency = new int[256];

        // Find frequency of characters in first text
        for (int i = 0; i < firstText.length(); i++) {
            firstFrequency[firstText.charAt(i)]++;
        }

        // Find frequency of characters in second text
        for (int i = 0; i < secondText.length(); i++) {
            secondFrequency[secondText.charAt(i)]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {

            if (firstFrequency[i] != secondFrequency[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first text: ");
        String firstText = input.nextLine();

        System.out.print("Enter second text: ");
        String secondText = input.nextLine();

        // Check anagram
        boolean result = areAnagrams(firstText, secondText);

        // Display result
        System.out.println("Are the texts anagrams? " + result);

        input.close();
    }
}