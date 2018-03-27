package online;

import java.util.Scanner;


/**
 * @author kangkang lou
 */

/**
 * 阶乘位数0的个数
 */
public class Main_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            find(n);
        }

    }

    private static void find(int n) {
        int index = 0;
        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0) {
                index++;
                tmp /= 5;
            }
        }
        System.out.println(index);
    }
}
