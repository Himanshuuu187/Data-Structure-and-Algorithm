public  class Q9{
    static int[] flpn(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        int mid;
        int[] res = {-1,-1};

        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid] == target){
                res[0] = mid;
                e = mid - 1;
                
            }else if(arr[mid]<target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        s = 0;
        e = arr.length - 1;
        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid] == target){
                res[1] = mid;
                s = mid + 1;
            }else if(arr[mid]<target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = flpn(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}