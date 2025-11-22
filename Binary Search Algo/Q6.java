

public class Q6 {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        int ans = Ceiling(arr,target);
        if(ans == 1){
            System.out.println("Doesn\'t Exists");
        }else{
            System.out.println(arr[ans]);
        }
    }

    static int Ceiling(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;

        if(target>arr[e]){
            return -1;
        }

        while(s<=e){
            int mid = s + (e - s)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
            
        }
        return s;
    }
    
}




// public class Q6{
    // public static void main(String[] args) {
        // 
        // int[] arr = {2,4,5,6,7,8,9};
        // int target = 12;
        // int ans = seiling(arr, target);
// 
        // if(ans == -1){
            // System.out.println("Element does not exists");
        // }else{
            // System.out.println(arr[ans]);
        // }
// 
    // }
// 
    // static int seiling(int[] arr,int target){
// 
        // int s = 0;
        // int e = arr.length - 1;
// 
        // if(target>arr[e]){
            // return -1;
        // }
// 
        // while(s<=e){
            // 
            // int mid = s + (e-s)/2;
// 
            // if(arr[mid]<target){
                // s = mid + 1;
// 
            // }else{
                // e = mid - 1;
            // }
        // }
        // return s;
    // }
// }