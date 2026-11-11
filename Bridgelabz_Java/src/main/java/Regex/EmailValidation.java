
/*
Email Validation
Author : Ashish Srivastava
Date: 22/10/2026*/

package main.java.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {

    public static boolean validateEmail(String email) { //validating the email
        String regex = "^[a-zA-Z0-9_+-]+(\\.[a-zA-Z0-9_+-]+)*@"
                + "[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\."
                + "[a-zA-Z]{2,}$";

        return Pattern.matches(regex, email); //returning the result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //taking input from the user

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        if (validateEmail(email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        scanner.close();
    }
}