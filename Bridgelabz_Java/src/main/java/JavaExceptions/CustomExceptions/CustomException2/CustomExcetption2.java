/*
 * Question: Implementation and demonstration of Custom Excetption2
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Custom Excetption2.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.CustomExceptions.CustomException2;
import java.io.*;
public class CustomExcetption2 
{
    
    static void MA() throws IOException
    {
        throw new IOException("Hiii this is an IOException");
    }
    static void MB() throws IOException
    {
        MA();
    }
    public static void main(String[] args) 
    {
        try
        {
            MA();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
