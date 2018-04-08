package netbase;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            char pre;
            int a = 0;
            char cur;
            pre = s.charAt(0);
            int sum = 0;
            int index = 0;
            for (int i = 1; i < s.length(); i++) {
                cur = s.charAt(i);
                if (cur != pre) {
                    sum += (i - a);
                    index++;

                    a = i;
                    pre = cur;
                }
            }
            if (sum != s.length()) {
                index++;
            }
            System.out.println(String.format("%.2f", (float) s.length() / index));
        }
    }
}
