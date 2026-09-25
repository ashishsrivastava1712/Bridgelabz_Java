/*
 * Program to compare two strings using charAt() method
 * and compare the result with the built-in equals() method.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level1;

import java.util.Scanner;

public class StringCompare {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String first = input.next();

        System.out.print("Enter second string: ");
        String second = input.next();

        // Compare using user-defined method
        boolean userDefinedResult = compareStrings(first, second);

        // Compare using built-in equals()
        boolean builtInResult = first.equals(second);

        // Display results
        System.out.println("Using charAt(): " + userDefinedResult);
        System.out.println("Using equals(): " + builtInResult);
        System.out.println("Both results are same: "
                + (userDefinedResult == builtInResult));

        input.close();
    }
}