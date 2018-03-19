package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串
 */
public class Main_12 {
    static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(reverse(in.next()));
        }
    }
}
