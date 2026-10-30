/*
 * Question: Implementation and demonstration of Container
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Container.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.SometestingClasses.GenericContainerImplementation;

public interface Container<T>
{
    void added(T item);
    T get();
}
