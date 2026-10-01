/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Book class with attributes title,
 * author, price, and availability. Implement a method to borrow a book.
 */

class LibraryBook {

    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    LibraryBook(String title, String author, double price,
                boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow book
    void borrowBook() {

        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {

        LibraryBook book =
                new LibraryBook(
                        "Java Programming",
                        "James Gosling",
                        599.0,
                        true
                );

        System.out.println("Before Borrowing:");
        book.displayDetails();

        book.borrowBook();

        System.out.println("\nAfter Borrowing:");
        book.displayDetails();
    }
}