// Practical 4: Method Overloading and Method Overriding

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class Polymorphism_P4 {
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        Calculator calc = new Calculator();
        System.out.println("add(10, 20)       = " + calc.add(10, 20));
        System.out.println("add(10, 20, 30)   = " + calc.add(10, 20, 30));
        System.out.println("add(5.5, 4.5)     = " + calc.add(5.5, 4.5));

        System.out.println("\nMethod Overriding (base-class reference)");
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(300, 80);

        System.out.println("Full-time pay : " + e1.calculatePay());
        System.out.println("Part-time pay : " + e2.calculatePay());
    }
}