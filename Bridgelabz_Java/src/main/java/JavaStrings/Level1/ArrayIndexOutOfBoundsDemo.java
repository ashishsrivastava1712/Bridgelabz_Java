/*
 * Program to demonstrate ArrayIndexOutOfBoundsException.
 *
 * Hint =>
 * 1. Define an array of names and take input from the user.
 * 2. Write a method to generate ArrayIndexOutOfBoundsException
 *    by accessing an index larger than the array length.
 * 3. Write a method to handle the exception using try-catch.
 * 4. Call the methods from main().
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {

        // Access index beyond the array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            // Access index beyond the array length
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of names: ");
        int size = input.nextInt();

        String[] names = new String[size];

        // Take names as input
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        // Generate the exception
        // generateException(names);

        // Handle the exception
        handleException(names);

        input.close();
    }
}