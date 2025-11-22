/*
public class Numbers{
    public static void main(String[] args){
        print(1);
    }
    public static void print(int n){
        System.out.println(n);
        print1(2);
    }
    public static void print1(int n){
        System.out.println(n);
        print2(3);
    }
    public static void print2(int n){
        System.out.println(n);
        print3(4);
    }
    public static void print3(int n){
        System.out.println(n);
        print4(5);
    }
    public static void print4(int n){
        System.out.println(5);
        
    }
}
  
*/

public class Numbers{
    public static void main(String[] args){
        print(10);
    }
    public static void print(int n){
        
        
        if(n==1){
            System.out.println(1);

            return;
            
        }
        System.out.println(n);
        print(n - 1);

        
    }
}



