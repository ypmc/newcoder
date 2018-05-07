package leetcode;

/**
 * @author kangkang lou
 */
public class Main_168 {
    public static String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            char c = (char) (64 + (n % 26 > 0 ? n % 26 : 26));
            sb.append(c);
            n = (n - 1) / 26;
        }
        return sb.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }
}
