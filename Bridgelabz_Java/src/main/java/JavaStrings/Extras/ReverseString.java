/*
 * Program to reverse a string without using built-in reverse functions
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class ReverseString {

    // Reverse the string
    public static String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reversed = reverseString(text);

        System.out.println("Reversed String: " + reversed);

        input.close();
    }
}