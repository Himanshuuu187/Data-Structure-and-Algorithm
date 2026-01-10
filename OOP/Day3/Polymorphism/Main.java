package OOP.Day3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        shapes triangle = new shapes();
        shapes sqr = new shapes();


        shape.area();
        triangle.area();
        sqr.area();
    }
    
}
