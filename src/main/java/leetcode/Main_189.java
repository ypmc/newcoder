package leetcode;

/**
 * @author kangkang lou
 */
public class Main_189 {
    public void rotate(int[] nums, int k) {
        int index = 0;
        while (index < k) {
            move(nums);
            index++;
        }
    }

    void move(int[] nums) {
        int a = nums[nums.length - 1];
        for (int i = nums.length - 2; i >=0 ; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = a;
    }

    public static void main(String[] args) {

    }
}
