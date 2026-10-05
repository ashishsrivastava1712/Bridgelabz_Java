package Inheritance.SingleInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Book class and extend it using an
 * Author class. Display book and author information.
 */

public class LibraryManagement {

    // Parent class
    // Contains common information related to a book
    static class Book {
        String title;
        int publicationYear;

        // Constructor initializes Book attributes
        Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        // Method to display book information
        void displayInfo() {
            System.out.println("Book Title: " + title);
            System.out.println("Publication Year: " + publicationYear);
        }
    }

    // Child class
    // Author inherits title and publicationYear from Book
    static class Author extends Book {

        String name;
        String bio;

        // Constructor of child class
        Author(String title, int publicationYear,
               String name, String bio) {

            // super() calls the constructor of the parent class
            super(title, publicationYear);

            this.name = name;
            this.bio = bio;
        }

        // Method overriding
        // Author provides its own version of displayInfo()
        @Override
        void displayInfo() {

            // Call parent's displayInfo() first
            super.displayInfo();

            System.out.println("Author: " + name);
            System.out.println("Bio: " + bio);
        }
    }

    public static void main(String[] args) {

        // Creating object of child class
        Author author = new Author(
                "Clean Code",
                2008,
                "Robert Martin",
                "Software engineering author"
        );

        // Child object can access inherited method
        author.displayInfo();
    }
}