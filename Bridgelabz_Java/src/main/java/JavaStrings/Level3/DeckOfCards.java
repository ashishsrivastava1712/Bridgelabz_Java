/*
 * Program to create a deck of cards, initialize the deck,
 * shuffle the deck, distribute the deck to players,
 * and print the cards each player has.
 *
 * Hint =>
 * a. Create a deck with suits Hearts, Diamonds, Clubs, Spades
 *    and ranks from 2 to Ace.
 * b. Calculate the number of cards in the deck.
 * c. Write a method to initialize the deck of cards.
 * d. Write a method to shuffle the deck using Math.random().
 * e. Write a method to distribute the deck of n cards to
 *    x number of players and return the players.
 * f. Write a method to print the players and their cards.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level3;

import java.util.Scanner;

public class DeckOfCards {

    // Initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    // Shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber =
                    i + (int) (Math.random() * (n - i));

            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Distribute cards to players
    public static String[][] distributeCards(
            String[] deck, int numberOfPlayers) {

        if (deck.length % numberOfPlayers != 0) {
            return null;
        }

        int cardsPerPlayer = deck.length / numberOfPlayers;

        String[][] players =
                new String[numberOfPlayers][cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < numberOfPlayers; i++) {

            for (int j = 0; j < cardsPerPlayer; j++) {

                players[i][j] = deck[index];
                index++;
            }
        }

        return players;
    }

    // Print players and their cards
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] suits = {
                "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        // Take number of players
        System.out.print("Enter number of players: ");
        int numberOfPlayers = input.nextInt();

        // Calculate number of cards
        int numOfCards = suits.length * ranks.length;

        if (numberOfPlayers <= 0 ||
                numOfCards % numberOfPlayers != 0) {

            System.out.println(
                    "Cards cannot be equally distributed.");
            input.close();
            return;
        }

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle deck
        deck = shuffleDeck(deck);

        // Distribute cards
        String[][] players =
                distributeCards(deck, numberOfPlayers);

        // Display players and their cards
        printPlayers(players);

        input.close();
    }
}