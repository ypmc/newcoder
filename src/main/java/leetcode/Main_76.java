package leetcode;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_76 {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        if (s.equals(t)) {
            return t;
        }
        int start;
        int end;
        int index = 0;
        int a = 0;
        int b = 0;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int pos = t.indexOf(String.valueOf(c));
            if (pos > -1) {
                if (!map.containsKey(c)) {
                    index++;
                }
                map.put(c, i);

                if (index == t.length()) {
                    flag = true;
                    List<Integer> list = new ArrayList<>(map.values());
                    Collections.sort(list);
                    start = list.get(0);
                    end = list.get(map.size() - 1);
                    if (end - start < min) {
                        a = start;
                        b = end;
                        min = b - a;
                    }
                    if (end == s.length() - 1) {
                        break;
                    } else {
                        i = start + 1;
                        map = new LinkedHashMap<>();
                        index = 0;
                    }
                }
            }
        }
        if (!flag) {
            return "";
        } else {
            return s.substring(a, b + 1);
        }
    }

    public static void main(String[] args) {
        String S = "AA";
        String T = "AA";
        System.out.println(minWindow(S, T));
    }
}
