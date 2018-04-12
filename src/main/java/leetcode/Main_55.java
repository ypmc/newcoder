package leetcode;

/**
 * @author kangkang lou
 */
public class Main_55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int last = n - 1, i;
        for (i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= last) last = i;
        }
        return last <= 0;
    }

    public boolean canJump0(int[] nums) {
        int maxLocation = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxLocation < i)
                return false; // if previous maxLocation smaller than i, meaning we cannot reach location i, thus return false.
            maxLocation = (i + nums[i]) > maxLocation ? i + nums[i] : maxLocation; // greedy:
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
