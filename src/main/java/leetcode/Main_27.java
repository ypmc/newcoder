package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_27 {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2};
        removeElement(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
