/*
 * Program to remove all occurrences of a specific character from a string
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Remove a specific character
    public static String removeCharacter(String text, char character) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != character) {
                result += text.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.print("Enter character to remove: ");
        char character = input.next().charAt(0);

        String result = removeCharacter(text, character);

        System.out.println("Modified String: " + result);

        input.close();
    }
}