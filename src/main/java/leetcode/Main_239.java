package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 1) {
            return nums;
        }
        int max = Integer.MIN_VALUE;
        int[] arr = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        arr[0] = max;
        int index = 1;
        int pos = k;
        while (index <= nums.length - k) {
            if (nums[pos] < max) {
                arr[index] = max;
            } else {
                arr[index] = nums[pos];
                max = nums[pos];
            }
            pos++;
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(a, 3)));
    }
}
