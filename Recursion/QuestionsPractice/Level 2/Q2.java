
// //                                               Linear Search

// public class Q2{
//     public static void main(String[] args) {
//         int[] arr = {5,4,3,2,1};
//         System.out.println(LSearch(arr,4, 0));
//         // System.out.println(Fnd(arr,4,0));
        
//     }
//     public static boolean LSearch(int[] arr,int target,int index){
//         if(index == arr.length){
//             return false;
//         }
//         return arr[index] == target || LSearch(arr, target, index + 1);
//     }
//     // public static int Fnd(int[] arr,int target,int index){
//         // if(index == arr.length){
//             // return -1;
//         // }
//         // if(arr[index] == target){
//             // return index;
//         // }else{
//             // return Fnd( arr, target, index + 1);
//         // }
//     // }
// }



public class Q2{
    public static void main(String[] args) {

        int[] arr = {5,2,1,4,6};
        int target = 4;
        System.out.println(LS(arr,target,0));
        
    }
    public static int LS(int[] arr,int target,int s){

        boolean Linear;
        if(s==arr.length){
            Linear = false;
            


        }
        
        if(arr[s]==target){
            Linear = true;
            
        }else{
            return LS(arr,target,s+1);
        }

        return Linear;
    
    
    
    }
}