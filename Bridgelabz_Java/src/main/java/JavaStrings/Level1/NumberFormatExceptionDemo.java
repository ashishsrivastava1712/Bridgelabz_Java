/*
 * Program to demonstrate NumberFormatException.
 *
 * Hint =>
 * 1. Take user input as a String.
 * 2. Use Integer.parseInt() to convert the String into an integer.
 * 3. Generate NumberFormatException when the String does not contain a valid number.
 * 4. Handle the exception using try-catch.
 * 5. Call the methods from main().
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {

        int number = Integer.parseInt(text);

        System.out.println("Number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException handled.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take String input
        System.out.print("Enter a number as text: ");
        String text = input.next();

        // Generate the exception
        // generateException(text);

        // Handle the exception
        handleException(text);

        input.close();
    }
}