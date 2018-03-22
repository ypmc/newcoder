package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 递归
 * <p>
 * 放苹果分为两种情况，一种是有盘子为空，一种是每个盘子上都有苹果。
 * 令(m,n)表示将m个苹果放入n个盘子中的摆放方法总数。
 * 1.假设有一个盘子为空，则(m,n)问题转化为将m个苹果放在n-1个盘子上，即求得(m,n-1)即可
 * 2.假设所有盘子都装有苹果，则每个盘子上至少有一个苹果，即最多剩下m-n个苹果，问题转化为将m-n个苹果放到n个盘子上
 */
public class Main_49 {
    static int compute(int m, int n) {
        if (m < 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        return compute(m, n - 1) + compute(m - n, n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(compute(m, n));
        }
    }
}
