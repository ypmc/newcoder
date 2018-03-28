package online;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 字串包含
 */
public class Main_50 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s0 = in.next();
            String s1 = in.next();
            int a = 0, b = 0;
            while (a < s0.length()) {
                if (b == s1.length()) {
                    break;
                }
                if (s0.charAt(a++) == s1.charAt(b)) {
                    b++;
                }
            }
            if (b == s1.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
