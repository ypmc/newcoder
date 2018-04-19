package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */

/**
 * 将数组看成一个整数，然后加1
 */
public class Main_66 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int step = 0;
        int temp;
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                temp = digits[i] + 1 + step;
            } else {
                temp = digits[i] + step;
            }
            digits[i] = temp % 10;
            step = temp / 10;
        }
        if (step > 0) {
            int[] arr = new int[len + 1];
            arr[0] = step;
            for (int i = 0; i < len; i++) {
                arr[i + 1] = digits[i];
            }
            return arr;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
