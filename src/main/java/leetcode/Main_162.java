package leetcode;

/**
 * @author kangkang lou
 */
public class Main_162 {

    public int findPeakElement(int[] nums) {
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
            if (i == nums.length - 2 && nums[i + 1] > nums[i]) {
                return nums.length - 1;
            }
        }
        return 0;
    }

    public int findPeakElement0(int[] num) {
        return helper(num, 0, num.length - 1);
    }

    public int helper(int[] num, int start, int end) {
        if (start == end) {
            return start;
        } else if (start + 1 == end) {
            if (num[start] > num[end]) return start;
            return end;
        } else {
            int m = (start + end) / 2;
            if (num[m] > num[m - 1] && num[m] > num[m + 1]) {
                return m;
            } else if (num[m - 1] > num[m] && num[m] > num[m + 1]) {
                return helper(num, start, m - 1);
            } else {
                return helper(num, m + 1, end);
            }

        }
    }

    public static void main(String[] args) {

    }
}
