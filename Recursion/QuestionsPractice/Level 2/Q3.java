//                                           Returning an Array List


 
import java.util.ArrayList;

public class Q3{
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        ArrayList<Integer> ans = fin(arr,4,0,new ArrayList<>());
        System.out.println(ans);
        
        
    }
    public static ArrayList<Integer> fin(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index ]== target){
            list.add(index);
        }
        return fin(arr, target,index + 1,list);
    }
}


















