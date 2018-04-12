package leetcode;

/**
 * @author kangkang lou
 */
public class Main_35 {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 2));
        System.out.println(searchInsert(arr, 0));
        System.out.println(searchInsert(arr, 9));
        System.out.println(searchInsert(arr, 4));
    }
}
