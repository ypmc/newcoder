package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 计算整数二进制中1的个数
 */
public class Main_50 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(number(in.nextInt()));
        }
    }

    private static int number(int n) {
        String str = Integer.toBinaryString(n);
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                index++;
            }
        }
        return index;
    }
}
