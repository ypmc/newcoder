package online;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 给定一个十进制的正整数number，选择从里面去掉一部分数字，希望保留下来的数字组成的正整数最大。
 */
public class Main_8 {
    static void split(String a, int b) {
        String s = a;
        char[] chars = a.toCharArray();
        char[] temp = Arrays.copyOfRange(chars, 0, b);
        for (int i = b; i < chars.length; i++) {
            f(temp, chars[i]);
        }

        for (int i = 0; i < b; i++) {
            if (s.indexOf(String.valueOf(temp[i])) != s.lastIndexOf(String.valueOf(temp[i]))) {
                chars[s.indexOf(String.valueOf(temp[i]))] = '#';
                s = new String(chars);
            } else {
                s = s.replaceAll(String.valueOf(temp[i]), "#");
            }
        }
        System.out.println(s.replaceAll("#", ""));
    }

    static void f(char[] chars, char c) {
        char max = chars[0];
        int index = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] > max) {
                max = chars[i];
                index = i;
            }
        }

        if (c < max) {
            chars[index] = c;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            int b = in.nextInt();
            split(a, b);
        }

    }
}
