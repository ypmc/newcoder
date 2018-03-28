package online;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 数字反转
 */
public class Main_37 {
    static long rec(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(rec(rec(a) + rec(b)));
        }
    }
}
