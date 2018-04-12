package leetcode;

/**
 * @author kangkang lou
 */
public class Main_50 {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        return (n % 2 == 0) ? myPow(x * x, n >>> 1) : x * myPow(x * x, n >>> 1);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0000, -2147483648));
        System.out.println(Math.pow(2.0, -2147483648));
    }
}
