/*
 * Problem 9 - Rocket Countdown Using For Loop
 *
 * Rewrite program 8 to do the countdown using the for-loop
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class RocketCountdownForLoop {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the starting countdown value from the user
        int counter = input.nextInt();

        // Count down from the given number to 1 using for loop
        for (int currentNumber = counter; currentNumber >= 1; currentNumber--) {
            System.out.println(currentNumber);
        }

        // Close the Scanner
        input.close();
    }
}