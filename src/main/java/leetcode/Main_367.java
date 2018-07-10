package leetcode;

/**
 * @author kangkang lou
 */
public class Main_367 {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a = (int) Math.sqrt(808201);
        System.out.println(a + " " + a * a);
        System.out.println(new Main_367().isPerfectSquare(5));
    }
}
