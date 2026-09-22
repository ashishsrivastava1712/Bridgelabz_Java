/*
 * Problem 2 - GCR Programming Elements Level 1
 * Write a program to find the average marks in Physics, Chemistry and Mathematics.
 *
 * I/P => NONE
 * O/P => Average marks = ___
 *
 * Author: Ashish Srivastava
 * Date: 21-09-2026
 */

public class AveragePCM {
    public static void main(String[] args) {
        int physics = 85;
        int chemistry = 90;
        int mathematics = 95;

        int total = physics + chemistry + mathematics;
        double average = total / 3.0;

        System.out.println("Average marks = " + average);
    }
}