/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Book class with public ISBN,
 * protected title, and private author. Provide methods to set and
 * get the author name. Create an EBook subclass to demonstrate
 * access to ISBN and title.
 */

class Book {

    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get author
    public String getAuthor() {
        return author;
    }

    // Public method to set author
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass
class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Demonstrating public and protected members
    void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

class BookDemo {

    public static void main(String[] args) {

        EBook book =
                new EBook(
                        "978-1234567890",
                        "Java Programming",
                        "James Gosling"
                );

        book.displayDetails();

        book.setAuthor("Ashish Srivastava");

        System.out.println("Updated Author: " + book.getAuthor());
    }
}