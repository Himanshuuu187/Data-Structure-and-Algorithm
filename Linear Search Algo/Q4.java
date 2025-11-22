public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {{2,34,45},{12,456,67}};
        int min = arr[0][0];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    break;
                }
            }
        }
        System.out.println(min);
    }
    
}
