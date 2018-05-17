package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author kangkang lou
 */
public class Main_290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new LinkedHashMap<>();
        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[i])) {
                    return false;
                } else {
                    continue;
                }
            } else {
                if (map.values().contains(arr[i])) {
                    return false;
                }else {
                    map.put(c, arr[i]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Main_290().wordPattern("abba", "dog dog dog dog"));
    }
}
