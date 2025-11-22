

//            Q ------>    [1 to n]


public class Q2 {
    public static void main(String[] args) {
        fndRev(5);
    }
    public static void fndRev(int n){
        if(n == 0){
            return;
        }
        fndRev(n - 1);
        System.out.println(n);
    }
    
}
