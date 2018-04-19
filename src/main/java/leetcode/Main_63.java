package leetcode;

/**
 * @author kangkang lou
 */
public class Main_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h = obstacleGrid.length;
        int w = obstacleGrid[0].length;
        int[][] arr = new int[h][w];
        if (obstacleGrid[0][0] == 1 || obstacleGrid[h - 1][w - 1] == 1) {
            return 0;
        } else {
            arr[0][0] = 1;
        }
        int i;
        for (i = 1; i < h; i++) {
            if (obstacleGrid[i][0] != 1) {
                arr[i][0] = 1;
            } else {
                break;
            }
        }
        for (int m = i + 1; m < h; m++) {
            arr[m][0] = 0;
        }
        int j;
        for (j = 1; j < w; j++) {
            if (obstacleGrid[0][j] != 1) {
                arr[0][j] = 1;
            } else {
                break;
            }
        }
        for (int n = j + 1; n < w; n++) {
            arr[0][n] = 0;
        }

        for (i = 1; i < h; i++) {
            for (j = 1; j < w; j++) {
                if (obstacleGrid[i - 1][j] == 0 && obstacleGrid[i][j - 1] == 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                } else if (obstacleGrid[i - 1][j] == 0) {
                    arr[i][j] = arr[i - 1][j];
                } else if (obstacleGrid[i][j - 1] == 0) {
                    arr[i][j] = arr[i][j - 1];
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr[h - 1][w - 1];
    }

    public static void main(String[] args) {

    }
}
