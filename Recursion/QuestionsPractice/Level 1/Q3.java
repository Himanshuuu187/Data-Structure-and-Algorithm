
//       Q   ----------->     [N to 1]  and  [ 1 to N]


public class Q3 {
    public static void main(String[] args){
        Final(5);
    }
    public static void Final(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Final(n - 1);
        System.out.println(n);
    }
    
}
