package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 最长上升子序列
 */
public class Main_77 {
    static int lis(int[] a) {
        int[] m = new int[a.length];
        for (int i = 0; i < m.length; i++) {
            m[i] = 1;
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] > a[j]) {
                    m[i] = Math.max(m[j] + 1, m[i]);
                }
                if (m[i] > max) {
                    max = m[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(lis(arr));
        }
    }
}
