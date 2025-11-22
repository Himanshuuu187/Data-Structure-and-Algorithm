/*
public class Q1{
    public static void main(String[] args){

        int arr[] = {2,5,6,7,8};
        int target = 5;
        boolean found = false;;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Element Exists");
        }else{
            System.out.println("Element do not exist");
        }

    }
    
}
    */





    public class Q1{
    public static void main(String[] args){
        int[] arr = {3,5,2,6,7};
        int target = 6;
        lns(arr,target);
       

    }

    static void lns(int[] arr,int target){
        boolean a = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                a = true;
                break;
            }
        }if(a){
            System.out.println("Element Exists");
        }else{
            System.out.println("Element do not exist");
        }

    }
}