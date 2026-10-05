package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Manage different library items using abstraction,
 * interfaces, encapsulation and polymorphism.
 */

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract int getLoanDuration();
}

interface Reservable {

    void reserveItem();

    boolean checkAvailability();
}

class LibraryBook extends LibraryItem implements Reservable {

    private boolean available = true;

    LibraryBook(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem() {
        available = false;
        System.out.println("Magazine reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {

    private boolean available = true;

    DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        available = false;
        System.out.println("DVD reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(
                new LibraryBook(101, "Java Programming", "James Gosling")
        );

        items.add(
                new Magazine(102, "Tech Today", "Tech Editorial")
        );

        items.add(
                new DVD(103, "Java Tutorial", "Programming Team")
        );

        for (LibraryItem item : items) {

            item.getItemDetails();

            System.out.println(
                    "Loan Duration: "
                            + item.getLoanDuration()
                            + " days"
            );

            Reservable reservable = (Reservable) item;

            System.out.println(
                    "Available: "
                            + reservable.checkAvailability()
            );

            reservable.reserveItem();

            System.out.println("--------------------");
        }
    }
}