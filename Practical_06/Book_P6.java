// Practical 6: Default, Parameterized, and Copy Constructors

class Book {
    String title;
    String author;
    double price;

    // 1. No-argument constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // 2. Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 3. Copy constructor
    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Book_P6 {
    public static void main(String[] args) {
        Book b1 = new Book();                                   
        Book b2 = new Book("Java Basics", "James Gosling", 450); 
        Book b3 = new Book(b2);                                 

        System.out.println("Objects created");
        System.out.print("b1 (default)       : ");
        b1.display();
        System.out.print("b2 (parameterized) : ");
        b2.display();
        System.out.print("b3 (copy of b2)    : ");
        b3.display();

        b3.title = "Advanced Java";
        b3.price = 700;

        System.out.println("\nAfter modifying b3");
        System.out.print("b2 (original)      : ");
        b2.display();
        System.out.print("b3 (modified copy) : ");
        b3.display();
    }
}