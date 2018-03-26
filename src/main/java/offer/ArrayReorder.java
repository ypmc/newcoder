package offer;

import java.util.Arrays;

/**
 * @author kangkang lou
 */

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ArrayReorder {
    public static void reOrderArray(int[] array) {
        int[] b = Arrays.copyOfRange(array, 0, array.length);
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 > 0) {
                array[index++] = b[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                array[index++] = b[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
