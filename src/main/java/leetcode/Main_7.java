package leetcode;

/**
 * @author kangkang lou
 */
public class Main_7 {
    public int reverse(int x) {
        String s = String.valueOf(x);
        long r;
        if (x < 0) {
            r = 0 - Long.parseLong(new StringBuilder(s.substring(1)).reverse().toString());
        } else {
            r = Long.parseLong(new StringBuilder(s).reverse().toString());
        }

        if (r > Integer.MAX_VALUE || r < 0 - Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) r;
        }
    }

    public static void main(String[] args) {

    }
}
