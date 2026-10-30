/*
 * Question: Implementation and demonstration of String Length Greater Then5
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for String Length Greater Then5.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaStream.QuestionOnlyoneclass;

import java.util.Arrays;
import java.util.List;

public class StringLengthGreaterThen5 {
    public static void main(String[] args) 
    {
        List<String> str= Arrays.asList("Ashish","Navya","Horahora");
        str.stream().filter(s->s.length()>5).forEach(e->System.out.println(e+" "));
        
    }
}
