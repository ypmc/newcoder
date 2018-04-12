package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        int h = matrix.length;
        int w = matrix[0].length;
        boolean[][] flag = new boolean[h][w];

        int index = 0, i = 0, j = 0;
        while (index < h * w) {
            /**
             * 向右
             */
            while (j < w) {
                if (!flag[i][j]) {
                    list.add(matrix[i][j]);
                    flag[i][j] = true;
                    index++;
                }
                /**
                 * 预检，是否已经需要转向
                 */
                if (j < w - 1 && !flag[i][j + 1]) {
                    j++;
                } else {
                    break;
                }
            }
            /**
             * 向下
             */
            while (i < h) {
                if (!flag[i][j]) {
                    list.add(matrix[i][j]);
                    flag[i][j] = true;
                    index++;
                }
                /**
                 * 预检，是否已经需要转向
                 */
                if (i < h - 1 && !flag[i + 1][j]) {
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
                    list.add(matrix[i][j]);
                    flag[i][j] = true;
                    index++;
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
                    list.add(matrix[i][j]);
                    flag[i][j] = true;
                    index++;
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
        return list;
    }

    public static void main(String[] args) {
        int[][] arr0 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(spiralOrder(arr0));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(spiralOrder(arr1));
        int[][] arr2 = {{1, 2}, {3, 4}};
        System.out.println(spiralOrder(arr2));

    }
}
