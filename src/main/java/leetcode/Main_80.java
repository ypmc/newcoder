package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_80 {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int n : nums) {
            if (index < 2 || n > nums[index - 2])
                nums[index++] = n;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
