package Inheritance.MultilevelInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Create a multilevel order hierarchy:
 * Order -> ShippedOrder -> DeliveredOrder.
 */

public class OnlineRetailOrder {

    // Level 1: Parent class
    static class Order {

        int orderId;
        String orderDate;

        Order(int orderId, String orderDate) {
            this.orderId = orderId;
            this.orderDate = orderDate;
        }

        // Common order status
        String getOrderStatus() {
            return "Order Placed";
        }
    }

    // Level 2: ShippedOrder inherits Order
    static class ShippedOrder extends Order {

        String trackingNumber;

        ShippedOrder(int orderId,
                     String orderDate,
                     String trackingNumber) {

            // Calls Order constructor
            super(orderId, orderDate);

            this.trackingNumber = trackingNumber;
        }

        // Override status
        @Override
        String getOrderStatus() {
            return "Order Shipped";
        }
    }

    // Level 3: DeliveredOrder inherits ShippedOrder
    static class DeliveredOrder extends ShippedOrder {

        String deliveryDate;

        DeliveredOrder(int orderId,
                       String orderDate,
                       String trackingNumber,
                       String deliveryDate) {

            // Calls ShippedOrder constructor
            super(orderId, orderDate, trackingNumber);

            this.deliveryDate = deliveryDate;
        }

        // Override status again
        @Override
        String getOrderStatus() {
            return "Order Delivered";
        }

        // Display complete order information
        void displayOrder() {

            System.out.println("Order ID: " + orderId);
            System.out.println("Order Date: " + orderDate);
            System.out.println(
                    "Tracking Number: " + trackingNumber
            );
            System.out.println(
                    "Delivery Date: " + deliveryDate
            );
            System.out.println(
                    "Status: " + getOrderStatus()
            );
        }
    }

    public static void main(String[] args) {

        // Creating object of lowest-level child
        DeliveredOrder order =
                new DeliveredOrder(
                        1001,
                        "01-10-2026",
                        "TRK12345",
                        "04-10-2026"
                );

        order.displayOrder();
    }
}