package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */
public class Main_9 {
    static int newInt(int num) {
        String s = String.valueOf(num);
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!str.contains(String.valueOf(s.charAt(i)))) {
                str += String.valueOf(s.charAt(i));
            }
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(newInt(in.nextInt()));
        }
    }
}
