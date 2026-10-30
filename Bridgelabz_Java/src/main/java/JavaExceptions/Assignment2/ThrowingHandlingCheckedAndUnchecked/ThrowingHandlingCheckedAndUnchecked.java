/*
 * Question: Implementation and demonstration of Throwing Handling Checked And Unchecked
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Throwing Handling Checked And Unchecked.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment2.ThrowingHandlingCheckedAndUnchecked;


import java.io.IOException;

public class ThrowingHandlingCheckedAndUnchecked {
    // Method to handle process data operations
    static void processData(int value) throws IOException {
        if (value < 0) {
            throw new IllegalArgumentException(
                "Value cannot be negative"
            );
        }

        if (value == 0) {
            throw new IOException(
                "Cannot process zero value"
            );
        }

        System.out.println("Data processed: " + value);
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        int[] values = {-5, 0, 10};

        for (int value : values) {
            try {
                processData(value);

            } catch (IOException e) {
                System.out.println("Checked exception: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Unchecked exception: " + e.getMessage());
            }
        }
    }
}
