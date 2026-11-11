/*
Extra Problems - Problem 4
Remove Duplicate Characters from a String
Problem:
Write a Java program to remove all duplicate characters from a string, leaving only
unique characters in their original order.
Author : Ashish Srivastava
Date: 02/10/2026*/

import java.util.*;
public class RemoveDuplicates{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a string"); 
        String str = scanner.nextLine(); 
        RemoveDuplicates obj = new RemoveDuplicates();
        obj.removeDuplicates(str);
        scanner.close();
    }
    public void removeDuplicates(String str) {
        String result = ""; 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            if (result.indexOf(ch) == -1) { //checking if the character is already in the result string
                result += ch; //adding the character to the result string if it is not already present
            }
        }
        System.out.println("String with duplicates removed: " + result); //printing the result string
    }
}
