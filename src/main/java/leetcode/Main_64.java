package leetcode;

/**
 * @author kangkang lou
 */
public class Main_64 {
    public static int minPathSum(int[][] grid) {
        int h = grid.length;
        int w = grid[0].length;
        int[][] r = new int[h][w];
        r[0][0] = grid[0][0];
        for (int i = 1; i < h; i++) {
            r[i][0] = r[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < w; j++) {
            r[0][j] = r[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                r[i][j] = Math.min(grid[i][j] + r[i - 1][j], grid[i][j] + r[i][j - 1]);
            }
        }

        return r[h - 1][w - 1];
    }

    public static void main(String[] args) {
        int[][] r = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(r));
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
