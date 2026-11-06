// Practical 2: Single, Multilevel, and Hierarchical Inheritance
// 1. SINGLE INHERITANCE
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showVehicle() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void showCar() {
        showVehicle(); 
        System.out.println("Doors: " + doors);
    }
}

//2. MULTILEVEL INHERITANCE
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    int empId;
    double salary;

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    void showEmployee() {
        showPerson(); 
        System.out.println("Emp ID: " + empId + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary);
        this.department = department;
    }

    void showManager() {
        showEmployee();
        System.out.println("Department: " + department);
    }
}

// 3. HIERARCHICAL INHERITANCE
class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Inheritance_P2 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        Car car = new Car("Toyota", 180, 4);
        car.showCar();

        System.out.println("\nMultilevel Inheritance");
        Manager m = new Manager("Ravi", 40, 101, 75000.0, "Sales");
        m.showManager();

        System.out.println("\nHierarchical Inheritance");
        Circle c = new Circle("Red", 5);
        c.showColor();
        System.out.println("Circle Area: " + String.format("%.2f", c.area()));

        Rectangle r = new Rectangle("Blue", 4, 6);
        r.showColor();
        System.out.println("Rectangle Area: " + r.area());
    }
}