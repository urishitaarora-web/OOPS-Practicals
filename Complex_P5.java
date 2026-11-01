// Practical 5: Simulating Operator Overloading Using Methods in Java

class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real,
                                 this.imaginary + other.imaginary);
    }

    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Complex_P5 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, -2);

        ComplexNumber sum = c1.add(c2);

        System.out.print("First number  : ");
        c1.display();
        System.out.print("Second number : ");
        c2.display();
        System.out.print("Sum           : ");
        sum.display();
    }
}