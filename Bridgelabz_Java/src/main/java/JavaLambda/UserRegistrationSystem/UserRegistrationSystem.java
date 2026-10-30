/*
 * Question: Implementation and demonstration of User Registration System
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for User Registration System.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaLambda.UserRegistrationSystem;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistrationSystem {

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Functional interfaces using lambda expressions
        Predicate<String> validateFirstName =
                name -> name.matches("[A-Z][a-z]{2,}");

        Predicate<String> validateLastName =
                name -> name.matches("[A-Z][a-z]{2,}");

        Predicate<String> validateEmail =
                email -> email.matches(
                    "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@" +
                    "[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$"
                );

        Predicate<String> validateMobile =
                mobile -> mobile.matches("^[0-9]{2} [0-9]{10}$");

        Predicate<String> validatePassword =
                password -> password.matches(
                    "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-]).{8,}$"
                );

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile (e.g., 91 9876543210): ");
        String mobile = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("\n--- Validation Results ---");

        System.out.println("First Name: " +
                validateFirstName.test(firstName));

        System.out.println("Last Name: " +
                validateLastName.test(lastName));

        System.out.println("Email: " +
                validateEmail.test(email));

        System.out.println("Mobile: " +
                validateMobile.test(mobile));

        System.out.println("Password: " +
                validatePassword.test(password));

        sc.close();
    }
}
