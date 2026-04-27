 package LargeStrings;

import java.util.Random;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.text.DecimalFormat;


class main {
    public static void main(String[] args) {

        // Constructor 1
        StringBuffer sb1 = new StringBuffer();

        // Constructor 2
        StringBuffer sb2 = new StringBuffer("Himanshu Jaiswal");

        // Constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb1.append("WeMakeDev");
        sb1.append("is nice");
        // sb1.insert(3,"  Himanshu ");

        // sb1.replace(1,5,"kush");

        // sb1.delete(1,5);
        // sb1.reverse();

        String str = sb1.toString();
        // System.out.println(sb3);

        // System.out.println(sb2);

        // System.out.println(sb1.capacity());

        Random random = new Random();
        System.out.println(random.nextFloat());

        System.out.println((char)(97));

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        // Removing white spaces

        String sentence = " wr wr rth4 qw 3r";

        System.out.println(sentence.replaceAll("\\s", ""));

        // split

        String arr = "Kunal Himanshu rahul";
        String[] names = arr.split("");
        System.out.println(Arrays.toString(names));

        // Rounding Off

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.2));

    }
}