/*
 * Problem 5 - GCR Programming Elements Level 1
 * Suppose you have to divide 14 pens among 3 students equally.
 * Write a program to find how many pens each student will get
 * if the pens must be divided equally.
 * Also, find the remaining non-distributed pens.
 *
 * Hint =>
 * a. Use Modulus Operator (%) to find the remainder.
 * b. Use Division Operator to find the Quantity of pens.
 *
 * I/P => NONE
 * O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___
 *
 * Author: Ashish Srivastava
 * Date: 21-09-2026
 */

package JavaProgrammingElements.Level1;

public class PenDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int penPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + penPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }
}