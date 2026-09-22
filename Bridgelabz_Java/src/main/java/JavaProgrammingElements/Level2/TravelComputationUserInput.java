/*
 * Problem 8 - GCR Java Programming Elements Level 2
 * Rewrite the Sample Program 2 with user inputs.
 *
 * I/P => name, fromCity, viaCity, toCity, distances and time
 * O/P => The Total Distance travelled by ___ from ___ to ___ via ___
 *        is ___ miles and the Total Time taken is ___ minutes
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class TravelComputationUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String fromCity = input.nextLine();
        String viaCity = input.nextLine();
        String toCity = input.nextLine();

        double distanceFromToVia = input.nextDouble();
        double distanceViaToFinalCity = input.nextDouble();

        int timeFromToVia = input.nextInt();
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " miles and the Total Time taken is " +
                totalTime + " minutes");
    }
}