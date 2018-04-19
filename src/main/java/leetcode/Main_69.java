package leetcode;

/**
 * @author kangkang lou
 */
public class Main_69 {
    public static int mySqrt(int x) {
        if (x < 4) {
            return x == 0 ? 0 : 1;
        }
        int res = 2 * mySqrt(x / 4);
        if ((long)(res + 1) * (res + 1) <= (long)x) {
            return res + 1;
        } else {
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
        System.out.println(Math.sqrt(2147395600));
        System.out.println(46341 * 46341);
    }
}
