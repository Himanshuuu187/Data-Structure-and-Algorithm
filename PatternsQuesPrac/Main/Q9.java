public class Q9{
    public static void main(String[] args){
        pattern(5);
    }
    public static void pattern(int n){
        n=2*n;
        for(int row = 0;row<=n;row++){
            for(int col = 0;col<=n;col++){
                int Index = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(Index);
            }
            System.out.println();
        }
    } 
}

/*
 
00000000000
01111111110
01222222210
01233333210
01234443210
01234543210
01234443210
01233333210
01222222210
01111111110
00000000000

 */