/*
 * Question: Implementation and demonstration of Checked Exceptions
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Checked Exceptions.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try (BufferedReader reader =
                 new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
