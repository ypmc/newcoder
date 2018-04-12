package leetcode;

/**
 * @author kangkang lou
 */

/**
 * 最长公共前缀字串
 */
public class Main_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        }
        if (strs.length == 0) {
            return "";
        }
        String s = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < s.length()) {
                s = strs[i];
            }
        }
        String str = "";
        boolean flag;
        for (int i = s.length(); i >= 0; i--) {
            flag = true;
            str = s.substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(str)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return str;
    }

    public static String longestCommonPrefix0(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int num = strs.length;
        int len = strs[0].length();

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < num; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
        String[] s = {"aa", "a"};
        System.out.println(longestCommonPrefix0(s));
    }
}
