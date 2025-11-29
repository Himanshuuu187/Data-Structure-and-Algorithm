// public class Q9 {

    // public static int Rev(int n, int rev) {
        // if (n == 0) {
            // return rev;
        // }
        // int rem = n % 10;
        // return Rev(n / 10, rev * 10 + rem);
    // }

    // public static boolean palen(int n) {
        // return n == Rev(n, 0);
    // }

    // public static void main(String[] args) {
        // int num = 151;
        // if (palen(num)) {
            // System.out.println(num + " is a Palindrome.");
        // } else {
            // System.out.println(num + " is NOT a Palindrome.");
        // }
    // }
// }
// 


//                                              Second Approach


public class Q9{
    public static void main(String[] args) {
        rv(151);
        if(pln(152)){
            System.out.println("The Number is a palindrome");
        }else{
            System.out.println("Number is not a palindrome");
        }
        
    }

    static int sum = 0;
    public static void rv(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rv(n/10);

    }
    static boolean pln(int n){
        return (n == sum);
    }
}

