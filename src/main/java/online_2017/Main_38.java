package online_2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 暗黑字符串 动态规划
 */
public class Main_38 {
    static long dp(int n) {
        long[] arr = new long[n + 1];
        arr[1] = 3;
        arr[2] = 9;
        for (int i = 3; i <= n; i++) {
            arr[i] = 2 * arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(dp(i));
        }
        System.out.println(sb.toString().trim());
    }
}
