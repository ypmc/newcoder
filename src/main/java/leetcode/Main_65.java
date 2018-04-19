package leetcode;

/**
 * @author kangkang lou
 */
public class Main_65 {

    public static boolean isNumber(String s) {
        try {
            s = s.trim();
            int n = s.length();
            if (n == 0 || (s.charAt(n - 1) != '.' && (s.charAt(n - 1) - '0' < 0 || s.charAt(n - 1) - '0' > 9))) {
                return false;
            }
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isNumber("959440.94f"));
        System.out.println(Float.MAX_VALUE);
    }
}
