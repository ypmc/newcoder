package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 连续1的个数
 */

/**
 * 最大上升子序列
 */
public class Main_66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(count(n));
        }
    }

    private static int count(int n) {
        String str = Integer.toBinaryString(n);
        int a = 0;
        int s = -1;
        int e = -1;
        int max = 0;
        for (int i = 0, len = str.length(); i < len; i++) {
            char t = str.charAt(i);
            if (t == '1') {
                a++;
                if (s == -1) {
                    s = i;
                }
            } else {
                a = 0;
                s = -1;
            }
            if (max < a) {
                max = a;
                e = i;
            }
        }
        return max;
    }
}
