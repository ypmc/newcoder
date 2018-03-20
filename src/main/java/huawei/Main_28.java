package huawei;

/**
 * @author kangkang lou
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 * <p>
 * 字符串加解密
 */

/**
 * 字符串加解密
 */

import java.util.Scanner;

/**
 * 1、对输入的字符串进行加解密，并输出。
 * 2加密方法为：
 * 当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 * 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
 * 其他字符不做变化。
 * 3、解密方法为加密的逆过程。
 */
public class Main_28 {
    static String encrypt(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = str.length(); i < len; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                if (c == '9') {
                    sb.append('0');
                } else {
                    sb.append((char) (c + 1));
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c == 'z') {
                    sb.append('A');
                } else {
                    sb.append(Character.toUpperCase((char) (c + 1)));
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (c == 'Z') {
                    sb.append('a');
                } else {
                    sb.append(Character.toLowerCase((char) (c + 1)));
                }
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }

    static String decrypt(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = str.length(); i < len; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                if (c == '0') {
                    sb.append('9');
                } else {
                    sb.append((char) (c - 1));
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c == 'a') {
                    sb.append('Z');
                } else {
                    sb.append(Character.toUpperCase((char) (c - 1)));
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (c == 'A') {
                    sb.append('z');
                } else {
                    sb.append(Character.toLowerCase((char) (c - 1)));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.println(encrypt(a));
            System.out.println(decrypt(b));
        }
    }
}
