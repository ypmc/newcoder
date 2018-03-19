package huawei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author kangkang lou
 */

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Main_4 {

    public static void splitPadding(String str) {
        if (str.equals("")) {
            return;
        }
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = str.length(); i < len; i++) {
            sb.append(str.charAt(i));
            if ((i + 1) % 8 == 0) {
                list.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        if (sb.toString().length() != 0) {
            int len = sb.toString().length();
            for (int i = 0; i < 8 - len; i++) {
                sb.append('0');
            }
            list.add(sb.toString());
        }

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = new String[2];
        input[0] = in.nextLine();
        input[1] = in.nextLine();
        splitPadding(input[0]);
        splitPadding(input[1]);
    }

}
