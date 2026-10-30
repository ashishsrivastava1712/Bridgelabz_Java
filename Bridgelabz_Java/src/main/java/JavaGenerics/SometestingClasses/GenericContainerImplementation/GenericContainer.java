/*
 * Question: Implementation and demonstration of Generic Container
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Generic Container.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.SometestingClasses.GenericContainerImplementation;

public class GenericContainer<T> implements Container<T>
{
    private T item;
    GenericContainer(T item)
    {
        this.item=item;
    }
    {

    }
    @Override
    // Method to handle added operations
    public void added(T item) {
        this.item=item;
    }

    @Override
    public T get() {
        return item;
    }
}
