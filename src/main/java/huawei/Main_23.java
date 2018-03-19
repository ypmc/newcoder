package huawei;

/**
 * @author kangkang lou
 */

import java.util.*;

/**
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 */
public class Main_23 {
    static String delete(String str) {
        String result = str;
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0, len = str.length(); i < len; i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        boolean flag = false;
        int min = 0;
        Set<Character> set = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            int value = entry.getValue();
            if (!flag) {
                min = value;
                flag = true;
            }
            if (value < min) {
                min = value;
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                set.add(entry.getKey());
            }
        }

        for (Character c : set) {
            result = result.replaceAll(String.valueOf(c), "");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(delete(in.next()));
        }
    }
}
