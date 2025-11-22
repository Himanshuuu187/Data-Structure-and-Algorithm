
//                       Reverse of a Number

public class Q8 {
    
    static int sum = 0;
    public static void Rev(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        Rev(n/10);

    }
    
    
    public static void main(String[] args){
        Rev(151);
        System.out.println(sum);
    }
    
    
}
