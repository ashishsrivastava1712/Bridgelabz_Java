/*
 * Question: Implementation and demonstration of Byte Stream To Copy From To A File
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Byte Stream To Copy From To A File.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaIOStreams.ByteStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamToCopyFromToAFile {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {

        String source = "Inputfiles/ByteStreamToCopyFromToAFile.pdf";
        String destination = "Outputfiles/ByteStreamToCopyFromToAFile_copy.pdf";

        try (FileInputStream input =new FileInputStream(source);FileOutputStream output =new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("File copy failed: "
                    + e.getMessage());
        }
    }
}
