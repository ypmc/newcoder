package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 斐波那契变换
 */
public class Main_42 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(transform(n));
        }
    }

    private static long transform(int n) {
        long index = 0;
        long min;
        long max;
        while (fab(index) <= n) {
            index++;
        }
        min = fab(index - 1);
        max = fab(index);

        return Math.min(max - n, n - min);
    }

    static long fab(long n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        return fab(n - 1) + fab(n - 2);
    }
}
