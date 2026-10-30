/*
 * Question: Implementation and demonstration of Matcherand Find
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Matcherand Find.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaRegex.JavaRegexOneclassquestion;

import java.util.regex.*;

public class MatcherandFind {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");

        Matcher m1 = pattern.matcher("12345");
        Matcher m2 = pattern.matcher("Roll number: 12345");

        System.out.println(m1.matches());
        System.out.println(m2.matches());

        Matcher m3 = pattern.matcher("Roll number: 12345");
        System.out.println(m3.find());
        System.out.println(m3.group());
    }
}
