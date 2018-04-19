package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int val = nums.length % 2 == 1 ? nums[(nums.length - 1) / 2] : nums[nums.length / 2];
        TreeNode root = new TreeNode(val);
        int pos = nums.length % 2 == 1 ? (nums.length - 1) / 2 : nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, pos);
        int[] right = Arrays.copyOfRange(nums, pos + 1, nums.length);
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        return root;
    }

    public static void main(String[] args) {

    }
}
