
/*
 * Question:
 * Build a generic product catalog for Books, Clothing, and Gadgets.
 * Support multiple product categories and apply discounts dynamically.
 *
 * Hint:
 * Create Product<T> with a bounded category type.
 * Use a generic method to apply discounts to products.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */

package JavaGenerics.AssignmentsOfJavaGenerics.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

// Common interface for all product categories.
interface ProductCategory {
    String getCategoryName();
}

// Category for books.
class BookCategory implements ProductCategory {
    // Method to handle get category name operations
    public String getCategoryName() {
        return "Books";
    }
}

// Category for clothing.
class ClothingCategory implements ProductCategory {
    // Method to handle get category name operations
    public String getCategoryName() {
        return "Clothing";
    }
}

// Category for gadgets.
class GadgetCategory implements ProductCategory {
    // Method to handle get category name operations
    public String getCategoryName() {
        return "Gadgets";
    }
}

// T must implement ProductCategory.
class Product<T extends ProductCategory> {
    private int id;
    private String name;
    private double price;
    private T category;

    public Product(int id, String name, double price, T category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Method to handle get price operations
    public double getPrice() {
        return price;
    }

    // Method to handle set price operations
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to handle get name operations
    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    // Method to handle display operations
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category.getCategoryName());
        System.out.printf("Price: %.2f%n", price);
    }
}

// A generic catalog can hold products from different categories.
class ProductCatalog {
    private List<Product<? extends ProductCategory>> products =
            new ArrayList<>();

    // Method to handle add product operations
    public void addProduct(Product<? extends ProductCategory> product) {
        products.add(product);
    }

    // Method to handle display products operations
    public void displayProducts() {
        for (Product<? extends ProductCategory> product : products) {
            product.display();
            System.out.println();
        }
    }
}

public class DynamicOnlineMarketplace {

    // The method accepts products whose category type is valid.
    public static <T extends ProductCategory> void applyDiscount(
            Product<T> product, double percentage) {

        // Reject discounts outside the valid percentage range.
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage.");
            return;
        }

        // Calculate the discounted price.
        double discount = product.getPrice() * percentage / 100;

        // Update the product price.
        product.setPrice(product.getPrice() - discount);

        System.out.println(percentage + "% discount applied to "
                + product.getName());
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {

        // Create products with different category types.
        Product<BookCategory> b =
                new Product<>(1, "Java Programming", 800,
                        new BookCategory());

        Product<ClothingCategory> c =
                new Product<>(2, "T-Shirt", 600,
                        new ClothingCategory());

        Product<GadgetCategory> g =
                new Product<>(3, "Wireless Mouse", 1200,
                        new GadgetCategory());

        // Create a catalog that can store all these product types.
        ProductCatalog catalog = new ProductCatalog();

        // Add each product to the catalog.
        catalog.addProduct(b);
        catalog.addProduct(c);
        catalog.addProduct(g);

        // Apply different discounts.
        applyDiscount(b, 10);
        applyDiscount(c, 15);
        applyDiscount(g, 5);

        // Display the updated catalog.
        System.out.println("\nUpdated Product Catalog:");
        catalog.displayProducts();
    }
}
