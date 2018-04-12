package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        boolean[][] flag = new boolean[h][w];
        List<Integer> list = new ArrayList<>();
        int index = 0, i = 0, j = 0;
        while (index < h * w) {
            while (j < w  && !flag[i][j]) {
                list.add(matrix[i][j]);
                flag[i][j] = true;
                j++;
                index++;
                System.out.println("1"+" "+index);
            }
            j--;
            i++;
            while (i < h  && !flag[i][j]) {
                list.add(matrix[i][j]);
                flag[i][j] = true;
                i++;
                index++;
                System.out.println("2"+" "+index);

            }
            i--;
            j--;
            while ( j >= 0 && !flag[i][j]) {
                list.add(matrix[i][j]);
                flag[i][j] = true;
                j--;
                index++;
                System.out.println("3"+" "+index);

            }
            i--;
            j++;
            while (i >= 0  && !flag[i][j]) {
                list.add(matrix[i][j]);
                flag[i][j] = true;
                i--;
                index++;
                System.out.println("4"+" "+index);

            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr0 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(spiralOrder(arr0));
    }
}
