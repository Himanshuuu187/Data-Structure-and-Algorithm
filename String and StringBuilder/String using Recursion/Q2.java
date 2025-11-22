public class Q2{
    public static void main(String[] args){
        System.out.println(SkipApple("bbapplecc"));
// 
// 
    }
    public static String SkipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return SkipApple(up.substring(5));
        }else{
            return up.charAt(0) + SkipApple(up.substring(1));
        }
    }
}
// 


// public class Q2{
    // public static void main(String[] args){
        // String fruit = "apple";
        // System.out.println(skipApple("apple"));
    // }
// 
    // public static String skipApple(String fr){
        // if(fr.isEmpty()){
            // return "";
        // }
// 
        // if(fr.startsWith("apple")){
            // return skipApple(fr.substring(5));
        // }else{
            // return fr.charAt(0) + skipApple(fr.substring(1));
        // }
    // }
// }