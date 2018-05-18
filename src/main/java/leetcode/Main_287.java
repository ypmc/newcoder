package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
