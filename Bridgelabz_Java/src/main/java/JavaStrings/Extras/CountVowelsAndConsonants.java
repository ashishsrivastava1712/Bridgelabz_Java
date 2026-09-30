/*
 * Program to count the number of vowels and consonants in a string
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    // Count vowels in the string
    public static int countVowels(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }

    // Count consonants in the string
    public static int countConsonants(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {

                if (!(ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U')) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int vowels = countVowels(text);
        int consonants = countConsonants(text);

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        input.close();
    }
}