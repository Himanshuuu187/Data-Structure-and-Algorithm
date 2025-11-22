
public class Q1{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 18;
        int answer = Agno(arr,target);

        System.out.println(arr[answer]);
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



