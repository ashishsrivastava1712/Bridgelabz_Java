/*
 * Question: Implementation and demonstration of Try With Resource
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Try With Resource.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment2.TryWithResource;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

class FileProcessor {
    // Method to handle process files operations
    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            System.out.println("Reading: " + path);

            try (BufferedReader reader =
                     new BufferedReader(new FileReader(path))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Could not read file: " + path);
            }
        }
    }
}

public class TryWithResource {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        List<String> files = Arrays.asList(
            "data1.txt",
            "data2.txt",
            "data3.txt"
        );

        processor.processFiles(files);
    }
}
