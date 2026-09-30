/*
 * Program to remove duplicate characters from a string
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class RemoveDuplicates {

    // Remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String result = removeDuplicates(text);

        System.out.println("String after removing duplicates: " + result);

        input.close();
    }
}