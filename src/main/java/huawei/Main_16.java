package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_16 {
    public static int getMaxValue(int[] val, int[] weight, int[] q, int n, int w) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (q[i - 1] == 0) {
                    // 主件
                    if (weight[i - 1] <= j) {
                        // 用j这么多钱去买 i 件商品 可以获得最大价值
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + val[i - 1]);
                    }
                } else {
                    //附件
                    if (weight[i - 1] + weight[q[i - 1]] <= j) {
                        //附件的话 加上主件一起算
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + val[i - 1]);
                    }
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt(); // 总钱数
            int m = input.nextInt(); // 商品个数
            int[] p = new int[m];
            int[] v = new int[m];
            int[] q = new int[m];
            for (int i = 0; i < m; i++) {
                p[i] = input.nextInt();        // 价格
                v[i] = input.nextInt() * p[i]; // 价值
                q[i] = input.nextInt();        // 主or附件
            }
            System.out.println(getMaxValue(v, p, q, m, n));
        }
    }
}
