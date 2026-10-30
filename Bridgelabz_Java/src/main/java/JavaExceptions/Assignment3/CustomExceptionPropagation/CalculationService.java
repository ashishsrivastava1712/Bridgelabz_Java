/*
 * Question: Implementation and demonstration of Calculation Service
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Calculation Service.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment3.CustomExceptionPropagation;

class CalculationException extends Exception {
    public CalculationException(String message) {
        super(message);

    }
}

public class CalculationService {
    // Method to handle perform calculation operations
    public void performCalculation(int value) throws CalculationException {
        if (value < 0) {
            throw new CalculationException("Value must be non-negative");
        }
        // Simulate calculation
        if (value == 0) {
            throw new CalculationException("Calculation resulted in zero");
        }
        System.out.println("Calculation result: " + (value * 2));
    }

    // Method to handle process operations
    public void process() {
        try {
            performCalculation(-5);
        } catch (CalculationException e) {
            System.err.println("Exception caught in process: " +

                    e.getMessage());
        }
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        CalculationService service = new CalculationService();
        service.process();
    }
}
