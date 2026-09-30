/*
 * Program to count the number of occurrences of a substring in a string
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class SubstringOccurrences {

    // Count substring occurrences
    public static int countOccurrences(String text, String substring) {

        int count = 0;

        if (substring.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= text.length() - substring.length(); i++) {

            boolean match = true;

            for (int j = 0; j < substring.length(); j++) {

                if (text.charAt(i + j) != substring.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.print("Enter substring to find: ");
        String substring = input.nextLine();

        int count = countOccurrences(text, substring);

        System.out.println("Occurrences: " + count);

        input.close();
    }
}