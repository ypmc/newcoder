package online;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 松鼠过河
 */
public class Main_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            jump(arr);
        }

    }

    public static void jump(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int endPosition = Math.min(i + arr[i], n);
            for (int j = i + 1; j <= endPosition; j++) {
                if (dp[j] == 0) {
                    dp[j] = dp[i] + 1;
                }
            }
            if (dp[n] != 0 || (arr[i] == 0 && dp[i] == 0)) {
                break;
            }
        }
        if (dp[n] != 0) {
            System.out.println(dp[n]);
        } else {
            System.out.println(-1);
        }
    }
}
