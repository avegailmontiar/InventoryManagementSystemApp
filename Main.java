import java.util.ArrayList;

class Product {
    // Private instance variables
    private String name;
    private double price;

    // Constructor to initialize the name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }
}

class InventoryManagementSystem {
   
    private ArrayList<Product> products;

   
    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    
    public void addProduct(String name, double price) {
       
        Product newProduct = new Product(name, price);
        products.add(newProduct);

       
        System.out.println("Product added: " + name + " - Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
      
        InventoryManagementSystem ims = new InventoryManagementSystem();

        
        ims.addProduct("Watch", 500.99);
        ims.addProduct("Television", 10000.49);
         ims.addProduct("keyboard", 2000.99);
        ims.addProduct("Printer", 3000.49);
    }
}
