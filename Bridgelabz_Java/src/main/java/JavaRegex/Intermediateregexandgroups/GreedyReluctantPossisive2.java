/*
 * Question: Implementation and demonstration of Greedy Reluctant Possisive2
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Greedy Reluctant Possisive2.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaRegex.Intermediateregexandgroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyReluctantPossisive2 
{
     // Main execution method to run and demonstrate the solution
     public static void main(String[] args) {
        String input =
            "<name>Ashish</name><name>Java</name>";

        test(input, "<.*>");
        test(input, "<.*?>");
        test(input, "<[^>]*>");
    }
    
    // Method to handle test operations
    static void test(String input, String regex) {
        Matcher m = Pattern.compile(regex).matcher(input);

        System.out.println("Pattern: " + regex);

        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println();
    }
}
