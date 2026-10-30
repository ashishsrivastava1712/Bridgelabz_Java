/*
 * Question: Implementation and demonstration of if Present Or Elsetest
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for if Present Or Elsetest.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package OptionalClasses.ifPresentOrElsetest;

import java.util.*;

public class ifPresentOrElsetest 
{
    public static void main(String[] args) 
    {
        Optional <String> str= Optional.of("Ashish");
        str.ifPresentOrElse(s->System.out.println(s),()->System.out.println("Nothing is found here"));
        Optional <String> str2=Optional.empty();
        str2.ifPresentOrElse(s->System.out.println(s),()->System.out.println("Nothing is found here"));
    }
}
