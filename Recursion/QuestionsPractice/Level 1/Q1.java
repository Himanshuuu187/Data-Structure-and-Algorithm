
//     Q  ----->         N to 1


public class Q1{
    public static void main(String[] args){
        fnd(5);
    }
    public static void fnd(int n){
        if(n == 0){
            return;    // return is used to come out of the function
        }
        System.out.println(n);
        fnd(n - 1);
    }
}