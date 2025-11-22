/* 
public class Agnostic{
    public static void main(String[] args) {
        int[] arr = {45,34,23,18,13,3,2,1};
        int target = 18;
        int answer = Agno(arr,target);
        System.out.println(answer);
    }

    public static int Agno(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target<arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}
*/

// public class Agnostic{
    // public static void main(String[] args){
        // int[] arr = {45,34,23,18,13,3,2,1};
        // int target = 18;
        // int answer = odbs(arr,target);
        // System.out.println(answer);
    // }
// 
    // static int odbs(int[] arr,int target){
        // int s = 0;
        // int e = arr.length - 1;
        // boolean isAsc;
        // if(arr[s]<arr[e]){
            // isAsc = true;
        // }else{
            // isAsc = false;
        // }
// 
        // while(s<=e){
            // int mid = s + (e-s)/2;
// 
            // if(arr[mid] == target){
                // return mid;
            // }
            // if(isAsc){
                // if(target<arr[mid]){
                    // e = mid - 1;
                // }else{
                    // s = mid + 1;
                // }
            // }else{
                // if(target<arr[mid]){
                    // s = mid + 1;
                // }else{
                    // e = mid - 1;
                // }
            // }
        // }
        // 
        // return -1;
    // }
// 
// 
// }







































