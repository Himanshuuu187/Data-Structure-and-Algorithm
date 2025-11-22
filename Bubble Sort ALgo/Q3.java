import java.util.Arrays;

public class Q3 {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            for(int j = 1;j<arr.length - i;j=j+2){
                if(arr[j]>arr[j+2]){
                    int temp = arr[j];
                    arr[j+2] = arr[j];
                    arr[j] = temp;
                    swapped = true;

                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
    
}
