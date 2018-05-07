package leetcode;

/**
 * @author kangkang lou
 */
public class Main_198 {
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[1], nums[0]);
        }
        int[] a = new int[nums.length + 1];
        a[0] = nums[0];
        a[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            a[i] = Math.max(a[i - 2] + nums[i], a[i - 1]);
        }
        return a[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2};
        System.out.println(rob(arr));
    }
}
