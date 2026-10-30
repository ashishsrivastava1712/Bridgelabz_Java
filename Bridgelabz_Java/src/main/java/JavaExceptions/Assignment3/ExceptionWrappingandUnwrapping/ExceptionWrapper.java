/*
 * Question: Implementation and demonstration of Exception Wrapper
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Exception Wrapper.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment3.ExceptionWrappingandUnwrapping;

import java.io.IOException;
class CustomRuntimeException extends RuntimeException {
public CustomRuntimeException(String message, Throwable cause) {
super(message, cause);
}
}
public class ExceptionWrapper {
// Method to handle throw wrapped exception operations
public void throwWrappedException() {
try {
// Simulate an operation that throws an IOException
throw new IOException("Original IOException");
} catch (IOException e) {

throw new CustomRuntimeException("Wrapped exception", e);
}
}
// Method to handle handle exception operations
public void handleException() {
try {
throwWrappedException();
} catch (CustomRuntimeException e) {
System.err.println("Caught CustomRuntimeException: " +

e.getMessage());

System.err.println("Original cause: " +

e.getCause().getMessage());

}
}
// Main execution method to run and demonstrate the solution
public static void main(String[] args) {
ExceptionWrapper wrapper = new ExceptionWrapper();
wrapper.handleException();
}
}
