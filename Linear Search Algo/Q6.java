/*
public class Q6{
    public static void main(String[] args){
        int[][] arr = {{2,4,5},{7,7},{1,5,6}};
        int result = maxRich(arr);

        System.out.println("The Richest Element is " + result);



    }

    public static int maxRich(int[][] arr){
        int wealth = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>wealth){
                wealth = sum;
            }
        }
        return wealth;
        
    }
}
    */


public class Q6{
    public static void main(String[] args){
        int[][] arr = {{1,5},{4,5,6},{1,2,89}};
        int wealth = 0;

        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            if(sum>wealth){
                wealth = sum;
            }
        }

        System.out.println(wealth);
    }
}