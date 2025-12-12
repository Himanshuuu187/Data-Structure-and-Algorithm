public class OOP1{
    public static void main(String[] args) {

        Student Himanshu = new Student(56,"Ravi",89.2f);
        Student random = new Student(Himanshu);
        System.out.println(random.name);
        random.display();

        Himanshu.rollNo = 51;
        Himanshu.name = "Himanshu Jaiswal";
        Himanshu.marks = 12;

        System.out.println(Himanshu.rollNo);
        System.out.println(Himanshu.name);
        System.out.println(Himanshu.marks);
        

        Himanshu.display();

        Student s1 = new Student();
        s1.display();

        Student s1 = new Student();
        s1.display();

        Student one = new Student();
        Student two = one;
        one.name = "Rahul";
        System.out.println(two.name);


        
        
        
        
    }

}
class Student{
    int rollNo;
    String name; 
    float marks = 90.0f;

    //  To add other class and replace its contents
    Student  (Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }




    // Student(){
        // this.rollNo = 45;
        // this.name = "Ravi";
        // this.marks = 56.5f;

        // this(1,"Raju",89.4f);    // Replacement for the Above  
    // }



    // Student(int roll,String N,float m){
        // this.rollNo = roll;
        // this.name = N;
        // this.marks = m;
    // }

    // void display(){
        // System.out.println("Your Name is : " + this.name);
        // System.out.println("Your Roll No is : " + this.rollNo);
        // System.out.println("Your marks are : " + this.marks);
    // }
}


