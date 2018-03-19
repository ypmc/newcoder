package huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kangkang lou
 */

/**
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。
 * 从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 */
public class Main_17 {
    static String getFinalLocation(String str) {
        String[] strings = str.split(";");
        int i = 0, j = 0;
        for (String s : strings) {
            if (isValid(s)) {
                char c = s.charAt(0);
                int step = Integer.parseInt(s.replaceAll("[a-zA-Z]", ""));
                if (c == 'A') {
                    i -= step;
                } else if (c == 'D') {
                    i += step;
                } else if (c == 'S') {
                    j -= step;
                } else if (c == 'W') {
                    j += step;
                }
            }
        }
        return String.format("%s,%s", i, j);
    }

    static boolean isValid(String s) {
        Pattern p = Pattern.compile("^[A|D|S|W]\\d{1,2}");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(getFinalLocation(in.next()));
        }
    }
}
