/*
 * Question: Implementation and demonstration of Number Format Exce
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Number Format Exce.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.JavaExceptionQuestions;
public class NumberFormatExce {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        String input = "Ashish";

        try {
            int divisor = Integer.parseInt(input);
            int result = 100 / divisor;

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("End of program.");
    }
}
