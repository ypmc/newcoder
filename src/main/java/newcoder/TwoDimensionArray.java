package newcoder;

/**
 * @author kangkang lou
 * <p>
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/**
 * 矩阵有序，从左下角开始，向上减少，向右增加
 */
public class TwoDimensionArray {
    public static boolean find(int target, int[][] array) {
        int h = array.length;
        int w = array[0].length;
        int i = h - 1;
        int j = 0;
        while (i >= 0 && j < w) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        find(5, arr);
    }

}
