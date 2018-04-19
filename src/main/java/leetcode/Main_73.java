package leetcode;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author kangkang lou
 */
public class Main_73 {
    public static void setZeroes(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j] == 0) {
                    a.add(i);
                    b.add(j);
                }
            }
        }
        for (int i = 0; i < h; i++) {
            if (a.contains(i)) {
                for (int j = 0; j < w; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < w; j++) {
            if (b.contains(j)) {
                for (int i = 0; i < h; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] r = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};
        setZeroes(r);
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
