package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkang lou
 */
public class Main_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();
        for (int i = 0, j = ransomNote.length(); i < j; i++) {
            char c = ransomNote.charAt(i);
            if (a.containsKey(c)) {
                a.put(c, a.get(c) + 1);
            } else {
                a.put(c, 1);
            }
        }

        for (int i = 0, j = magazine.length(); i < j; i++) {
            char c = magazine.charAt(i);
            if (b.containsKey(c)) {
                b.put(c, b.get(c) + 1);
            } else {
                b.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : a.entrySet()) {
            if (!b.containsKey(entry.getKey())) {
                return false;
            }
            if (b.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Main_383().canConstruct("aa", "abb"));
    }
}
