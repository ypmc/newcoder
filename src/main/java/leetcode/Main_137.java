package leetcode;

/**
 * @author kangkang lou
 */
public class Main_137 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int i = 0; i < nums.length; i++) {
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;

    }

    public static void main(String[] args) {
        System.out.println(8 ^ 8);
    }
}
