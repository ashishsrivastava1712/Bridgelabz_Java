/*
 * Question: Implementation and demonstration of Pattern Syntax Exception
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Pattern Syntax Exception.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaRegex.JavaRegexOneclassquestion;
import java.util.regex.*;
public class PatternSyntaxException 
{
    public static void main(String[] args) 
    {
        try
        {
            String regex = "[a-z"; // Invalid regex pattern
            Pattern p = Pattern.compile(regex);
        }
        catch (java.util.regex.PatternSyntaxException e)
        {
            System.out.println("PatternSyntaxException: " + e.getDescription());
            System.out.println("Index: " + e.getIndex());
            System.out.println("Message: " + e.getMessage());
        }
    }    
}
