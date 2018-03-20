package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 * <p>
 * 计算最少出列多少位同学，使得剩下的同学排成合唱队形
 * <p>
 * 说明：
 * <p>
 * N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
 * 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
 * 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
 */

/**
 * 计算最少出列多少位同学，使得剩下的同学排成合唱队形
 * <p>
 * 说明：
 * <p>
 * N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
 * 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
 * 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
 */

/**
 * 最长上升子序列、最短下降子序列
 */
public class Main_24 {
    static int lis(int[] a) {
        int[] m = new int[a.length];
        for (int i = 0; i < m.length; i++) {
            m[i] = 1;
        }
        int[] seq = new int[a.length];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = -1;
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] > a[j]) {
                    if (m[i] < m[j] + 1) {
                        seq[i] = j;
                    }
                    m[i] = Math.max(m[j] + 1, m[i]);

                }

                if (m[i] > max) {
                    max = m[i];
                }
            }
        }

        int result = 0;
        for (int i = 0; i < m.length; i++) {
            result = Math.max(m[i], result);
        }

        return a.length - result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        int index = 0;
        while (index < num) {
            arr[index++] = in.nextInt();
        }
        System.out.println(lis(arr));
    }
}
