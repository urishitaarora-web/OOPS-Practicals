// Practical 3: Hybrid and Multiple Inheritance Using Interfaces
interface Printable {
    void print();
}
interface Scannable {
    void scan();
}

// 1. MULTIPLE INHERITANCE via interfaces 
class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("AllInOnePrinter: Printing a document...");
    }

    public void scan() {
        System.out.println("AllInOnePrinter: Scanning a document...");
    }
}

// 2. HYBRID INHERITANCE
class Device {
    String model;
    Device(String model) {
        this.model = model;
    }
    void powerOn() {
        System.out.println(model + " is powered ON.");
    }
}

class SmartOfficeMachine extends Device implements Printable, Scannable {
    SmartOfficeMachine(String model) {
        super(model);
    }
    public void print() {
        System.out.println(model + ": Printing a report...");
    }
    public void scan() {
        System.out.println(model + ": Scanning an image...");
    }
}

public class Interface_P3 {
    public static void main(String[] args) {
        System.out.println("\n Multiple Inheritance (Interfaces) ");
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println("\n Hybrid Inheritance ");
        SmartOfficeMachine machine = new SmartOfficeMachine("HP-X200");
        machine.powerOn(); 
        machine.print();   
        machine.scan();    

        System.out.println("\n Using interface references ");
        Printable p = machine;
        Scannable s = machine;
        p.print();
        s.scan();
    }
}