package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 尼科彻斯定理
 * 对于数字n
 * 等差数列求和公式
 * 构造一个等差数列，数列的首项为(a×a-a+1),等差数列的差值为2(奇数数列)，则前a项的和为：
 * a×((a×a-a+1))+2×a(a-1)/2 = a * a * a
 */
public class Main_60 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            print(in.nextInt());
        }
    }

    private static void print(int i) {
        int a = i * i - i + 1;
        StringBuilder sb = new StringBuilder();
        for (int m = 0; m < i; m++) {
            if (m == i - 1) {
                sb.append(a + m * 2);
            } else {
                sb.append(a + m * 2);
                sb.append("+");
            }
        }
        System.out.println(sb.toString());
    }
}
