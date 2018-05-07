package leetcode;

/**
 * @author kangkang lou
 */
public class Main_219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            int index = 1;
            while (index <= k && (index + i) < nums.length) {
                if (nums[i] == nums[i + index]) {
                    flag = true;
                    i = nums.length;
                    break;
                }
                index++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {99, 99};
        System.out.println(containsNearbyDuplicate(arr, 2));
    }
}
