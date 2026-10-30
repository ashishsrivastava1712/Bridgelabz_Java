/*
 * Question: Implementation and demonstration of Nested Try Example
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Nested Try Example.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment3.ExceptionHandlinginNestedTryBlocks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NestedTryExample {
    // Method to handle read file operations
    public void readFile(String filePath) {
        try {

            try (BufferedReader reader = new BufferedReader(new

            FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Simulate potential parsing error
                    if (line.contains("error")) {
                        throw new NumberFormatException("Parsing error in line");

                    }
                    System.out.println(line);
                }
            } catch (NumberFormatException e) {
                System.err.println("Inner exception: " +

                        e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Outer exception: " + e.getMessage());
        }
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        NestedTryExample example = new NestedTryExample();
        example.readFile("example.txt");
    }
}
