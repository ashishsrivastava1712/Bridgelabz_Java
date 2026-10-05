package ObjectModelling.Modelling;

import java.util.ArrayList;

/*
 * Author: Ashish
 * Problem Description: Demonstrate association between Customer and Order
 * and aggregation between Order and Product.
 */

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayOrder() {

        System.out.println("Order ID: " + orderId);

        for (Product product : products) {
            System.out.println(
                    product.productName +
                            " - ₹" + product.price
            );
        }
    }
}

class EcommerceCustomer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    EcommerceCustomer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);

        System.out.println(
                name + " placed Order " + order.orderId
        );
    }
}

public class EcommerceAssociationAggregation {
    public static void main(String[] args) {

        EcommerceCustomer customer = new EcommerceCustomer("Ashish");

        Product laptop = new Product("Laptop", 60000);
        Product mouse = new Product("Mouse", 1000);

        Order order = new Order(101);

        order.addProduct(laptop);
        order.addProduct(mouse);

        customer.placeOrder(order);

        order.displayOrder();
    }
}