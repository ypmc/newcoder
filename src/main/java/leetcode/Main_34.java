package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_34 {
    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        boolean flag = false;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                flag = true;
                break;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int[] result = {-1, -1};
        if (flag) {
            int l = mid;
            int h = mid;
            while ((l - 1) >= 0 && nums[l - 1] == target) {
                l--;
            }
            while ((h + 1) < nums.length && nums[h + 1] == target) {
                h++;
            }
            result[0] = l;
            result[1] = h;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }
}
