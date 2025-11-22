//                                        Missing Number

public class Q1{
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int element = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] != i){
                element = i;
                break;
            }
        }
        if(element == -1){
            System.out.println("All elements are present");
        }else{
            System.out.println(element);
        }
        
       
    }
}
