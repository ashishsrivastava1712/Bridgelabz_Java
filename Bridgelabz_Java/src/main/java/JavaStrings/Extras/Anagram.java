/*
 * Program to check whether two strings are anagrams
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class Anagram {

    // Find frequency of characters
    public static int[] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        return frequency;
    }

    // Check whether two strings are anagrams
    public static boolean areAnagrams(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        int[] firstFrequency = findFrequency(first);
        int[] secondFrequency = findFrequency(second);

        for (int i = 0; i < 256; i++) {

            if (firstFrequency[i] != secondFrequency[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String first = input.nextLine();

        System.out.print("Enter String 2: ");
        String second = input.nextLine();

        boolean result = areAnagrams(first, second);

        System.out.println("Are Anagrams: " + result);

        input.close();
    }
}