/*
 * Problem 12 - Random Number Statistics
 *
 * Generate five 4-digit random numbers and find their
 * average, minimum and maximum values.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

public class RandomNumberStatistics {

    // Generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Find average, minimum and maximum values
    public double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            minimum = Math.min(minimum, numbers[i]);
            maximum = Math.max(maximum, numbers[i]);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {

        // Create object of RandomNumberStatistics
        RandomNumberStatistics statistics = new RandomNumberStatistics();

        // Define the number of random values
        int size = 5;

        // Generate random 4-digit numbers
        int[] numbers = statistics.generate4DigitRandomArray(size);

        // Display generated numbers
        System.out.println("Generated 4-Digit Numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Find average, minimum and maximum
        double[] results = statistics.findAverageMinMax(numbers);

        // Display results
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}