/*
 * Question: Implementation and demonstration of Throwsand Throw
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Throwsand Throw.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.JavaExceptionQuestions;
import java.io.*;

public class ThrowsandThrow 
{
    public static void main (String [] args)
    {
        try
            {
                exc();
            }
        catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
    }
    static void exc() throws IOException
    {
        throw new IOException("Hello world! this is an Ioexception");
    }
    
}
