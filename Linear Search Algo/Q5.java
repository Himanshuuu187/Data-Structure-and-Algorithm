
public class Q5 {
    public static void main(String[] args) {
        int[][] arr = {{2,34,45},{12,456,67},{56,25,1}};
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i].length%2==0){
                    count++;

                }

            }
           
            
        }
        System.out.println("The Number of Even Number of digits are: " + count);
    }
}
    


