public class Q5{
    static int PeakIndex(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid]>arr[mid+1]){
                e = mid;
            }else{
                s = mid + 1;
            }

        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int PI = PeakIndex(arr);
        System.out.println(arr[PI]);
    }
}