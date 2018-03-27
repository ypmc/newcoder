package online;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 网格路线
 */
public class Main_16 {
    static void line(int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            arr[i][0] = 1;
        }
        for (int j = 0; j <= n; j++) {
            arr[0][j] = 1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        System.out.println(arr[m][n]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            line(m, n);
        }
    }
}
