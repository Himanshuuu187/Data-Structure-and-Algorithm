/*
package OOP.Day3.Polymorphism;


class Parent {
    static void show() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    // @Override
    // void show() {
        // System.out.println("This is Child class");
    // }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();  // upcasting
        obj.show();                // Child's method is called
    }
}
*/


package OOP.Day3.Polymorphism;

class A{
    public void show(){
        System.out.println("I am in A");
    }
}

class B extends A{
    @override               // This is just a annotation which is given above the method when we override 
    public void show(){
        System.out.println("I am in B");
    }
}

public class MethodOverriding{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}




