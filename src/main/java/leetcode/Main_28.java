package leetcode;

/**
 * @author kangkang lou
 */
public class Main_28 {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.equals("") && needle.equals("")) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int pos = 0;
        while (true) {
            while (i < haystack.length() && j < needle.length()) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                } else {
                    j = 0;
                    break;
                }
            }
            if (j == needle.length()) {
                break;
            }
            if (i >= haystack.length()) {
                break;
            }
            i = ++pos;
        }
        if (j == needle.length()) {
            return pos == haystack.length() ? -1 : pos;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
