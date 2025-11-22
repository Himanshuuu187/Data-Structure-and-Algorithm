import java.util.Arrays;


public class Q4{
    public static void main(String[] args){
        int[] arr = {1,2,  3,4,5};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int[] arr){
        boolean Swapped;
        for(int i = 0;i<arr.length;i++){
            Swapped = false;
            for(int j = 1;j<arr.length - i;j++){
                if(arr[j]>arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    Swapped = true;
                }
            } 
            if(!Swapped){
            break;
        }
            
        }
        

        
        
    }
}
    

   

/*
public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5};
        reverseSortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseSortedArray(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) { // descending order
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // already reversed
        }
    }
}
*/