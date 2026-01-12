package OOP.Day4;

public class A{
   //private int num;  // Helps in Hiding the Data. We can access it using Getters and Setters
    
    // public int num;  // This can be accessed outside the package as well if it is declared as public but if we do not declare it as public then we cab access it only within the package
    protected int num;
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }

    public void SetNum(int n){
        this.num = n;
    }

    public A(int n,String Name){
        this.num = n;
        this.name = Name;
        this.arr = new int[n];
    }

    public static void main(String[] args) {
        A obj1 = new A(45,"Karan");
        // int a = obj1.num;

        // System.out.println(obj1.getClass());

        
    }   
}