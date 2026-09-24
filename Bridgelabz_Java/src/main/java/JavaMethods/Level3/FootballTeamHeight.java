/*
 * Problem - Football Team Height
 *
 * Create a program to find the shortest, tallest, and mean height
 * of players present in a football team.
 *
 * Hint =>
 * 1. Mean = sum of all elements / number of elements
 * 2. Create an int array named heights of size 11 and get 3 digit
 *    random height in cms for each player in the range 150 cms to 250 cms.
 * 3. Write a method to find the sum of all elements in the array.
 * 4. Write a method to find the mean height.
 * 5. Write a method to find the shortest height.
 * 6. Write a method to find the tallest height.
 * 7. Finally display the results.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

public class FootballTeamHeight {

    // Generate random height between 150 and 250 cm
    public int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    // Find the sum of all heights
    public int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    // Find the mean height
    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Find the shortest height
    public int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    // Find the tallest height
    public int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        // Create object of FootballTeamHeight class
        FootballTeamHeight team = new FootballTeamHeight();

        // Generate heights of 11 players
        int[] heights = team.generateHeights();

        // Display heights
        System.out.println("Heights of Players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Calculate results
        int sum = team.findSum(heights);
        double mean = team.findMean(heights);
        int shortest = team.findShortest(heights);
        int tallest = team.findTallest(heights);

        // Display results
        System.out.println("\nSum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}