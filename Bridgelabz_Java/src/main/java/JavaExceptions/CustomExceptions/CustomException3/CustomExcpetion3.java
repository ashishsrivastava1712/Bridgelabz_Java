/*
 * Question: Implementation and demonstration of Custom Excpetion3
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Custom Excpetion3.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.CustomExceptions.CustomException3;

import java.io.*;
public class CustomExcpetion3 
{
    
    public static void main(String[] args) 
    {
        try
        {
            int a =5/0;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
