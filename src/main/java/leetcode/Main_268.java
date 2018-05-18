package leetcode;

/**
 * @author kangkang lou
 */
public class Main_268 {
    public int missingNumber(int[] nums) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return (int) ((nums.length + 1) * nums.length / 2 - total);
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(new Main_268().missingNumber(arr));
    }
}
