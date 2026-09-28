/*
 * Program to find and return the length of a string
 * without using the built-in length() method.
 *
 * Hint =>
 * 1. Take user input using Scanner next() method.
 * 2. Create a method to find the length without using length().
 * 3. Use an infinite loop and charAt().
 * 4. Handle the exception when charAt() goes beyond the string.
 * 5. Compare the user-defined length with the built-in length().
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class StringLength {

    // Method to find string length without using length()
    public static int findStringLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // Exception occurs when index goes beyond the string
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take String input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Find length using user-defined method
        int userDefinedLength = findStringLength(text);

        // Find length using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using charAt(): " + userDefinedLength);
        System.out.println("Length using length(): " + builtInLength);

        input.close();
    }
}