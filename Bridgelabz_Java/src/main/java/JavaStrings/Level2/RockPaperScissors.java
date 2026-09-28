package JavaStrings.Level2;

public class RockPaperScissors /*
 * Program to play Rock-Paper-Scissors between the user and computer.
 * Display the stats of player and computer wins across multiple games.
 *
 * Hint =>
 * 1. Rock beats Scissors.
 * 2. Paper beats Rock.
 * 3. Scissors beats Paper.
 * 4. Generate computer choice using Math.random().
 * 5. Find the winner between user and computer.
 * 6. Calculate winning percentage.
 * 7. Display the results in tabular format.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    // Method to generate computer choice
    public static String getComputerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    // Method to find the winner
    public static String findWinner(String player, String computer) {

        if (player.equals(computer)) {
            return "Draw";
        }

        if ((player.equals("Rock") && computer.equals("Scissors")) ||
                (player.equals("Paper") && computer.equals("Rock")) ||
                (player.equals("Scissors") && computer.equals("Paper"))) {
            return "Player";
        }

        return "Computer";
    }

    // Method to calculate average and percentage wins
    public static String[][] calculateStats(
            int playerWins, int computerWins, int draws, int totalGames) {

        String[][] stats = new String[3][3];

        double playerPercentage =
                (playerWins * 100.0) / totalGames;

        double computerPercentage =
                (computerWins * 100.0) / totalGames;

        double drawPercentage =
                (draws * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercentage);

        stats[2][0] = "Draw";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.format("%.2f%%", drawPercentage);

        return stats;
    }

    // Method to display game results and statistics
    public static void displayResults(
            String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results");
        System.out.println("Game\tPlayer\tComputer\tWinner");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            gameResults[i][0] + "\t" +
                            gameResults[i][1] + "\t\t" +
                            gameResults[i][2]
            );
        }

        System.out.println("\nStatistics");
        System.out.println("Player\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t" +
                            stats[i][1] + "\t" +
                            stats[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int numberOfGames = input.nextInt();

        input.nextLine();

        String[][] gameResults =
                new String[numberOfGames][3];

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        // Play multiple games
        for (int i = 0; i < numberOfGames; i++) {

            System.out.print(
                    "Enter Rock, Paper, or Scissors: "
            );

            String playerChoice = input.nextLine();

            String computerChoice = getComputerChoice();

            String winner =
                    findWinner(playerChoice, computerChoice);

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        // Calculate statistics
        String[][] stats = calculateStats(
                playerWins,
                computerWins,
                draws,
                numberOfGames
        );

        // Display results
        displayResults(gameResults, stats);

        input.close();
    }
}{
}
