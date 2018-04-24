package leetcode;

/**
 * @author kangkang lou
 */
public class Main_153 {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] arr0 = {0, 1, 2, 4, 5, 6, 7};
        int[] arr1 = {4, 5, 6, 7, 8, 1, 2};
        System.out.println(new Main_153().findMin(arr0));
        System.out.println(new Main_153().findMin(arr1));
    }
}
