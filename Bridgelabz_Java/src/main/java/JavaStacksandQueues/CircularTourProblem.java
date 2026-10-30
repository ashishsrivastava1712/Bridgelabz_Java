/*
 * Problem 5: Circular Tour Problem
Given petrol pumps represented by petrol and distance to the next pump, determine the starting pump index from which a full circular tour can be completed. Return -1 if no solution exists.
Track the total petrol surplus and the current tour surplus to identify a valid starting point.
 *
 * Hint:
 * If the current surplus becomes negative, no pump from the current start through this pump can be the answer. Start checking from the next pump.
 *
 * Author: Ashish Srivastava
 * Date: 13 - 10 - 2026
 */
package JavaStacksandQueues;


class CircularTourProblem {
    // Method to handle find start operations
    static int findStart(int[] petrol, int[] distance) {
        int total = 0;
        int current = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            int surplus = petrol[i] - distance[i];

            total += surplus;
            current += surplus;

            if (current < 0) {
                start = i + 1;
                current = 0;
            }
        }

        if (total < 0) {
            return -1;
        }

        return start;
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(findStart(petrol, distance));
    }
}
