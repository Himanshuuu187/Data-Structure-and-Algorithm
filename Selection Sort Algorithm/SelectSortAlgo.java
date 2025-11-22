import java.util.Arrays;

public class SelectSortAlgo{
    public static void main(String[] args) {
        int[] arr = {3,2,1,5};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int Max = getMax(arr,0,last);
            swap(arr,Max,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr,int start,int end){
        int max = start;
        for(int i = 0;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}


































