public class Q10{
    public static void main(String[] args){
        pattern(5);
    }
    public static void pattern(int n){
        for(int row = 0;row<=n;row++){
            int a = row;
            int spaces = n - a;
            for(int s = 0;s<spaces;s++){
                System.out.print("  ");
            }
            for(int col = 0;col<=a;col++){
                System.out.print("  * ");
            }
            System.out.println();
        }
    }
}

/*
            * 
          *   * 
        *   *   * 
      *   *   *   * 
    *   *   *   *   * 
  *   *   *   *   *   * 

  */