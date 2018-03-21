package huawei;

/**
 * @author kangkang lou
 */

import java.util.*;

/**
 * 字符串加密
 */
public class Main_35 {
    static String encrypt(String key, String str) {
        ArrayList<Character> list = new ArrayList<>();
        String ori = "abcdefghijklmnopqrstuvwxyz";
        String old = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < key.length(); i++) {
            if (!list.contains(key.charAt(i))) {
                list.add(Character.toLowerCase(key.charAt(i)));
            }
            old = old.replaceAll(String.valueOf(Character.toLowerCase(key.charAt(i))), "");
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put((char) ('a' + i), list.get(i));
        }
        int index = list.size();
        for (int i = 0; i < old.length(); i++) {
            map.put(ori.charAt(i + index), old.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(map.get(c));
            } else {
                sb.append(Character.toUpperCase(map.get(c)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String key = in.nextLine();
            String str = in.nextLine();
            System.out.println(encrypt(key, str));
        }
    }
}
