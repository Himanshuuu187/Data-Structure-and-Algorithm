package OOP.Day3.Polymorphism;

public class MethodOverloading {

    int sum(int a,int b){
        return a + b;

    }

    int sum(int a,int b,int c){
        return a + b + c;
    }
    

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        System.out.println(m1.sum(2,3));
        System.out.println(m1.sum(2,3,5));
    }
}
