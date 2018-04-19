package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1, 0, m + n);
    }

    public static void main(String[] args) {

    }
}
