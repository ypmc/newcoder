package leetcode;

/**
 * @author kangkang lou
 */
public class Main_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int total = 0, start = 0;
        int min = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            while (total >= s) {
                min = Math.min(min, i - start + 1);
                total -= nums[start++];
            }
        }

        return min == nums.length + 1 ? 0 : min;
    }

    public static void main(String[] args) {

    }
}
