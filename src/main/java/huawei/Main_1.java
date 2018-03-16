package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            } else {
                index++;
            }
        }
        System.out.println(index);
    }
}