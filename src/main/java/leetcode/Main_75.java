package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_75 {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void sortColors0(int[] A) {
        if (A == null || A.length < 2) return;
        int low = 0;
        int high = A.length - 1;
        for (int i = low; i <= high; ) {
            if (A[i] == 0) {
                swap(A, i, low);
                i++;
                low++;
            } else if (A[i] == 2) {
                swap(A, i, high);
                high--;
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 0, 1, 1};
        sortColors0(arr);
        System.out.println(Arrays.toString(arr));
    }
}
