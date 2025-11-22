public class binarySearch{
    public static void main(String[] args){
        int[] arr = {2,4,5,6,7,8,9};
        int target = 8;
        int result = bnr(arr,target);
        System.out.println(result);

    }
    static int bnr(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(target == arr[mid]){
                return mid;
            }
            
            if(arr[mid]>target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return -1;
    }
}