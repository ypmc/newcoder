package leetcode;

/**
 * @author kangkang lou
 */
public class Main_152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, -5, -2, -4, 3};
        System.out.println(new Main_152().maxProduct(arr));
    }
}
