package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 将输入的两个字符串合并。
 * <p>
 * 对合并后的字符串进行排序，要求为：下标为奇数的字符和下标为偶数的字符分别从小到大排序。这里的下标意思是字符在字符串中的位置。
 * <p>
 * 对排序后的字符串进行操作，如果字符为‘0’——‘9’或者‘A’——‘F’或者‘a’——‘f’，则对他们所代表的16进制的数进行BIT倒序的操作，并转换为相应的大写字符。如字符为‘4’，为0100b，则翻转后为0010b，也就是2。转换后的字符为‘2’； 如字符为‘7’，为0111b，则翻转后为1110b，也就是e。转换后的字符为大写‘E’。
 */
public class Main_29 {
    static String process(String a, String b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        ArrayList<Character> odd = new ArrayList<>();
        ArrayList<Character> even = new ArrayList<>();
        String str = sb.toString();
        for (int i = 0, len = str.length(); i < len; i++) {
            if ((i + 1) % 2 == 0) {
                even.add(str.charAt(i));
            } else {
                odd.add(str.charAt(i));
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        StringBuilder stringBuilder = new StringBuilder();
        if (odd.size() <= even.size()) {
            for (int i = 0; i < odd.size(); i++) {
                stringBuilder.append(odd.get(i));
                stringBuilder.append(even.get(i));
            }
            if (odd.size() != even.size()) {
                stringBuilder.append(even.get(even.size() - 1));
            }
        } else {
            for (int i = 0; i < even.size(); i++) {
                stringBuilder.append(odd.get(i));
                stringBuilder.append(even.get(i));
            }
            stringBuilder.append(odd.get(odd.size() - 1));
        }
        String s = stringBuilder.toString();
        StringBuilder sb0 = new StringBuilder();
        for (int i = 0, len = s.length(); i < len; i++) {
            sb0.append(bit(s.charAt(i)));
        }
        return sb0.toString();
    }

    /**
     * 16进制内的数据处理，否则保持不变
     *
     * @param c
     * @return
     */
    static String bit(Character c) {
        if ((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') || (c >= '0' && c <= '9')) {
            Integer a = Integer.parseInt(String.valueOf(c), 16);
            String s = leftPadding(Integer.toBinaryString(a), 4);
            Integer b = Integer.parseInt(new StringBuilder(s).reverse().toString(), 2);
            return String.valueOf(Integer.toHexString(b)).toUpperCase();
        } else {
            return String.valueOf(c);
        }
    }

    static String leftPadding(String s, int len) {
        String str = "";
        for (int i = 0; i < len - s.length(); i++) {
            str += "0";
        }
        str += s;
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(process(a, b));
        }
    }

}
