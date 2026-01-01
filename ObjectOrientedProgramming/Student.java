package ObjectOrientedProgramming;



public class Student {
    int rollNo;
    String name;
    float marks;

    public Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    public Student() {
        this.rollNo = 45;
        this.name = "Ravi";
        this.marks = 56.5f;
    }

    public Student(int roll, String name, float marks) {
        this.rollNo = roll;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Your Name is : " + name);
        System.out.println("Your Roll No is : " + rollNo);
        System.out.println("Your marks are : " + marks);
    }
}
