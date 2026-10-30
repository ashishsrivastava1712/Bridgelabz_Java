/*
 * Question: Implementation and demonstration of Pattern_ Matches
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Pattern_ Matches.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaRegex.JavaRegexOneclassquestion;

import java.util.regex.*;

public class Pattern_Matches{
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        
        boolean valid = Pattern.matches("\\d+", "12345");
        System.out.println("Is '12345' a valid number? " + valid);
    }
}
