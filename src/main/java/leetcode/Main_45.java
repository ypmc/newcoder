package leetcode;

/**
 * @author kangkang lou
 */

/**
 * Greedy,贪心算法
 */
public class Main_45 {
    /**
     * 算法思想：贪心算法
     * 假设，我们要跳跃的范围是【curBegin,curEnd】，curFarthest表示在【curBegin,curEnd】范围内
     * 基于某个点所能到达的最远点，一旦到达边界点curEnd，则触发下一次跳跃。
     * 下次跳跃的边界修改为curFarthest。
     *
     * @param nums
     * @return
     */
    public static int jump(int[] nums) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (curFarthest == i + nums[i]) {
                System.out.print(i + " ");
            }
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        jump(arr);
    }
}
