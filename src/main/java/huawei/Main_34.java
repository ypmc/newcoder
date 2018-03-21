package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 蛇形矩阵
 */

/**
 * 1 3 6 10
 * 2 5 9
 * 4 8
 * 7
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
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    continue;
                } else {
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            print(in.nextInt());
        }
    }
}
