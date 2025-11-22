public class Q4{
    public static void main(String[]  args){
        sunseq("","abc");

    }

    public static void sunseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        sunseq(p + ch,up.substring(1));
        sunseq(p,up.substring(1));


    }
}
















