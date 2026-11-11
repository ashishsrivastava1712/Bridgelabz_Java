
package main.java.Regex;
/*
UC 6 - Validate Password
As a User need to follow pre-defined
Password Rules - Rule1 – minimum 8
Characters
Rule2 – Should have at least 1
Uppercase letter
Author : Ashish Srivastava
Date: 19/10/2026*/
import java.util.regex.Pattern;
import java.util.Scanner;

public class UC6Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String regex = ".*[A-Z].*"; //validating the uppercase letter

        System.out.println(Pattern.matches(regex, password)
                ? "Uppercase Present" : "Uppercase Missing"); //printing the result

        scanner.close();
    }
}
