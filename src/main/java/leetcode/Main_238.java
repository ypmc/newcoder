package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_238 {
    public static int[] productExceptSelf(int[] nums) {
        long value = 1;
        int index = 0;
        int pos = -1;
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                value *= nums[i];
            } else {
                index++;
                pos = i;
            }
        }
        if (index > 1) {
            return output;
        }
        if (index == 1) {
            output[pos] = (int) value;
            return output;
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = (int) (value / nums[i]);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        int[] a = {0, 0};
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }
}
