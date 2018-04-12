package leetcode;

/**
 * @author kangkang lou
 */
public class Main_53 {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max_ending = 0;
        int max = 0;
        int max_far = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max_far < nums[i]) {
                max_far = nums[i];
            }
            if (max_ending + nums[i] < 0) {
                max_ending = 0;
            } else {
                max_ending += nums[i];
            }

            if (max < max_ending) {
                max = max_ending;
            }
        }
        return max_far > 0 ? max : max_far;
    }

    public static int maxSubArray0(int[] A) {
        int maxSoFar = A[0], maxEndingHere = A[0];
        for (int i = 1; i < A.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray0(arr));
        int[] arr0 = {-9, -1, -3};
        System.out.println(maxSubArray(arr0));
        System.out.println(maxSubArray0(arr0));
        int[] arr1 = {-1, 1, -2};
        System.out.println(maxSubArray(arr1));
        System.out.println(maxSubArray0(arr1));
    }
}
