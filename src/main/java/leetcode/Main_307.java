package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
class NumArray0 {
    int[] nums;
    int[] result;

    public NumArray0(int[] nums) {
        this.nums = nums;
        result = new int[nums.length];
        if(nums.length>0) {
            result[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result[i] = result[i - 1] + nums[i];
            }
        }
    }

    public void update(int i, int val) {
        for (int k = i; k < nums.length; k++) {
            result[k] -= nums[i];
            result[k] += val;
        }
        nums[i] = val;
    }

    public int sumRange(int i, int j) {
        return result[j] - result[i] + nums[i];
    }
}

public class Main_307 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        NumArray0 numArray0 = new NumArray0(arr);
        System.out.println(numArray0.sumRange(0, 2));
        numArray0.update(1, 2);
        System.out.println(numArray0.sumRange(0, 2));
    }
}
