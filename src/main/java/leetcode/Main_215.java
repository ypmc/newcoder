package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {

    }
}
