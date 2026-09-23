/*
 * Problem 6 - Spring Season
 *
 * Write a program that takes month and day as command-line arguments
 * and checks whether the date falls in Spring Season.
 *
 * Spring Season is from March 20 to June 20.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

public class SpringSeason {

    // Check whether the given date is in Spring Season
    public boolean isSpringSeason(int month, int day) {

        boolean isSpring = false;

        if ((month == 3 && day >= 20)
                || (month == 4)
                || (month == 5)
                || (month == 6 && day <= 20)) {
            isSpring = true;
        }

        return isSpring;
    }

    public static void main(String[] args) {

        // Validate command-line arguments
        if (args.length < 2) {
            System.err.println("Please provide month and day.");
            System.exit(0);
        }

        // Convert command-line arguments to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Validate month and day
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.err.println("Invalid Date.");
            System.exit(0);
        }

        // Create object of SpringSeason class
        SpringSeason springSeason = new SpringSeason();

        // Check whether it is Spring Season
        boolean result = springSeason.isSpringSeason(month, day);

        // Display the result
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}