
/* 

public class Q2{
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int result = floor(arr, target);
        if(result == -1){
            System.out.println("Doesn\'t Exists");
        }else{
            System.out.println(result);
        }                                                                   
    }

    static int floor(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        int flor = -1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                s = mid + 1;
                flor = arr[mid];
            }else{
                e = mid - 1;
            }
        }
        return flor;
    }
}

*/




public class Q2{
    public static void main(String[] args) {
        int[] arr = {12,11,8,5,4,3,2};
        int target = 10;
        int result = flr(arr, target);
        System.out.println(result);



    }

    public static int flr(int[] arr,int target){

        int floor = -1;
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid]<target){

                e = mid - 1;
                floor = arr[mid];

            }else{
                s = mid + 1;
            }
        }
        return floor;
    }
}