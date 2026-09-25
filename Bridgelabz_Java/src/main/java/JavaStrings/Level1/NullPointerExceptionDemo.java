/*
 * Program to demonstrate NullPointerException.
 *
 * Hint =>
 * 1. Define a String variable and initialize it to null.
 * 2. Call a String method using the null reference.
 * 3. This generates a NullPointerException.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {

        String text = null;

        // Calling String method on null reference
        System.out.println(text.length());
    }

    public static void main(String[] args) {

        // Generate the exception
        generateException();
    }
}