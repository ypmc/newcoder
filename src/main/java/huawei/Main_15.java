package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */
public class Main_15 {
    static int decimal2binary(int num) {
        int index = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                index++;
            }
            num = num / 2;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(decimal2binary(in.nextInt()));
        }
    }
}
