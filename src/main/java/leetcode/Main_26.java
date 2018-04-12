package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_26 {
    public int removeDuplicates(int[] nums) {
        boolean flag;
        int index = nums.length - 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                flag = false;
                for (int j = 0; j < i; j++) {
                    if (nums[i] == nums[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    for (int j = i; j < nums.length; j++) {
                        nums[j - 1] = nums[j];
                    }
                    nums[index--] = Integer.MAX_VALUE;
                    i--;
                }
            } else {
                break;
            }
        }
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    public int removeDuplicates0(int A[]) {
        if (A.length < 2) {
            return A.length;
        }
        int id = 1;
        for (int i = 1; i < A.length; ++i) {
            if (A[i] != A[i - 1]) {
                A[id++] = A[i];
            }
        }
        return id;
    }

    public int removeDuplicates1(int[] A) {
        if (A.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] != A[j]) A[++j] = A[i];
        return ++j;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(new Main_26().removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
        int[] arr0 = {1, 1, 2};
        System.out.println(new Main_26().removeDuplicates(arr0));
        System.out.println(Arrays.toString(arr0));
        int[] arr1 = {1, 1, 1};
        System.out.println(new Main_26().removeDuplicates(arr1));
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {4, 5, 5, 5, 5, 6};
        System.out.println(new Main_26().removeDuplicates0(arr2));
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {4, 5, 5, 5, 5, 6};
        System.out.println(new Main_26().removeDuplicates1(arr3));
        System.out.println(Arrays.toString(arr3));
    }
}
