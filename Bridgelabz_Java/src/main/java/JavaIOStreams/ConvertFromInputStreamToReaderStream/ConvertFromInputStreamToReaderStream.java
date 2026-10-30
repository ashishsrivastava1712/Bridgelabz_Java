/*
 * Question: Implementation and demonstration of Convert From Input Stream To Reader Stream
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Convert From Input Stream To Reader Stream.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaIOStreams.ConvertFromInputStreamToReaderStream;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ConvertFromInputStreamToReaderStream {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {

        String fileName = "Outputfiles/unicode.txt";

        // Characters -> bytes -> file
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileName),
                        StandardCharsets.UTF_8
                ))) {

            writer.write("Hello, नमस्ते, こんにちは");
            writer.newLine();
            writer.write("UTF-8 preserves text through encoding.");

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
            return;
        }

        // File -> bytes -> characters
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName),
                        StandardCharsets.UTF_8
                ))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
