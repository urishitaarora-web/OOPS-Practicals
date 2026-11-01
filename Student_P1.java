// Practical 1: Classes and Objects
class Student {
    int rollNo;
    String name;
    int m1, m2, m3;

    Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int calculateTotal() {
        return m1 + m2 + m3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total      : " + calculateTotal());
        System.out.println("Percentage : " + String.format("%.2f", calculatePercentage()) + "%");
        System.out.println("---------------------------");
    }
}

public class Student_P1 {
    public static void main(String[] args) {
        // OBJECTS: s1, s2, s3
        Student s1 = new Student(1, "Urishita", 95, 97, 90);
        Student s2 = new Student(2, "Vidhi", 88, 92, 90);
        Student s3 = new Student(3, "Sneha", 95, 90, 94);

        s1.display();
        s2.display();
        s3.display();
    }
}