import app.Electronics;
import app.Food;
import app.Product;

public class Main {
    public static void main(String[] args) {
        Product.welcomeMessage();

        // Create a Food object
        Food food = new Food("Apple", 1.99, 10, "2024-12-31");
        System.out.println("_______________________");
        System.out.println("Food Product:");
        food.displayInfo();

        // Update the quantity of the Food object
        food.updateQuantity(20);
        System.out.println("_______________________");
        System.out.println("Updated Food Product:");
        food.displayInfo();

        // Create an Electronics object
        Electronics electronics = new Electronics("Laptop", 999.99, 5, "Dell", 2);
        System.out.println("_______________________");
        System.out.println("\nElectronics Product:");
        electronics.displayInfo();

        // Update the quantity of the Electronics object
        electronics.updateQuantity(10);
        System.out.println("_______________________");
        System.out.println("Updated Electronics Product:");
        electronics.displayInfo();

        // Create a Product object (not recommended, but for demonstration purposes)
        Product product = new Product("Generic Product", 9.99, 20);
        System.out.println("_______________________");
        System.out.println("\nGeneric Product:");
        product.displayInfo();

        // Update the quantity of the Product object
        product.updateQuantity(30);
        System.out.println("_______________________");
        System.out.println("Updated Generic Product:");
        product.displayInfo();
    }
}
