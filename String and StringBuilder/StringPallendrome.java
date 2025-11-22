public class StringPallendrome{
    public static void main(String[] args){
        String a = "abcdcba";
        System.out.println(isPallendrome(a));
    }

    public static boolean isPallendrome(String str){
        for(int i = 0 ; i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
     
}