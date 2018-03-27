package online;

/**
 * @author kangkang lou
 */

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * 给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
 */
public class Main_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            count(s);
        }
    }

    private static void count(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) == 2 && Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') {
                    System.out.println(c);
                    break;
                }
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }
}
