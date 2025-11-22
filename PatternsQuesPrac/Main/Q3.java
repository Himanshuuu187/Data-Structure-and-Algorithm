 

public class Q3{
    public static void main(String[] args){
        pattern(4);
    }
    public static void pattern(int n){
        for(int row = 1;row<=n;row++){
            for(int col =1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}





    










