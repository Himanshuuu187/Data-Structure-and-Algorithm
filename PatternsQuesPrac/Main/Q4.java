/* 

public class Q4{
    public static void main(String[] args){
        pattern(4);
    }
    public static void pattern(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
      
    }
}
*/



public class Q4{
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}