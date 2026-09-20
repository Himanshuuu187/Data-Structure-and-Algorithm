import java.util.Arrays;


public class SJF {
    public int sjf(int[] arr){

        Arrays.sort(arr);
        int time = 0,WTtime =0;
        for(int i = 0;i<=arr.length-1;i++){
            WTtime = time;
            time+= arr[i];
        }

        return (WTtime/time);

    }
    
}
