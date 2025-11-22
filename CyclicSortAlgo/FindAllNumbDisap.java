// import java.util.*;
// public class FindAllNumbDisap{
//     public static void main(String[] args){
//         int[] arr = {4,3,2,7,8,2,1};
//         System.out.println(FindAll(arr));
//     }
//     public static List<Integer> FindAll(int[] arr){
//         int i = 0;
//         while(i<arr.length){
//             int correct = arr[i] - 1;
//             if(arr[i] <arr.length && arr[i] != arr[correct]){
//                 swap(arr,i,correct);
//             }else{
//                 i++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         for(int index = 0;index<arr.length;index++){
//             if(arr[index] != (index + 1)){
//                 ans.add((index + 1));
//             }
//         }
//         return ans;
//     }
//     static void swap(int[] arr,int first,int second){
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }





import java.util.*;

public class FindAllNumbDisap{
    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,1};
        
        System.out.println(FindAll(arr));

    }

    public static List<Integer> FindAll(int[] arr){

        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> newList = new ArrayList<>();
        for(int index = 0;index<arr.length;index++){
            if(arr[index]!=(index+1)){
                newList.add(index+1);
            }
        }
        return newList;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}