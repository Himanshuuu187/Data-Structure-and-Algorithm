
package OOP;

public class static1{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public static1(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        static1.population += 1;
    }
}
