/*
 * Program to demonstrate IllegalArgumentException.
 *
 * Hint =>
 * 1. Take a String as user input.
 * 2. Generate IllegalArgumentException by using substring()
 *    with start index greater than end index.
 * 3. Handle the exception using try-catch.
 * 4. Call the methods from main().
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {

        // Start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            // Start index is greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException handled.");
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