
package OOP;

// this is a demo to show initialisation of static variables
public class static3 {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        static3 obj = new static3();
        System.out.println(static3.a + " " + static3.b);

        static3.b += 3;

        System.out.println(static3.a + " " + static3.b);

        static3 obj2 = new static3();
        System.out.println(static3.a + " " + static3.b);
    }

}
