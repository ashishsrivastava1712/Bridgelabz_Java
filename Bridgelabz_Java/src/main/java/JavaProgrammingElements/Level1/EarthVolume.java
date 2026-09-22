/*
 * Problem 7 - GCR Programming Elements Level 1
 * Write a Program to compute the volume of Earth in km^3 and miles^3.
 *
 * Hint => Volume of a Sphere is (4/3) * pi * r^3
 * and radius of earth is 6378 km.
 *
 * O/P => The volume of earth in cubic kilometers is ____
 *        and cubic miles is ____
 *
 * Author: Ashish Srivastava
 * Date: 21-09-2026
 */

package JavaProgrammingElements.Level1;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3.0) * Math.PI * radiusKm * radiusKm * radiusKm;

        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0 / 3.0) * Math.PI * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}