
package main.java.Regex;

import java.util.regex.Pattern;
import java.util.Scanner;

public class UC8PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)"
                + "[A-Za-z0-9]*[^A-Za-z0-9]"
                + "[A-Za-z0-9]*$"; 

        System.out.println(Pattern.matches(regex, password)
                ? "Valid Password" : "Invalid Password");

        scanner.close();
    }
}
