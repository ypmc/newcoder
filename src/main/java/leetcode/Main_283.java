package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_283 {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int l = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                l++;
            }
        }
        for (int i = 0; i < len - l; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                for (int j = i + 1; j < len; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[len - 1] = temp;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 3};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
