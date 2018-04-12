package leetcode;

/**
 * @author kangkang lou
 */
public class Main_48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        boolean[][] flag = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!flag[i][j]) {
                    int[] temp = new int[4];
                    temp[0] = matrix[i][j];

                    int a0 = Math.abs(n - 1 - i);
                    int b0 = j;
                    temp[1] = matrix[b0][a0];

                    int a1 = Math.abs(n - 1 - b0);
                    int b1 = a0;
                    temp[2] = matrix[b1][a1];

                    int a2 = Math.abs(n - 1 - b1);
                    int b2 = a1;
                    temp[3] = matrix[b2][a2];

                    matrix[b0][a0] = temp[0];
                    matrix[b1][a1] = temp[1];
                    matrix[b2][a2] = temp[2];
                    matrix[i][j] = temp[3];
                    flag[b0][a0] = true;
                    flag[b1][a1] = true;
                    flag[b2][a2] = true;
                    flag[i][j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] arr = {
//                {5, 1, 9, 11},
//                {2, 4, 8, 10},
//                {13, 3, 6, 7},
//                {15, 14, 12, 16}
//        };
        int[][] arr = {{1}};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
