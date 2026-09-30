/*
 * Program to find the most frequent character in a string
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class MostFrequentCharacter {

    // Find the most frequent character
    public static char findMostFrequentCharacter(String text) {

        char mostFrequent = text.charAt(0);
        int maximumCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(j) == current) {
                    count++;
                }
            }

            if (count > maximumCount) {
                maximumCount = count;
                mostFrequent = current;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char result = findMostFrequentCharacter(text);

        System.out.println("Most Frequent Character: '" + result + "'");

        input.close();
    }
}