/*
 * Author: Ashish Srivastava
 * Problem Description: Create a PalindromeChecker class with an attribute
 * text. Add methods to check if the text is a palindrome and display
 * the result.
 * Program: Check Palindrome String
 */

class PalindromeChecker {
    String text;

    // Method to check whether the text is a palindrome
    public boolean checkPalindrome() {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return text.equals(reverse);
    }

    // Method to display the result
    public void displayResult() {
        if (checkPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        checker.text = "madam";

        checker.displayResult();
    }
}