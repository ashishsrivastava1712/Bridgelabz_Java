/*
 * Author: Ashish Srivastava
 * Problem Description: Create a HotelBooking class with attributes
 * guestName, roomType, and nights. Use default, parameterized, and
 * copy constructors to initialize bookings.
 */

class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 0;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Method to display booking details
    void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {

        HotelBooking defaultBooking = new HotelBooking();

        HotelBooking booking =
                new HotelBooking("Ashish", "Deluxe", 3);

        HotelBooking copiedBooking =
                new HotelBooking(booking);

        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println("\nParameterized Booking:");
        booking.displayBooking();

        System.out.println("\nCopied Booking:");
        copiedBooking.displayBooking();
    }
}