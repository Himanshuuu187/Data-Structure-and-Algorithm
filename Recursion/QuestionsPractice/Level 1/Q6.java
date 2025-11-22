
//       Sum of digit

public class Q6 {
    public static void main(String[] args){
        System.out.println(sm(1342));
    }
    public static int sm(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sm(n/10);
    }
    
}






 

 
 
 

 
 
 
 

 
 
