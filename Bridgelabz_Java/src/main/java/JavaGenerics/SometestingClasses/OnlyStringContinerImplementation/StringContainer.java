/*
 * Question: Implementation and demonstration of String Container
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for String Container.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.SometestingClasses.OnlyStringContinerImplementation;

public class StringContainer implements Container<String>{
    private String str;
    @Override
    // Method to handle add operations
    public void add(String item) {
        this.str=item;
    }

    @Override
    // Method to handle get operations
    public String get() {
        return str;
    }
}
