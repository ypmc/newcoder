package leetcode;

/**
 * @author kangkang lou
 */
public class Main_29 {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if (dividend == 0) {
            return 0;
        }
        if (dividend == -2147483648) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
            if (divisor == 1) {
                return dividend;
            }
        }

        boolean flag = false;
        long m;
        long n;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0 || dividend < 0 && divisor < 0) {
            m = Math.abs((long) dividend);
            n = Math.abs((long) divisor);
            if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
                flag = true;
            }
        } else {
            m = dividend;
            n = divisor;
        }
        int result = (int) longDivide(m, n);
        return flag ? 0 - result : result;
    }

    private static long longDivide(long longDividend, long longDivisor) {
        if (longDividend < longDivisor) return 0;
        long sum = longDivisor;
        long multiple = 1;
        while ((sum + sum) <= longDividend) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + longDivide(longDividend - sum, longDivisor);
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 1));
        System.out.println(divide(-2147483648, -1));
        System.out.println(divide(2147483647, -1));
        System.out.println(divide(2147483647, 1));
        System.out.println(divide(-2147483648, 2));
        System.out.println(divide(-9, -3));
        System.out.println(divide(-1000000000, 1));
    }

}
