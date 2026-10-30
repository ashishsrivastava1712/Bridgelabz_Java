/*
 * Question: Implementation and demonstration of Test3
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Test3.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.onlineCompilerClassesStyle.Test3;

import java.util.*;

public class Test3 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {

        Container<String> c1 = new GenericContainer<>();
        c1.add("Ashish Srivastava");
        System.out.println(c1.get());

        List<Container<String>> ls = new ArrayList<>();

        ls.add(new GenericContainer<String>().add("Hello world"));
        ls.add(new GenericContainer<String>().add("Hello world 2"));
        ls.add(new GenericContainer<String>().add("Hello world 3"));

        for (Container<String> vals : ls) {
            System.out.println(vals.get());
        }
    }
}

class GenericContainer<T> implements Container<T> {

    private T item;

    @Override
    public GenericContainer<T> add(T item) {
        this.item = item;
        return this;
    }

    @Override
    public T get() {
        return item;
    }
}

interface Container<T> {
    GenericContainer<T> add(T item);
    T get();
}
