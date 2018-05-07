package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {

    }
}
