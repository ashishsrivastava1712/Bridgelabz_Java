/*
 * Author: Ashish Srivastava
 * Problem Description: Write a Java program where the user thinks of a number
 * between 1 and 100 and the computer tries to guess the number. The user gives
 * feedback whether the guess is high, low, or correct. Use separate methods for
 * generating guesses, receiving feedback, and determining the next guess.
 * Program: Number Guessing Game
 */

import java.util.Scanner;

class NumberGuessingGame {

    // Method to generate a guess between minimum and maximum
    public static int generateGuess(int minimum, int maximum) {
        return minimum + (int) (Math.random() * (maximum - minimum + 1));
    }

    // Method to receive feedback from the user
    public static char getFeedback(Scanner input) {
        System.out.print("Enter feedback (H = High, L = Low, C = Correct): ");
        return input.next().toUpperCase().charAt(0);
    }

    // Method to determine the next range based on feedback
    public static int[] determineNextRange(int guess, char feedback,
                                           int minimum, int maximum) {
        if (feedback == 'H') {
            maximum = guess - 1;
        } else if (feedback == 'L') {
            minimum = guess + 1;
        }

        return new int[]{minimum, maximum};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minimum = 1;
        int maximum = 100;
        char feedback = ' ';

        while (feedback != 'C' && minimum <= maximum) {

            int guess = generateGuess(minimum, maximum);

            System.out.println("Computer Guess: " + guess);

            feedback = getFeedback(input);

            if (feedback == 'C') {
                System.out.println("Computer guessed your number!");
                break;
            }

            int[] range = determineNextRange(
                    guess, feedback, minimum, maximum);

            minimum = range[0];
            maximum = range[1];
        }

        input.close();
    }
}