package online_2017;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 圆上的优雅点个数
 */
public class Main_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            count(n);
        }
    }

    private static void count(int n) {
        int m = (int) Math.sqrt(n);
        int i = -m;
        int index = 0;
        while (i <= m) {
            if (isSqrt(n - i * i)) {
                if ((n - i * i) != 0) {
                    index += 2;
                } else {
                    index++;
                }
            }
            i++;
        }
        System.out.println(index);
    }

    static boolean isSqrt(int n) {
        int a = (int) Math.sqrt(n);
        return n - a * a == 0 ? true : false;
    }
}
