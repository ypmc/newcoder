package newcoder;

/**
 * @author kangkang lou
 */

/**
 * 最大子序列和
 */
public class GreatestSum {

    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = 0;
        int max_so_far = 0;
        int start = -1;
        int end = 0;
        int m = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
            if (max_so_far + array[i] < 0) {
                start = -1;
            } else {
                if (start == -1) {
                    start = i;
                }
                max_so_far = max_so_far + array[i];
            }

            if (max < max_so_far) {
                max = max_so_far;
                end = i;
            }
        }
        int sum = 0;
        if (start > -1) {
            for (int i = start; i <= end; i++) {
                sum += array[i];
                System.out.print(array[i] + " ");
            }
        } else {
            sum = m;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {-2, -8, -1, -5, -9};
        System.out.println(FindGreatestSumOfSubArray(array));
    }
}
