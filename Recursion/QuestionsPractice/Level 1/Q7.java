//       Product of digit

public class Q7 {
    public static void main(String[] args){
        System.out.println(pm(1342));
    }
    public static int pm(int n){
        if(n == 0){
            return 1;
        }
        return n%10 * pm(n/10);
    }
    
}