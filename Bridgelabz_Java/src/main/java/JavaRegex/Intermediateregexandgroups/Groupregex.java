/*
 * Question: Implementation and demonstration of Groupregex
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Groupregex.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaRegex.Intermediateregexandgroups;


import java.util.regex.*;

public class Groupregex {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        String input = "Order ID: ORD-2026-145";

        Pattern p = Pattern.compile("ORD-(\\d{4})-(\\d+)");
        Matcher m = p.matcher(input);

        if (m.find()) {
            System.out.println("Full match: " + m.group(0));
            System.out.println("Year: " + m.group(1));
            System.out.println("Order number: " + m.group(2));
            System.out.println("Start: " + m.start());
            System.out.println("End: " + m.end());
        }
    }
}
