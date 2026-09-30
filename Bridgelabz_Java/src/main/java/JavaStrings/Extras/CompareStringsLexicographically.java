/*
 * Program to compare two strings lexicographically
 * without using built-in compare methods
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class CompareStringsLexicographically {

    // Compare two strings lexicographically
    public static int compareStrings(String first, String second) {

        int minimumLength;

        if (first.length() < second.length()) {
            minimumLength = first.length();
        } else {
            minimumLength = second.length();
        }

        for (int i = 0; i < minimumLength; i++) {

            char firstChar = first.charAt(i);
            char secondChar = second.charAt(i);

            if (firstChar < secondChar) {
                return -1;
            }

            if (firstChar > secondChar) {
                return 1;
            }
        }

        if (first.length() < second.length()) {
            return -1;
        }

        if (first.length() > second.length()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String first = input.nextLine();

        System.out.print("Enter String 2: ");
        String second = input.nextLine();

        int result = compareStrings(first, second);

        if (result < 0) {
            System.out.println("\"" + first + "\" comes before \"" +
                    second + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + first + "\" comes after \"" +
                    second + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }

        input.close();
    }
}