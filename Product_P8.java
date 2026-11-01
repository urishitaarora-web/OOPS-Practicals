// Practical 8: Constructor Overloading

class Product {
    String name;
    double price;
    int quantity;
    Product() {
        name = "Not Set";
        price = 0.0;
        quantity = 0;
    }

    Product(String name) {
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Name: " + name + ", Price: " + price
                + ", Quantity: " + quantity
                + ", Total Cost: " + calculateTotalCost());
    }
}

public class Product_P8 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Notebook", 50.0);
        Product p4 = new Product("Bag", 800.0, 3);

        System.out.print("No arguments       : ");
        p1.display();
        System.out.print("Name only          : ");
        p2.display();
        System.out.print("Name and price     : ");
        p3.display();
        System.out.print("Name, price, qty   : ");
        p4.display();
    }
}