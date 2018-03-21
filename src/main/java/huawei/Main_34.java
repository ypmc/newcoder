package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 蛇形矩阵
 */

/**
 * 1 3 6 10 15
 * 2 5 9 14
 * 4 8 13
 * 7 12
 * 11
 */
public class Main_34 {
    static void print(int n) {
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        if (n == 1) {
            System.out.println(arr[0][0]);
            return;
        }
        arr[1][0] = 2;
        arr[0][1] = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[i][j] != 0) {
                    continue;
                } else if (j == 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j] - arr[i - 2][j] + 1;
                } else if (i == 0) {
                    arr[i][j] = arr[i][j - 1] + arr[i][j - 1] - arr[i][j - 2] + 1;
                } else if (j == 1) {
                    arr[i][j] = arr[i][j - 1] + i + 2;
                } else {
                    arr[i][j] = arr[i][j - 1] + arr[i][j - 1] - arr[i][j - 2] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (j == n - i - 1) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            print(in.nextInt());
        }
    }
}
