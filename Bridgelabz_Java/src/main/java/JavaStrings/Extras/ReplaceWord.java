/*
 * Program to replace a given word with another word in a sentence
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class ReplaceWord {

    // Replace a given word with another word
    public static String replaceWord(String sentence,
                                     String oldWord,
                                     String newWord) {

        String result = "";
        int i = 0;

        while (i < sentence.length()) {

            boolean match = true;

            if (i + oldWord.length() <= sentence.length()) {

                for (int j = 0; j < oldWord.length(); j++) {

                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {
                        match = false;
                        break;
                    }
                }

            } else {
                match = false;
            }

            if (match) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();

        System.out.print("Enter new word: ");
        String newWord = input.nextLine();

        String result = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified String: " + result);

        input.close();
    }
}