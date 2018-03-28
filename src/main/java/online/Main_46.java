package online;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_46 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s0 = in.next();
            String s1 = in.next();
            count(s0, s1);
        }
    }

    private static void count(String s0, String s1) {
        int times = 0;
        for (int i = 0; i <= s0.length(); i++) {
            StringBuilder sb = new StringBuilder(s0);
            sb.insert(i,s1);
            if (isH(sb.toString())) {
                times++;
            }
        }
        System.out.println(times);
    }

    static boolean isH(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
