/*
 * Problem 9 - GCR Java Programming Elements Level 2
 * An athlete runs in a triangular park with sides provided as input
 * by the user in meters. If the athlete wants to complete a 5 km run,
 * find how many rounds the athlete must complete.
 *
 * I/P => side1, side2, side3
 * O/P => The total number of rounds the athlete will run is ___
 *        to complete 5 km
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;

        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is "
                + rounds + " to complete 5 km");
    }
}