import java.util.Arrays;
public class cyclicsortinfg{
    public static void main(String[] args){
        int[] arr = {5,3,1,2,4};
        cyclicQ1sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int cyclicQ1sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct] && arr[i] < arr.length){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        return 0;
    }
    
    
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
































