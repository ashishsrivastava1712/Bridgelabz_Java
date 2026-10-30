/*
 * Question: Implementation and demonstration of List Of String To Upper Case
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for List Of String To Upper Case.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaStream.QuestionOnlyoneclass;
import java.util.*;
public class ListOfStringToUpperCase 
{
    public static void main(String[] args) 
    {
        List<String> str= Arrays.asList("Ashish","Navya","Horahora");
        str.stream().map(s->s.toUpperCase()).forEach(e->System.out.println(e));
    }
}
