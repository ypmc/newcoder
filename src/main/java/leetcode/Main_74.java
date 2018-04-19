package leetcode;

/**
 * @author kangkang lou
 */
public class Main_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int h = matrix.length;
        if (h == 0) {
            return false;
        }
        int w = matrix[0].length;
        int i = h - 1, j = 0;
        while (i >= 0 && j < w) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
