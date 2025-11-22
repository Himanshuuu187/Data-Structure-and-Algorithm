public class Q7 {
    public static void main(String[] args) {
        int[] arr = {4,3,8,5,0};
        int rot = frc(arr);
        System.out.println(rot);
    }

    static int frc(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid]>arr[e]){
                s = mid + 1;

            }else if(arr[mid]<arr[e]){
                e = mid;
            }else{
                e--;
            }
        }
        return s;
    }
    
}
