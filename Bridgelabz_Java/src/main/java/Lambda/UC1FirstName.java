package main.java.Lambda;

/*
First name starts with Cap and has
minimum 3 characters
Author : Ashish Srivastava
Date: 19/10/2026*/

@FunctionalInterface
interface FirstNameValidator {
    boolean validate(String name);
}

public class UC1FirstName {
    public static void main(String[] args) {
        FirstNameValidator firstName = name -> name != null && name.matches("^[A-Z][a-zA-Z]{2,}$"); // Regex
        System.out.println(firstName.validate("Ashish"));
        System.out.println(firstName.validate("ut"));
    }
}