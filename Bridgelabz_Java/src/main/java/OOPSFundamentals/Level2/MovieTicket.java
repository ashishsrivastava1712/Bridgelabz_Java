/*
 * Author: Ashish Srivastava
 * Problem Description: Create a MovieTicket class with attributes
 * movieName, seatNumber, and price. Add methods to book a ticket by
 * assigning a seat and updating the price, and to display ticket details.
 * Program: Model a Movie Ticket Booking System
 */

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Method to book a ticket
    public void bookTicket(String seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;

        System.out.println("Ticket Booked Successfully");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.movieName = "Avengers";

        ticket.bookTicket("A10", 250);

        ticket.displayDetails();
    }
}