package leetcode;

/**
 * @author kangkang lou
 */
public class Main_326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0 || (n % 3 > 0 && n != 1)) {
            return false;
        }
        while (n > 0) {
            if (n == 1) {
                return true;
            }
            if (n % 3 == 0) {
                n /= 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Main_326().isPowerOfThree(25));
    }
}
