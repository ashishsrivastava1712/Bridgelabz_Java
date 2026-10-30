/*
 * Question: Implementation and demonstration of Main
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Main.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.SometestingClasses.GenericContainerImplementation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        Container<String> c1= new GenericContainer<>("Ashish Srivastava 1");
        c1.added("Ashish Srivastava");
        System.out.println(c1.get());
        List<Container<String>> ls= new ArrayList<Container<String>>();
        // the objects that I will add to this
        
        ls.add(new GenericContainer<>("hello World 1"));
        ls.add(new GenericContainer<>("hello World 2"));
        ls.add(new GenericContainer<>("hello World 3"));
        for(Container<String> vals: ls)
            {
                System.out.println(vals.get());
            }
        }
}
