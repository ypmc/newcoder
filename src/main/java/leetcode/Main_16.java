package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_16 {
    public static int threeSumClosest(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (Integer i : list) {
            if (Math.abs(i - target) < min) {
                min = Math.abs(i - target);
                result = i;
            }
        }
        return result;
    }

    public static int threeSumClosest0(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int sum;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - ans) > Math.abs(target - sum)) {
                    ans = sum;
                    if (ans == target) {
                        return ans;
                    }
                }
                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(arr, 1));
        System.out.println(threeSumClosest0(arr, 1));
    }
}
