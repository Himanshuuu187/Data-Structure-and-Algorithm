
/* 
public class Q4{
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    public static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int NewStart = end + 1;
            end = end + (end - start + 1)*2;
            start = NewStart;

        }
        return Binary(arr,target,start,end);
    }

    public static int Binary(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
}
*/



public class Q4{
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
        
    }

    static int ans(int[] arr,int target){

        int s = 0;
        int e = 1;
        while(target>arr[e]){
            int ns = e + 1;
            e = e + (e - s + 1)*2;
            s = ns;
        }

        return bs(arr,target,s,e);
    }

    static int bs(int[] arr,int target,int start,int end){

        

        while(start<=end){
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){

                start = mid + 1;
            }else{

                end = mid - 1;
            }

            


        }
        return -1;
        

    }
}

