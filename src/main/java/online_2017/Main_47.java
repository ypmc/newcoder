package online_2017;

/**
 * @author kangkang lou
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 幸运袋子
 */
public class Main_47 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(find(nums, 0, 0, 1));
        }
    }

    private static int find(int[] nums, int index, long sum, long multi) {
        int count = 0;
        for (int i = index; i < nums.length; i++) {
            sum += nums[i];
            multi *= nums[i];
            if (sum > multi)
                count += 1 + find(nums, i + 1, sum, multi);
            else if (nums[i] == 1)
                count += find(nums, i + 1, sum, multi);
            else
                break;
            sum -= nums[i];
            multi /= nums[i];
            while (i < nums.length - 1 && nums[i] == nums[i + 1])
                i++;
        }
        return count;
    }
}
