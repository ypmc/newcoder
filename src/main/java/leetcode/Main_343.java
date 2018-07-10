package leetcode;

/**
 * @author kangkang lou
 */
public class Main_343 {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int result = 1;
        while (n > 4) {
            result *= 3;
            n -= 3;
        }
        result *= n;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Main_343().integerBreak(11));
    }
}
