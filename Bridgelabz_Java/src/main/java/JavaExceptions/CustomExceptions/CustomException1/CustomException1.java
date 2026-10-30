/*
 * Question: Implementation and demonstration of Custom Exception1
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Custom Exception1.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.CustomExceptions.CustomException1;
import java.io.*;

public class CustomException1 
{
    public static void main (String [] args)
    {
        try
            {
                Validage(16);
            }
        catch(InvalidAgeException e)
            {
                System.out.println(e.getMessage());
            }
    }
    static void Validage(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Hiii this is invalid age less than 18");
        }
        System.out.println("Age is valid");
    }
    
}
class InvalidAgeException extends Exception
    {
        public InvalidAgeException(String message)
        {
            super(message);
        }
    }
