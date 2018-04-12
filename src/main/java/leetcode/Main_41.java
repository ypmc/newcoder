package leetcode;

/**
 * @author kangkang lou
 */
public class Main_41 {
    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        int i;
        int max = nums[0];
        for (i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        boolean[] arr = new boolean[max + 1];

        for (i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr[0] = true;
            } else {
                arr[nums[i]] = true;
            }
        }
        int result = 0;
        for (i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                result = i;
                break;
            }
        }
        if (i == arr.length) {
            result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr0 = {1, 2, 0};
        int[] arr1 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr0));
        System.out.println(firstMissingPositive(arr1));
    }
}
