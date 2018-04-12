package leetcode;

/**
 * @author kangkang lou
 */

/**
 * 最长不重复子串
 */
public class Main_3 {
    public static int lengthOfLongestSubstring(String s) {
        int b = 0;
        int max = 0;
        if (s.length() == 1) {
            return 1;
        }
        for (int i = 1; i < s.length(); i++) {
            String temp = s.substring(b, i);
            String c = String.valueOf(s.charAt(i));
            //默认当前位置之前的子串都是不重复，如果当前位置之前的子串包含当前子串，则从包含的位置后面一位重新记录。
            if (temp.contains(String.valueOf(c))) {
                b = temp.indexOf(c) + 1 + b;
            }
            if (i - b + 1 > max) {
                max = i - b + 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abcdabcefbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
