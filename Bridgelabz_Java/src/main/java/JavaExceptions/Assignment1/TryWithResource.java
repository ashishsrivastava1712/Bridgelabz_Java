/*
 * Question: Implementation and demonstration of Try With Resource
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Try With Resource.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try (BufferedReader br =
                 new BufferedReader(new FileReader("info.txt"))) {

            String line = br.readLine();
            if (line != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
