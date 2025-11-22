 
// public class Q3{
    // public static int[] posn(int[] arr,int target){
        // int low = 0;
        // int high = arr.length - 1;
        // int mid;
        // int[] res = {-1,-1};
// 
        // while(low<=high){
            // mid = (low + high)/2;
// 
            // if(target == arr[mid]){
                // res[0] = mid;
                // high = mid - 1;
// 
            // }else if(arr[mid]<target){
                // low = mid + 1;
            // }else{
                // high = mid - 1;
            // }
        // }
        // return res;
    // }
// 
    // public static void main(String[] args) {
        // int[] arr = {5,7,7,8,8,10};
        // int target = 8;
        // int[] result = posn(arr, target);
        // System.out.println(result[0] + result[1]);
    // }
// }
    

   
   

    public class Q3 {
    
    // Helper to find left or right position
    public static int binarySearch(int[] arr, int target, boolean findFirst) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1; // keep searching left
                } else {
                    low = mid + 1; // keep searching right
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static int[] posn(int[] arr, int target) {
        int first = binarySearch(arr, target, true);
        int last = binarySearch(arr, target, false);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 10;
        int[] result = posn(arr, target);
        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position: " + result[1]);
    }
}




