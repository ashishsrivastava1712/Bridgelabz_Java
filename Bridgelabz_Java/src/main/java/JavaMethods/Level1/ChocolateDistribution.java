/*
 * Problem 10 - Chocolate Distribution
 *
 * Create a program to divide N number of chocolates among M children.
 * Print the number of chocolates each child will get and
 * the remaining chocolates.
 *
 * Author: Ashish Srivastava
 * Date: 24-09-2026
 */

package JavaMethods.Level1;

import java.util.Scanner;

public class ChocolateDistribution {

    // Find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(
            int numberOfChocolates, int numberOfChildren) {

        int chocolatesPerChild =
                numberOfChocolates / numberOfChildren;

        int remainingChocolates =
                numberOfChocolates % numberOfChildren;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for chocolates
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Take input for children
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate the user input
        if (numberOfChocolates < 0 || numberOfChildren <= 0) {
            System.err.println("Invalid Input.");
            System.exit(0);
        }

        // Find chocolate distribution
        int[] result = findRemainderAndQuotient(
                numberOfChocolates,
                numberOfChildren
        );

        // Display the result
        System.out.println("Chocolates per Child: " + result[0]);
        System.out.println("Remaining Chocolates: " + result[1]);

        // Close the Scanner Object
        input.close();
    }
}