import java.util.ArrayList;
import java.util.Arrays;

class Q2 {
    public static void main(String[] args) {
        ArrayList<String> result = perm("", "abc");
        System.out.println(result);
    }

    public static ArrayList<String> perm(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(perm(f + ch + s, up.substring(1)));
        }

        return ans;
    }
}
