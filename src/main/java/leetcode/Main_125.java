package leetcode;

/**
 * @author kangkang lou
 */
public class Main_125 {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (!isValid(s.charAt(start))) {
                start++;
                if (start == s.length()) {
                    break;
                }
            }
            while (!isValid(s.charAt(end))) {
                end--;
                if (end == -1) {
                    break;
                }
            }
            if (start == s.length()) {
                break;
            }
            if (end == -1) {
                break;
            }
            if (Character.toUpperCase(s.charAt(start)) != Character.toUpperCase(s.charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    private boolean isValid(char c) {
        char t = Character.toUpperCase(c);
        return t >= 'A' && t <= 'Z' || t >= '0' && t <= '9';
    }

    public static void main(String[] args) {
        System.out.println(new Main_125().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Main_125().isPalindrome("race a car"));
    }
}
