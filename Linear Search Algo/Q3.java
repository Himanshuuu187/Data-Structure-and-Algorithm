
//                                           Finding the Minimum Element Value

/* 
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {12,-56,45,85,75};
        int min = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                break;
            }
        }
        System.out.println(min);
    }
}
*/


//      Finding the maximum element

public class Q3{
    public static void main(String[] args) {
        int[] arr = {4,2,6,7,8,9};
        System.out.println(maxEle(arr));

    }

    static int maxEle(int[] arr){
        int max = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}















