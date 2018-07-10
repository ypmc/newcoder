package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkang lou
 */
public class Main_389 {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();
        for (int i = 0, j = s.length(); i < j; i++) {
            char c = s.charAt(i);
            if (a.containsKey(c)) {
                a.put(c, a.get(c) + 1);
            } else {
                a.put(c, 1);
            }
        }
        for (int i = 0, j = t.length(); i < j; i++) {
            char c = t.charAt(i);
            if (b.containsKey(c)) {
                b.put(c, b.get(c) + 1);
            } else {
                b.put(c, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : b.entrySet()) {
            if (!a.containsKey(entry.getKey())) {
                return entry.getKey();
            }
            if (a.get(entry.getKey()) < entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';

    }

    public char findTheDifference0(String s, String t) {
        char charCode = t.charAt(s.length());
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) {
            charCode -= s.charAt(i);
            charCode += t.charAt(i);
        }
        return charCode;
    }

    public static void main(String[] args) {
        System.out.println(new Main_389().findTheDifference("abcd", "abcde"));
        System.out.println(new Main_389().findTheDifference("abcd", "aebcd"));
    }
}
