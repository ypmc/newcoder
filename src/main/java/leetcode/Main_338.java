package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_338 {

    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            arr[i] = arr[i >> 1] + (i & 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main_338().countBits(6)));
    }
}
