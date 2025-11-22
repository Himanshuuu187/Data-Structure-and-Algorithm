
/*                           Count Occurrence of Element

                             arr = [2,4,4,6,7,8,9]

                             target = 4

                             output = 2






*/



public class Q10{
    public static void main(String[] args) {
        
        int[] arr = {2,4,4,6,7,8,9};
        int target = 4;

        int result = ab(arr, target);

        System.out.println(result);


    }

    static int ab(int[] arr,int target){

        int first = fc(arr,target);
        int last = lc(arr,target);

        if(first == -1){
            return 0;
        }

        return last - first + 1;
    }

    static int fc(int[] arr,int target){

        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(arr[mid] == target){

                ans = mid;
                e = mid - 1;

            }else if(arr[mid]<target){

                s = mid + 1;
            }else{

                e = mid - 1;
            }
        }
        return ans;
    }


      static int lc(int[] arr,int target){

        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(arr[mid] == target){

                ans = mid;
                s = mid + 1;

            }else if(arr[mid]<target){

                s = mid + 1;
            }else{

                e = mid - 1;
            }
        }
        return ans;
    }
}