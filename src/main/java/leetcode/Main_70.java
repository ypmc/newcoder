package leetcode;

/**
 * @author kangkang lou
 */
public class Main_70 {
    public static int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0)
            a = (b += a) - a;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
