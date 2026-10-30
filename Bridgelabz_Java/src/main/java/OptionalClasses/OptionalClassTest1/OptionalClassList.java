/*
 * Question: Implementation and demonstration of Optional Class List
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Optional Class List.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package OptionalClasses.OptionalClassTest1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassList {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
    
        // we learn to create an optional list and print the values using for each loop and also by converting them to upper case
        List<String> arr = Arrays.asList("Ashish","hello","How are you");
        List<Optional<String>> str= arr.stream().map( s->Optional.of(s.toUpperCase()) ).toList();
        System.out.println(str);
        System.out.println("Printing through foreach");
        str.forEach(s->s.ifPresent(t->System.out.println(t)));

    }
}
