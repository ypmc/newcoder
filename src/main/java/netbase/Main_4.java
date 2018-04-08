package netbase;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 分类讨论下。
 * <p>
 * 显然，任意数和 4 的倍数相乘，其结果仍是 4 的倍数；
 * 显然，若存在任意数量 2 的倍数，两两之间乘起来就是 4 的倍数；
 * 如果存在一个数不是 2 的倍数，即它是一个奇数：
 * 放在 2 的倍数旁边，一定不符合要求；
 * 放在 4 的倍数旁边，相乘结果仍是 4 的倍数。
 * <p>
 * <p>
 * 因此符合要求的排列分两种情况：
 * <p>
 * 存在 2 的倍数，所有 2 的倍数相邻排列，需要一个 4 的倍数连接剩下的数，奇数最多和 4 的倍数数量相等，要求 countMod4 >= countOdd
 * 没有 2 的倍数，原本放 2 的倍数一端可以改放一个奇数，countMod4 >= countOdd - 1
 */
public class Main_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int n = in.nextInt();
                int a[] = new int[n];
                for (int j = 0; j < n; j++) {
                    a[j] = in.nextInt();
                }
                int mod4_num = 0, mod2_num = 0, odd = 0;
                for (int k = 0; k < a.length; k++) {
                    if (a[k] % 4 == 0) {
                        mod4_num++;
                    } else if (a[k] % 2 == 0) {
                        mod2_num++;
                    } else {
                        odd++;
                    }
                }
                if (mod2_num > 0) {
                    if (mod4_num >= odd) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    if (mod4_num >= (odd - 1)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }

    }
}
