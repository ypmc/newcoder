package newcoder;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class LastRemaining {
    public static int LastRemaining_Solution(int n, int m) {
        boolean[] flag = new boolean[n];
        int i = n - 1;
        int start = 0;
        int index = (start + m - 1) % n;

        while (i > 0) {
            index = (start + m - 1) % n;
            if (!flag[index]) {
                flag[index] = true;
            } else {
                while (flag[index]) {
                    m = m + 1;
                    index = m % n;
                }
                flag[index] = true;
            }
            start = index + 1;
            i--;
            if (i == 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(flag));
        return index;
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5, 3));
        System.out.println(LastRemaining_Solution(5, 2));
    }
}
