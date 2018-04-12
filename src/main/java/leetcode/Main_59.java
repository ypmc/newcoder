package leetcode;

/**
 * @author kangkang lou
 */
public class Main_59 {

    public static int[][] generateMatrix(int n) {
        boolean[][] flag = new boolean[n][n];
        int index = 1, i = 0, j = 0;
        int[][] matrix = new int[n][n];
        while (index <= n * n) {
            /**
             * 向右
             */
            while (j < n) {
                if (!flag[i][j]) {
                    matrix[i][j] = index++;
                    flag[i][j] = true;
                }
                /**
                 * 预检，是否已经需要转向
                 */
                if (j < n - 1 && !flag[i][j + 1]) {
                    j++;
                } else {
                    break;
                }
            }
            /**
             * 向下
             */
            while (i < n) {
                if (!flag[i][j]) {
                    matrix[i][j] = index++;
                    flag[i][j] = true;
                }
                /**
                 * 预检，是否已经需要转向
                 */
                if (i < n - 1 && !flag[i + 1][j]) {
                    i++;
                } else {
                    break;
                }
            }
            /**
             * 向左
             */
            while (j >= 0) {
                if (!flag[i][j]) {
                    matrix[i][j] = index++;
                    flag[i][j] = true;
                }
                /**
                 * 预检，是否已经需要转向
                 */
                if (j > 0 && !flag[i][j - 1]) {
                    j--;
                } else {
                    break;
                }
            }
            /**
             * 向上
             */
            while (i >= 0) {
                if (!flag[i][j]) {
                    matrix[i][j] = index++;
                    flag[i][j] = true;
                }
                /**
                 * 预检，是否已经需要转向
                 */
                if (i > 0 && !flag[i - 1][j]) {
                    i--;
                } else {
                    break;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr = generateMatrix(4);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
