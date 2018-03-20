package huawei;

import java.util.*;

/**
 * @author kangkang lou
 * <p>
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * <p>
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * <p>
 * 如，输入： Type   输出： epTy
 * <p>
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * <p>
 * 如，输入： BabA   输出： aABb
 * <p>
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * <p>
 * 如，输入： By?e   输出： Be?y
 * <p>
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * <p>
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * <p>
 * 如，输入： Type   输出： epTy
 * <p>
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * <p>
 * 如，输入： BabA   输出： aABb
 * <p>
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * <p>
 * 如，输入： By?e   输出： Be?y
 */

/**
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * <p>
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * <p>
 * 如，输入： Type   输出： epTy
 * <p>
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * <p>
 * 如，输入： BabA   输出： aABb
 * <p>
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * <p>
 * 如，输入： By?e   输出： Be?y
 */

/**
 * 解题思路：
 * a、首先遍历字串，记录原有非字母的索引顺序，以备后续插入
 * b、将字符串中的非字母替换掉，然后进行排序
 * c、将原有非字母的字符插入排序后的字串中
 */
public class Main_26 {
    static String reorder(String str) {
        TreeMap<Integer, Character> map = new TreeMap<>();
        for (int i = 0, len = str.length(); i < len; i++) {
            map.put(i, str.charAt(i));
        }
        String s = str.replaceAll("[^a-zA-Z]", "");
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list, (o1, o2) -> {
            char c1 = Character.toLowerCase(o1);
            char c2 = Character.toLowerCase(o2);
            return c1 - c2;
        });

        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            char key = entry.getValue();
            if (!(key >= 'a' && key <= 'z' || key >= 'A' && key <= 'Z')) {
                list.add(entry.getKey(), key);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(character);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            System.out.println(reorder(in.nextLine()));
        }
    }
}
