/*
 * Problem 3 - GCR Programming Elements Level 1
 * Create a program to convert the distance of 10.8 kilometers to miles.
 * Hint: 1 km = 1.6 miles
 *
 * I/P => NONE
 * O/P => The distance ___ km in miles is ___
 *
 * Author: Ashish Srivastava
 * Date: 21-09-2026
 */

package JavaProgrammingElements.Level1;

public class ConvertKmToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double miles = kilometers / 1.6;

        System.out.println("10.8 km in miles is " + miles);
    }
}