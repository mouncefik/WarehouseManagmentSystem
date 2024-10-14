package app;

public class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public void displayInfo(){
        System.out.println("Product name : " + name );
        System.out.println("Product price : " + price );
        System.out.println("Quantity : " + quantity );
    }

    public void updateQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

//overloading

    public void updateQuantity(int addedQuantity, boolean addToExisting){
        if (addToExisting) {
            this.quantity += addedQuantity;
        } else {
            this.quantity = addedQuantity;
        }
    }


    public double getPrice() {
        return price;
    }
    public static void welcomeMessage(){
        System.out.println("Welcome to the Inventory System!");
    }

}


