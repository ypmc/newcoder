package newcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class MetrixTest {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int w = matrix.length;
        int h = matrix[0].length;
        int direction_index = 0;
        boolean[][] flag = new boolean[w][h];
        int i = 0, j = 0;
        int s = 0;
        int t = w * h;
        while (s < t) {
            if (direction_index == 0 && i > -1 && j > -1 && !flag[i][j]) {
                flag[i][j] = true;
                s++;
                list.add(matrix[i][j]);
                if (s == t)
                    break;
                if (j == h - 1 || flag[i][j + 1]) {
                    direction_index = 1;
                    i++;
                } else {
                    j++;
                }
            }
            if (direction_index == 1 && i > -1 && j > -1 && !flag[i][j]) {
                flag[i][j] = true;
                s++;
                list.add(matrix[i][j]);
                if (i == w - 1 || flag[i + 1][j]) {
                    direction_index = 2;
                    j--;
                } else {
                    i++;
                }
            }
            if (direction_index == 2 && i > -1 && j > -1 && !flag[i][j]) {
                flag[i][j] = true;
                s++;
                list.add(matrix[i][j]);
                if (j == 0 || flag[i][j - 1]) {
                    direction_index = 3;
                    i--;
                } else {
                    j--;
                }
            }
            if (direction_index == 3 && i > -1 && j > -1 && !flag[i][j]) {
                flag[i][j] = true;
                s++;
                list.add(matrix[i][j]);
                if (i == 0 || flag[i - 1][j]) {
                    direction_index = 0;
                    j++;
                } else {
                    i--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int index = 1;
        int[][] matrix = new int[5][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = index++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        List<Integer> list = printMatrix(matrix);
        System.out.println(list);


    }

}
