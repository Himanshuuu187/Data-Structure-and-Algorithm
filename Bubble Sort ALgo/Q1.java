
// // /*
// //                                                    BUBBLE SORT ALGORITHM 

// //  */



import java.util.Arrays;
// 
// 
public class Q1{
    public static void main(String[] args){
        int[] arr = {5,4,8,7,3,2};
        // 
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
// 
    }
// 
    static void BubbleSort(int[] arr){
        boolean Swapped = false;
        for(int i = 0;i<arr.length;i++){
            // Swapped = false;
            for(int j = 1;j<arr.length - i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    Swapped = true;
                }
            } 
            if(!Swapped){
            break;
        }
            // 
        }
        // 
// 
        // 
        // 
    }
}
// 
// 
// 



// import java.util.Arrays;
// 
// public class Q1{
    // public static void main(String[] args) {
        // 
        // int[] arr = {5,4,8,7,3,2};
        // bbl(arr);
        // System.out.println(Arrays.toString(arr));
    // }
// 
    // static void bbl(int[] arr){
// 
        // boolean swp = false;
// 
        // for(int i = 0;i<arr.length - 1;i++){
            // swp = false;
            // for(int j = 1;j<arr.length - 1;j++){
                // if(arr[j]<arr[j-1]){
                    // int temp = arr[j];
                    // arr[j] = arr[j - 1];
                    // arr[j-1] = temp;
                    // swp = true;
                // }
            // }
            // if(!swp){
                // break;
            // }
        // }
        // 
        // 
        // 
    // }
// }
// 
// 
























