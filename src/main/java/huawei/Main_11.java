package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * <p>
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class Main_11 {
    static String reverse(int num) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(num);
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.println(reverse(in.nextInt()));
        }
    }
}
