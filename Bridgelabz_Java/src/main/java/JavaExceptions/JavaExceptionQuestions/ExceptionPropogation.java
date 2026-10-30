/*
 * Question: Implementation and demonstration of Exception Propogation
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Exception Propogation.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.JavaExceptionQuestions;
import java.io.*;
public class ExceptionPropogation 
{
    static void methordB()
    {
        int a = 5/0;
        System.out.println(a);
    }
    static void methordA()
    {
        methordB();
    }
    public static void main (String [] args)
    {
        try
        {
            methordA();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
