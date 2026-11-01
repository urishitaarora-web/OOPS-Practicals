// Practical 9: this Keyword, Constructor Chaining, and Static Members

class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Unknown", 0.0); // calls the parameterized constructor
        System.out.println("  (No-arg constructor called, chained to parameterized one)");
    }

    Employee(String name, double salary) {
        this.name = name;     
        this.salary = salary;
        count++;              
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    static void displayCount() {
        System.out.println("Total employees created: " + count);
    }
}

public class Employee_P9 {
    public static void main(String[] args) {
        System.out.println("Creating e1 (parameterized):");
        Employee e1 = new Employee("Asha", 45000);

        System.out.println("Creating e2 (parameterized):");
        Employee e2 = new Employee("Karan", 52000);

        System.out.println("Creating e3 (no-arg, uses this()):");
        Employee e3 = new Employee();

        System.out.println("\nEmployee Details:");
        e1.display();
        e2.display();
        e3.display();

        System.out.println();
        Employee.displayCount(); 
    }
}