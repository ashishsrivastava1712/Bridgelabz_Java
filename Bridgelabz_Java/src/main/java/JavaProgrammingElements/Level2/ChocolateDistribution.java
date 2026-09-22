/*
 * Problem 10 - GCR Java Programming Elements Level 2
 * Create a program to divide N number of chocolates among M children.
 *
 * I/P => numberOfChocolates, numberOfChildren
 * O/P => The number of chocolates each child gets is ___
 *        and the number of remaining chocolates are ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is "
                + chocolatesPerChild
                + " and the number of remaining chocolates are "
                + remainingChocolates);
    }
}