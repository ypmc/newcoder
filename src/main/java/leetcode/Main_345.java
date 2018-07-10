package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kangkang lou
 */
public class Main_345 {
    public String reverseVowels(String s) {
        char[] arr = {'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
        List<Character> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);
        }
        Set<Integer> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (l.contains(c)) {
                set.add(i);
                list.add(0, c);
            }
        }
        int pos = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(i)) {
                sb.append(list.get(pos++));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Main_345().reverseVowels("aA"));
        System.out.println(new Main_345().reverseVowels("leetcode"));
    }
}
