package leetcode;

/**
 * @author kangkang lou
 */
public class Main_154 {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end--;  //nums[mid]=nums[r] no idea, but we can eliminate nums[r];
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {

    }
}
