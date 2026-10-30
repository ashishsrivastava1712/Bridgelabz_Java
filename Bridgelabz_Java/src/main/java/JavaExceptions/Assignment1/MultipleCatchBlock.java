/*
 * Question: Implementation and demonstration of Multiple Catch Block
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Multiple Catch Block.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment1;


public class MultipleCatchBlock {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int index = 2;

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
