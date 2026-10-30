/*
 * Question: Implementation and demonstration of File Reader Exc
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for File Reader Exc.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.JavaExceptionQuestions;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExc {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            reader.close();
        } catch (IOException e) {
            System.out.println("Unable to access the file.");
        }
    }
}
