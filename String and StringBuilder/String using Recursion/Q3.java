public class Q3{
    public static void main(String[] args){
        System.out.println(SkipNotApple("bbappecc"));


    }
    public static String SkipNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if( up.startsWith("app") && !up.startsWith("apple")){
            return SkipNotApple(up.substring(3));
        }else{
            return up.charAt(0) + SkipNotApple(up.substring(1));
        }
    }
}