package leetcode;

/**
 * @author kangkang lou
 */
public class Main_10 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int base = 1;
        while (x / base >= 10) {
            base *= 10;
        }

        while (x > 0) {
            int leftDigit = x / base;
            int rightDigit = x % 10;
            if (leftDigit != rightDigit) {
                return false;
            }

            x -= base * leftDigit;
            base /= 100;
            x /= 10;
        }

        return true;
    }

    public static boolean is(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int n = x;
        int index = 0;
        while (n > 0) {
            index++;
            n /= 10;
        }
        n = x;
        while (n > 0) {
            int a = n % 10;
            int b = (int) (n / Math.pow(10, index - 1));
            if (a != b) {
                return false;
            }
            n = n - a - (int) (b * Math.pow(10, index - 1));
            n /= 10;
            index -= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(is(10000021));
    }
}
