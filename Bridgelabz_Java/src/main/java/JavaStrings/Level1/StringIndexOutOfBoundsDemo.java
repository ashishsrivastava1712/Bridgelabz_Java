/*
 * Program to demonstrate StringIndexOutOfBoundsException.
 *
 * Hint =>
 * 1. Take a String as user input.
 * 2. Generate StringIndexOutOfBoundsException using charAt()
 *    beyond the length of the String.
 * 3. Handle the exception using try-catch.
 * 4. Call the methods from main().
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Access index beyond the length of the String
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Access index beyond the length of the String
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("StringIndexOutOfBoundsException handled.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take String input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Generate the exception
        // generateException(text);

        // Handle the exception
        handleException(text);

        input.close();
    }
}