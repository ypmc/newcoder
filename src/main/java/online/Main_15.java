package online;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 动态规划，硬币组合
 */
public class Main_15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        coin(n);
    }

    private static void coin(int n) {
        int[] a = {1, 5, 10, 20, 50, 100};
        long[] dp = new long[n + 1];
        dp[0] = 1l;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= a[i]) {
                    dp[j] = dp[j] + dp[j - a[i]];
                }
            }
        }
        System.out.println(dp[n]);
    }
}
