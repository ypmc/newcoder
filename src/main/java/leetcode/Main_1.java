package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author kangkang lou
 */
public class Main_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int j = map.get(target - nums[i]);
                if (i != j) {
                    result[0] = i > j ? j : i;
                    result[1] = i > j ? i : j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
}
