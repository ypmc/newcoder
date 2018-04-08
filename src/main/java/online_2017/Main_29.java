package online_2017;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 最长连续字串
 */
public class Main_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            lis(s);
        }
    }

    private static void lis(String s) {
        int max_so_far = 1;
        int max = 0;
        int start = -1;
        int pos = 0;
        for (int i = 1; i < s.length(); i++) {

            if ((s.charAt(i) - s.charAt(i - 1)) == 1) {
                max_so_far += 1;
                if (start == -1) {
                    start = i - 1;
                }
            } else {
                max_so_far = 1;
                start = -1;
            }

            if (max < max_so_far) {
                max = max_so_far;
                pos = start;
            }
        }
        System.out.println(s.substring(pos, pos + max));
    }
}
