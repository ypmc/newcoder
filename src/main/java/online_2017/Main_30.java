package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int sum = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            find(arr, sum);
        }

    }

    private static void find(int[] arr, int sum) {
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = sum; j >= 0; j--) {
                if (j >= arr[i]) {
                    dp[j] += dp[j - arr[i]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
