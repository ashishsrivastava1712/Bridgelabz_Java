/*
 * Problem 7 - Spring Season
 *
 * Write a program SpringSeason that takes two int values month and day from the command
 * line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
 *
 * Hint =>
 * a. Spring Season is from March 20 to June 20
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

public class SpringSeason {
    public static void main(String[] args) {

        // Get month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check whether the given date falls in the spring season
        boolean isSpringSeason =
                (month == 3 && day >= 20) ||
                        (month == 4) ||
                        (month == 5) ||
                        (month == 6 && day <= 20);

        // Print the result
        if (isSpringSeason) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}