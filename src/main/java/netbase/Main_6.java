package netbase;

import java.util.Scanner;
import java.lang.Math;
/**
 * @author kangkang lou
 */
public class Main_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; ++i) {
                arr[i] = in.nextInt();
            }
            if (len < 3) {
                System.out.println("0");
            } else {
                int[][] dp = new int[len][len];
                int[] acc = new int[len];
                dp[0][0] = 0 - Math.abs(arr[1] - arr[0]);
                for (int i = 1; i < len; ++i) {
                    acc[i] = acc[i - 1] + Math.abs(arr[i] - arr[i - 1]);
                    dp[i][i - 1] = acc[i - 1];
                    for (int j = 0; j < i - 1; ++j) {
                        dp[i][j] = dp[i - 1][j] + acc[i] - acc[i - 1];
                        dp[i][i - 1] = Math.min(dp[i][i - 1], dp[i - 1][j] + Math.abs(arr[i] - arr[j]));
                    }
                }
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < len - 1; ++j) {
                    min = Math.min(min, dp[len - 1][j]);
                }
                System.out.println(min);
            }
        }
    }
}
