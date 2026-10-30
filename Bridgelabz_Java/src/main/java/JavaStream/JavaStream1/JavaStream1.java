/*
 * Question: Implementation and demonstration of Java Stream1
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Java Stream1.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaStream.JavaStream1;

import java.util.Arrays;
import java.util.List;

public class JavaStream1 
{
    public static void main(String[] args) 
    {
         List<String> narr = Arrays.asList("Ashish","hello","How are you");
        System.out.println(narr);
        List<String> result=narr.stream().map(s -> s.toUpperCase()).toList();

        System.out.println(result);
    }
}
